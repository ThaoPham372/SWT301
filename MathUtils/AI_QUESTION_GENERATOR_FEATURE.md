# TÍNH NĂNG AI QUESTION GENERATOR

**Phiên bản:** 1.0  
**Ngày:** 13/01/2026  
**Mục đích:** Tự động sinh câu hỏi bằng AI để giảm thời gian tạo nội dung

---

## MỤC LỤC

1. [Tổng quan tính năng](#1-tổng-quan-tính-năng)
2. [Chức năng chi tiết](#2-chức-năng-chi-tiết)
3. [User Flow](#3-user-flow)
4. [Technical Requirements](#4-technical-requirements)
5. [Quality Control](#5-quality-control)
6. [Limitations & Best Practices](#6-limitations--best-practices)

---

## 1. TỔNG QUAN TÍNH NĂNG

### 1.1. Mục đích

**AI Question Generator** giúp:

- ✅ **Tạo câu hỏi tự động** từ đầu vào đơn giản
- ✅ **Tiết kiệm 80% thời gian** so với tạo thủ công
- ✅ **Đảm bảo chất lượng** với AI models chuyên biệt
- ✅ **Đa dạng hóa** ngân hàng câu hỏi
- ✅ **Scale nhanh** khi cần nhiều câu hỏi

### 1.2. AI Models sử dụng

**Các options:**

1. **OpenAI GPT-4** (Recommended)

   - Quality: Cao nhất
   - Cost: ~$0.03 / 1K tokens
   - Use case: Câu hỏi phức tạp, technical

2. **Google Gemini Pro**

   - Quality: Cao
   - Cost: Rẻ hơn GPT-4
   - Use case: General questions

3. **Claude (Anthropic)**

   - Quality: Cao
   - Cost: Tương đương GPT-4
   - Use case: Long-form, reasoning questions

4. **Custom Fine-tuned Model** (Phase 2)
   - Train trên data của platform
   - Cost: Infrastructure cost
   - Use case: Optimize cho domain cụ thể

---

## 2. CHỨC NĂNG CHI TIẾT

### 2.1. Ai có quyền sử dụng?

| Role                    | Permission   | Limit             |
| ----------------------- | ------------ | ----------------- |
| **Admin**               | Full access  | Unlimited         |
| **Chuyên gia nội dung** | Full access  | 100 questions/day |
| **Người học**           | ❌ No access | -                 |
| **Nhà tuyển dụng**      | ❌ No access | -                 |
| **Mentor**              | ❌ No access | -                 |

---

### 2.2. CN-AI-001: Generate Questions từ Topic

**Input parameters:**

```json
{
  "topic": "Python OOP - Object Oriented Programming",
  "category": "Programming > Python",
  "difficulty": "medium",
  "num_questions": 10,
  "question_types": ["single_choice", "multiple_choice", "true_false"],
  "include_explanation": true,
  "language": "vi"
}
```

**Options chi tiết:**

**1. Topic (Required)**

- Mô tả ngắn về chủ đề
- VD: "Python Functions and Lambda"
- VD: "CSS Flexbox Layout"
- VD: "Marketing Strategy Basics"

**2. Category (Required)**

- Chọn từ danh sách categories có sẵn
- VD: "Programming > Python > Advanced"

**3. Difficulty (Required)**

- `easy`: Beginner level
- `medium`: Intermediate
- `hard`: Advanced
- `mixed`: AI tự mix các độ khó

**4. Number of Questions (Required)**

- Min: 5 câu
- Max: 50 câu (1 lần generate)
- Recommendation: 10-20 câu

**5. Question Types (Required)**

- `single_choice`: Trắc nghiệm 1 đáp án
- `multiple_choice`: Trắc nghiệm nhiều đáp án
- `true_false`: Đúng/Sai
- `fill_blank`: Điền vào chỗ trống
- `matching`: Nối cột
- `code_challenge`: Code challenge (chỉ Programming)

**6. Include Explanation**

- `true`: Tạo giải thích cho mỗi câu
- `false`: Chỉ tạo câu hỏi + đáp án

**7. Language**

- `vi`: Tiếng Việt
- `en`: English (Phase 2)

**8. Additional Context (Optional)**

```
Free text để AI hiểu rõ hơn:
"Focus on practical examples.
Target audience: Junior developers with 0-1 year experience.
Include real-world scenarios."
```

---

**Output example:**

```json
{
  "generated_questions": [
    {
      "question_text": "Trong Python OOP, phương thức nào được gọi khi tạo một object mới?",
      "question_type": "single_choice",
      "difficulty": "medium",
      "answers": [
        {
          "text": "__init__()",
          "is_correct": true
        },
        {
          "text": "__new__()",
          "is_correct": false
        },
        {
          "text": "__create__()",
          "is_correct": false
        },
        {
          "text": "__start__()",
          "is_correct": false
        }
      ],
      "explanation": "__init__() là constructor method, được gọi tự động sau khi object được tạo bởi __new__(). Đây là nơi khởi tạo các attributes của object.",
      "tags": ["python", "oop", "constructor"],
      "estimated_time_seconds": 30
    },
    {
      "question_text": "Kỹ thuật nào cho phép một class kế thừa từ nhiều class cha?",
      "question_type": "single_choice",
      "difficulty": "medium",
      "answers": [
        {
          "text": "Multiple Inheritance",
          "is_correct": true
        },
        {
          "text": "Single Inheritance",
          "is_correct": false
        },
        {
          "text": "Polymorphism",
          "is_correct": false
        },
        {
          "text": "Encapsulation",
          "is_correct": false
        }
      ],
      "explanation": "Multiple Inheritance cho phép một class kế thừa từ nhiều class cha. Python hỗ trợ tính năng này, nhưng cần cẩn thận với Diamond Problem.",
      "tags": ["python", "oop", "inheritance"],
      "estimated_time_seconds": 30
    }
  ],
  "total_generated": 10,
  "generation_time_ms": 3500,
  "cost_usd": 0.025,
  "model_used": "gpt-4-turbo"
}
```

---

### 2.3. CN-AI-002: Generate Questions từ Content/Document

**Use case:** Upload tài liệu (PDF, Word, Text) → AI đọc và tạo câu hỏi

**Input:**

```json
{
  "content_source": "upload",
  "file": "python_oop_tutorial.pdf",
  "OR": {
    "content_text": "Paste nội dung text vào đây...",
    "content_url": "https://docs.python.org/3/tutorial/classes.html"
  },
  "num_questions": 20,
  "difficulty": "mixed",
  "question_types": ["single_choice", "multiple_choice"],
  "focus_sections": ["Classes", "Inheritance", "Methods"]
}
```

**Features:**

- AI đọc và hiểu nội dung
- Extract key concepts
- Generate questions based on content
- Đảm bảo câu hỏi cover các phần quan trọng

**Supported formats:**

- PDF (max 10MB)
- Word (.docx)
- Text (.txt)
- Markdown (.md)
- HTML (URL)

---

### 2.4. CN-AI-003: Generate Variations (Variants)

**Use case:** Có 1 câu hỏi tốt → Tạo 5-10 biến thể tương tự

**Input:**

```json
{
  "original_question_id": "q-12345",
  "num_variants": 5,
  "variation_level": "medium",
  "keep_difficulty": true
}
```

**Variation Levels:**

1. **Low variation**

   - Chỉ đổi con số, tên biến
   - VD: "Python có bao nhiêu data types?" → "Python có bao nhiêu built-in types?"

2. **Medium variation**

   - Đổi cách diễn đạt, ví dụ
   - Giữ concept giống nhau
   - VD: "**init** dùng để làm gì?" → "Phương thức nào khởi tạo object?"

3. **High variation**
   - Đổi góc nhìn câu hỏi
   - VD: "List là gì?" → "Điểm khác biệt giữa List và Tuple?"

**Output:**

- 5 câu hỏi mới tương tự câu gốc
- Tự động thêm vào question bank
- Link với câu gốc để tracking

---

### 2.5. CN-AI-004: Generate Code Challenge

**Use case:** Tạo bài tập code với test cases tự động

**Input:**

```json
{
  "programming_language": "python",
  "topic": "Algorithms - Sorting",
  "difficulty": "medium",
  "num_challenges": 3,
  "include_hints": true,
  "include_solution": true
}
```

**Output example:**

```json
{
  "challenge": {
    "title": "Sắp xếp mảng sử dụng Quick Sort",
    "description": "Viết hàm quicksort(arr) để sắp xếp mảng số nguyên tăng dần.\n\nYêu cầu:\n- Implement Quick Sort algorithm\n- Time complexity: O(n log n) average case\n- In-place sorting",

    "starter_code": "def quicksort(arr):\n    # Your code here\n    pass",

    "test_cases": [
      {
        "input": "[3, 6, 8, 10, 1, 2, 1]",
        "expected_output": "[1, 1, 2, 3, 6, 8, 10]",
        "is_hidden": false
      },
      {
        "input": "[]",
        "expected_output": "[]",
        "is_hidden": false
      },
      {
        "input": "[1]",
        "expected_output": "[1]",
        "is_hidden": false
      },
      {
        "input": "[100, 1, 50, 25, 75, 30]",
        "expected_output": "[1, 25, 30, 50, 75, 100]",
        "is_hidden": true
      }
    ],

    "hints": [
      "Chọn pivot element (thường là phần tử cuối)",
      "Partition array thành 2 phần: nhỏ hơn và lớn hơn pivot",
      "Đệ quy sort 2 phần"
    ],

    "solution": "def quicksort(arr):\n    if len(arr) <= 1:\n        return arr\n    pivot = arr[-1]\n    left = [x for x in arr[:-1] if x <= pivot]\n    right = [x for x in arr[:-1] if x > pivot]\n    return quicksort(left) + [pivot] + quicksort(right)",

    "difficulty": "medium",
    "estimated_time_minutes": 20,
    "points": 10
  }
}
```

---

### 2.6. CN-AI-005: Bulk Generate cho toàn bộ Roadmap

**Use case:** Tạo tất cả câu hỏi cho 1 roadmap (ví dụ: Python Developer Roadmap)

**Input:**

```json
{
  "roadmap_id": "roadmap-python-dev",
  "auto_generate_all": true,
  "questions_per_milestone": 30,
  "difficulty_distribution": {
    "easy": 40,
    "medium": 40,
    "hard": 20
  },
  "question_type_distribution": {
    "single_choice": 50,
    "multiple_choice": 20,
    "true_false": 15,
    "code_challenge": 15
  }
}
```

**Process:**

```
1. Đọc roadmap structure (3 milestones)
2. Cho mỗi milestone:
   - Đọc skills cần đạt
   - Generate 30 câu hỏi cover các skills
   - Mix độ khó theo distribution
3. Total: 90 câu hỏi cho cả roadmap
4. Tự động tạo tests cho từng milestone
5. Submit for admin review
```

**Timeline:**

- 90 câu hỏi: ~10-15 phút (AI generation)
- Cost: ~$2-3 USD (sử dụng GPT-4)

---

### 2.7. CN-AI-006: AI Review & Improve Questions

**Use case:** AI review câu hỏi do người tạo, đề xuất cải thiện

**Input:**

```json
{
  "question_id": "q-12345",
  "review_aspects": [
    "clarity",
    "difficulty_accuracy",
    "answer_correctness",
    "distractor_quality",
    "explanation_completeness"
  ]
}
```

**Output:**

```json
{
  "review_result": {
    "overall_score": 7.5,
    "clarity_score": 8,
    "suggestions": [
      {
        "aspect": "clarity",
        "issue": "Câu hỏi hơi mơ hồ",
        "suggestion": "Thêm context cụ thể: 'Trong Python 3.x, phương thức nào...'"
      },
      {
        "aspect": "distractor_quality",
        "issue": "Đáp án B quá dễ loại trừ",
        "suggestion": "Thay '__create__()' bằng '__call__()' để confusing hơn"
      },
      {
        "aspect": "explanation",
        "issue": "Giải thích thiếu ví dụ",
        "suggestion": "Thêm code example:\nclass MyClass:\n    def __init__(self):\n        self.value = 10"
      }
    ],
    "improved_question": {
      "question_text": "Trong Python 3.x, khi tạo một object mới từ class, phương thức nào được gọi để khởi tạo attributes?",
      "answers": [
        { "text": "__init__()", "is_correct": true },
        { "text": "__new__()", "is_correct": false },
        { "text": "__call__()", "is_correct": false },
        { "text": "__post_init__()", "is_correct": false }
      ],
      "explanation": "__init__() là constructor method...\n\nVí dụ:\nclass Person:\n    def __init__(self, name):\n        self.name = name\n\np = Person('Alice')  # __init__ được gọi tự động"
    }
  }
}
```

---

## 3. USER FLOW

### 3.1. Flow 1: Generate từ Topic (Most Common)

```
┌─────────────────────────────┐
│ Chuyên gia nội dung         │
│ Click "AI Generate"         │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Form: Nhập parameters       │
│ - Topic: "Python Functions" │
│ - Category: Programming     │
│ - Difficulty: Medium        │
│ - Num questions: 20         │
│ - Question types: ☑️ Multi  │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Click "Generate"            │
│ Loading... (10-30s)         │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ AI generates 20 questions   │
│ Cost: $0.15 USD             │
│ Time: 15 seconds            │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Preview Generated Questions │
│                             │
│ Q1: [Preview]               │
│ Q2: [Preview]               │
│ ...                         │
│                             │
│ Actions:                    │
│ ☑️ Select all (20)          │
│ ☐ Q1 ☑️ Q2 ☑️ Q3 ...        │
└──────────┬──────────────────┘
           │
      ┌────┴─────┐
      │          │
      ↓          ↓
┌──────────┐ ┌──────────┐
│  Edit    │ │ Delete   │
│  Q3      │ │  Q15     │
└────┬─────┘ └─────┬────┘
     │             │
     └──────┬──────┘
            │
            ↓
┌─────────────────────────────┐
│ Save to Question Bank       │
│ Status: Draft               │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Submit for Review (Admin)   │
└─────────────────────────────┘
```

---

### 3.2. Flow 2: Generate từ Document

```
┌─────────────────────────────┐
│ Upload Document             │
│ "python_oop.pdf" (2.3MB)    │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ AI reads & analyzes         │
│ - Detected topics           │
│ - Key concepts extracted    │
│ - 150 pages, 30 sections    │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Select sections to focus    │
│ ☑️ Chapter 3: Inheritance   │
│ ☑️ Chapter 5: Polymorphism  │
│ ☐ Chapter 7: Advanced       │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Set parameters              │
│ - 30 questions              │
│ - Mixed difficulty          │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Generate (takes 30-60s)     │
│ Progress: ████░░░░ 60%      │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Review & Save               │
└─────────────────────────────┘
```

---

### 3.3. Flow 3: Bulk Generate cho Roadmap

```
┌─────────────────────────────┐
│ Go to Roadmap Editor        │
│ "Python Developer Roadmap"  │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Click "Auto-generate Tests" │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ AI analyzes roadmap:        │
│ - 5 Milestones detected     │
│ - 25 Skills identified      │
│                             │
│ Proposed plan:              │
│ Milestone 1: 30 questions   │
│ Milestone 2: 35 questions   │
│ Milestone 3: 40 questions   │
│ ...                         │
│ Total: 180 questions        │
│                             │
│ Estimated:                  │
│ - Time: 20 minutes          │
│ - Cost: $5 USD              │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Confirm & Start             │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ Generation Progress:        │
│                             │
│ ✅ Milestone 1: 30/30       │
│ ⏳ Milestone 2: 15/35       │
│ ⏸️ Milestone 3: 0/40        │
│                             │
│ Overall: ████████░░ 45/180  │
│                             │
│ [Cancel] [Pause]            │
└──────────┬──────────────────┘
           │
           ↓
┌─────────────────────────────┐
│ ✅ Complete!                │
│ 180 questions generated     │
│ 5 tests created             │
│                             │
│ Next: Review & Publish      │
└─────────────────────────────┘
```

---

## 4. TECHNICAL REQUIREMENTS

### 4.1. API Integration

**Endpoint:**

```
POST /api/v1/ai/generate-questions
```

**Request:**

```json
{
  "topic": "Python OOP",
  "category_id": "cat-123",
  "difficulty": "medium",
  "num_questions": 10,
  "question_types": ["single_choice", "multiple_choice"],
  "include_explanation": true,
  "language": "vi",
  "additional_context": "Focus on practical examples"
}
```

**Response:**

```json
{
  "success": true,
  "job_id": "gen-job-789",
  "status": "processing",
  "estimated_time_seconds": 20
}
```

**Check status:**

```
GET /api/v1/ai/generate-questions/gen-job-789
```

**Response:**

```json
{
  "job_id": "gen-job-789",
  "status": "completed",
  "generated_questions": [...],
  "total_generated": 10,
  "generation_time_ms": 15000,
  "cost_usd": 0.025
}
```

---

### 4.2. System Architecture

```
┌─────────────┐
│  Frontend   │
│  (React)    │
└──────┬──────┘
       │
       │ HTTP Request
       │
       ↓
┌─────────────────────┐
│   Backend API       │
│   (Node.js/Python)  │
└──────┬──────────────┘
       │
       │ Queue Job
       │
       ↓
┌─────────────────────┐
│  Job Queue          │
│  (Redis/RabbitMQ)   │
└──────┬──────────────┘
       │
       │ Process
       │
       ↓
┌─────────────────────┐
│  AI Worker          │
│  (Python)           │
└──────┬──────────────┘
       │
       │ API Call
       │
       ↓
┌─────────────────────┐
│  OpenAI API         │
│  (GPT-4)            │
└──────┬──────────────┘
       │
       │ Response
       │
       ↓
┌─────────────────────┐
│  Post-processing    │
│  - Validate         │
│  - Format           │
│  - Save to DB       │
└─────────────────────┘
```

---

### 4.3. Prompt Engineering

**System Prompt template:**

```
You are an expert question generator for an educational assessment platform.

Your task: Generate {num_questions} high-quality multiple-choice questions about "{topic}".

Requirements:
- Difficulty level: {difficulty}
- Language: Vietnamese
- Question types: {question_types}
- Each question must have:
  * Clear, unambiguous question text
  * 4 answer options (1 correct, 3 distractors)
  * Distractors should be plausible but clearly wrong
  * Detailed explanation (2-3 sentences)
  * Relevant tags

Format your response as JSON array:
[
  {
    "question_text": "...",
    "question_type": "single_choice",
    "difficulty": "medium",
    "answers": [
      {"text": "...", "is_correct": true},
      {"text": "...", "is_correct": false},
      ...
    ],
    "explanation": "...",
    "tags": ["tag1", "tag2"]
  }
]

Focus on: {additional_context}

Generate questions that test:
- Understanding of concepts (40%)
- Application of knowledge (40%)
- Analysis/problem-solving (20%)

Avoid:
- Trick questions
- Questions requiring memorization of trivia
- Ambiguous wording
- Questions with multiple possible correct answers
```

---

### 4.4. Cost Management

**Pricing (OpenAI GPT-4):**

| Action               | Input Tokens | Output Tokens | Cost   |
| -------------------- | ------------ | ------------- | ------ |
| 1 câu hỏi đơn giản   | ~200         | ~150          | $0.008 |
| 1 câu code challenge | ~300         | ~500          | $0.025 |
| 10 câu trắc nghiệm   | ~500         | ~1500         | $0.075 |
| 50 câu mixed         | ~1000        | ~5000         | $0.30  |

**Monthly budget estimate:**

- 1000 câu/tháng: ~$75 USD
- 5000 câu/tháng: ~$350 USD

**Cost optimization:**

1. Cache common prompts
2. Batch requests khi có thể
3. Use cheaper models (GPT-3.5) cho easy questions
4. Daily limit per user: 100 questions

---

## 5. QUALITY CONTROL

### 5.1. Validation Pipeline

**Step 1: AI Generation**

```
AI tạo 10 câu hỏi
```

**Step 2: Automated Checks**

```
✓ JSON format valid?
✓ All required fields present?
✓ Number of answers = 4?
✓ Exactly 1 correct answer?
✓ No duplicate questions?
✓ Question length: 20-200 chars?
✓ Explanation length: 50-500 chars?
```

**Step 3: Quality Scoring**

```
AI tự đánh giá chất lượng câu hỏi:
- Clarity score: 8/10
- Difficulty accuracy: 7/10
- Distractor quality: 9/10

Overall: 8/10 → PASS
```

**Step 4: Human Review**

```
Chuyên gia/Admin review
- Approve: 8 câu
- Edit: 1 câu (fix typo)
- Reject: 1 câu (too confusing)
```

---

### 5.2. Quality Metrics to Track

**Metrics:**

1. **Generation Accuracy**

   - % câu hỏi valid format
   - % câu pass automated checks
   - Target: ≥95%

2. **Human Approval Rate**

   - % câu được approve sau review
   - Target: ≥80%

3. **Student Performance**

   - Average score on AI-generated questions
   - Pass rate
   - Compare với hand-crafted questions

4. **Feedback Score**
   - Student ratings (1-5 sao)
   - "Báo cáo câu hỏi" rate
   - Target: ≥4.0/5

---

### 5.3. Continuous Improvement

**Feedback Loop:**

```
1. AI generates questions
2. Students take tests
3. Collect data:
   - Pass rate per question
   - Time spent per question
   - Skip rate
   - Flag rate
4. Analyze patterns:
   - Which questions too easy/hard?
   - Which confusing?
5. Retrain AI với feedback data
6. Improve prompts
7. Repeat
```

---

## 6. LIMITATIONS & BEST PRACTICES

### 6.1. Limitations

**AI Generation KHÔNG phù hợp cho:**

❌ **Câu hỏi yêu cầu kiến thức real-time**

- VD: "Framework React mới nhất version nào?" (AI có thể outdated)
- **Solution**: Human update manually

❌ **Câu hỏi về company-specific context**

- VD: "Policy X của công ty chúng ta là gì?"
- **Solution**: Chỉ tạo general questions

❌ **Câu hỏi cần judgment phức tạp**

- VD: "Giải pháp tốt nhất trong tình huống Y?"
- **Solution**: Human review carefully

❌ **Câu hỏi images-heavy**

- VD: Nhận diện diagram, charts (AI multimodal chưa perfect)
- **Solution**: Use AI with vision models (GPT-4V) hoặc human-created

---

### 6.2. Best Practices

✅ **DO:**

1. **Start with clear topic**

   - Good: "Python List Comprehension - Advanced Usage"
   - Bad: "Python stuff"

2. **Provide context**

   - "Target: Junior developers, 0-1 year experience"
   - "Focus: Practical examples over theory"

3. **Review before publishing**

   - Always human review AI-generated content
   - Edit for clarity, accuracy

4. **Mix AI + Human questions**

   - 70% AI-generated (base questions)
   - 30% Human-crafted (edge cases, creative)

5. **Track performance**

   - Monitor student feedback
   - A/B test AI vs human questions

6. **Iterate prompts**
   - If quality not good → tweak prompt
   - Add examples to prompt

---

❌ **DON'T:**

1. **Don't blindly trust AI**

   - Always review critical questions
   - Especially for certification exams

2. **Don't over-generate**

   - Quality > Quantity
   - 20 good questions > 100 mediocre

3. **Don't skip validation**

   - Run automated checks
   - Human spot-check sample

4. **Don't ignore feedback**

   - If students report issues → investigate
   - Fix or remove bad questions

5. **Don't forget cost**
   - Monitor API usage
   - Set daily limits

---

### 6.3. Recommended Workflow

**Week 1: Setup**

```
1. Define topics/categories
2. Write good prompt templates
3. Test với 10-20 câu
4. Review quality
5. Adjust prompts
```

**Week 2-3: Bulk Generation**

```
1. Generate 200-300 câu cho toàn roadmap
2. Human review: 2-3 people
3. Fix issues
4. Publish top 70% quality
5. Iterate bottom 30%
```

**Week 4+: Maintenance**

```
1. Monitor student feedback
2. Replace low-performing questions
3. Generate new batches monthly
4. A/B test improvements
```

---

## 7. PHÂN QUYỀN CHI TIẾT

### 7.1. Matrix quyền AI Generator

| Action                    | Admin | Chuyên gia | Người học | NTD | Mentor |
| ------------------------- | :---: | :--------: | :-------: | :-: | :----: |
| Generate từ topic         |  ✅   |     ✅     |    ❌     | ❌  |   ❌   |
| Generate từ document      |  ✅   |     ✅     |    ❌     | ❌  |   ❌   |
| Generate variations       |  ✅   |     ✅     |    ❌     | ❌  |   ❌   |
| Bulk generate roadmap     |  ✅   |  ✅ (own)  |    ❌     | ❌  |   ❌   |
| AI review questions       |  ✅   |     ✅     |    ❌     | ❌  |   ❌   |
| View generation cost      |  ✅   |  ✅ (own)  |    ❌     | ❌  |   ❌   |
| Set daily limit           |  ✅   |     ❌     |    ❌     | ❌  |   ❌   |
| View all AI-gen questions |  ✅   |     ❌     |    ❌     | ❌  |   ❌   |

---

## 8. UI/UX MOCKUP

### 8.1. AI Generate Button

**Location:** Question Bank page

```
┌────────────────────────────────────────┐
│  My Questions (45)                     │
│                                        │
│  [+ New Question] [🤖 AI Generate]    │
│                                        │
│  Search: [_____________________] 🔍    │
│                                        │
│  ┌──────────────────────────────────┐ │
│  │ Q1: Python là gì?                │ │
│  │ Type: Single Choice  Diff: Easy  │ │
│  │ [Edit] [Delete] [Duplicate]      │ │
│  └──────────────────────────────────┘ │
│                                        │
│  ┌──────────────────────────────────┐ │
│  │ Q2: List vs Tuple?               │ │
│  │ ...                              │ │
│  └──────────────────────────────────┘ │
└────────────────────────────────────────┘
```

---

### 8.2. AI Generate Modal

**Click "AI Generate" button:**

```
┌──────────────────────────────────────────────┐
│  🤖 AI Question Generator                    │
├──────────────────────────────────────────────┤
│                                              │
│  Topic *                                     │
│  [Python Object Oriented Programming____]   │
│                                              │
│  Category *                                  │
│  [Programming ▼] > [Python ▼] > [OOP ▼]    │
│                                              │
│  Difficulty *                                │
│  ○ Easy  ● Medium  ○ Hard  ○ Mixed         │
│                                              │
│  Number of Questions *                       │
│  [20__] (5-50)                              │
│                                              │
│  Question Types * (Select multiple)          │
│  ☑ Single Choice                            │
│  ☑ Multiple Choice                          │
│  ☑ True/False                               │
│  ☐ Fill in the Blank                        │
│  ☐ Code Challenge                           │
│                                              │
│  Include Explanations                        │
│  ● Yes  ○ No                                │
│                                              │
│  Additional Context (Optional)               │
│  ┌──────────────────────────────────────┐  │
│  │ Focus on practical examples.         │  │
│  │ Target: Junior developers.           │  │
│  └──────────────────────────────────────┘  │
│                                              │
│  Estimated Cost: $0.15 USD                  │
│  Estimated Time: 15-30 seconds              │
│                                              │
│  [Cancel]              [Generate Questions] │
└──────────────────────────────────────────────┘
```

---

### 8.3. Generation Progress

```
┌──────────────────────────────────────────────┐
│  🤖 Generating Questions...                  │
├──────────────────────────────────────────────┤
│                                              │
│  ████████████████░░░░░░░ 60%                │
│                                              │
│  Status: Generating question 12 of 20...    │
│                                              │
│  Elapsed: 12s / Estimated: 20s               │
│                                              │
│  [Cancel Generation]                         │
└──────────────────────────────────────────────┘
```

---

### 8.4. Review Generated Questions

```
┌──────────────────────────────────────────────┐
│  ✅ Generated 20 Questions                   │
│  Cost: $0.15 USD | Time: 18s                │
├──────────────────────────────────────────────┤
│                                              │
│  [☑ Select All (20)] [Save Selected] [×]    │
│                                              │
│  ┌────────────────────────────────────────┐ │
│  │ ☑ Q1: Trong Python OOP, phương thức   │ │
│  │      nào được gọi khi tạo object mới? │ │
│  │                                        │ │
│  │ ○ __init__() [✓ Correct]             │ │
│  │ ○ __new__()                           │ │
│  │ ○ __create__()                        │ │
│  │ ○ __start__()                         │ │
│  │                                        │ │
│  │ 💡 __init__() là constructor...       │ │
│  │                                        │ │
│  │ Type: Single Choice | Diff: Medium    │ │
│  │ Tags: python, oop, constructor        │ │
│  │                                        │ │
│  │ [Edit] [Delete]                       │ │
│  └────────────────────────────────────────┘ │
│                                              │
│  ┌────────────────────────────────────────┐ │
│  │ ☑ Q2: Kỹ thuật nào cho phép...        │ │
│  │ ...                                    │ │
│  └────────────────────────────────────────┘ │
│                                              │
│  ... (18 more questions)                    │
│                                              │
│  [Cancel]  [Save as Draft]  [Submit Review] │
└──────────────────────────────────────────────┘
```

---

## 9. THỐNG KÊ & DASHBOARD

### 9.1. AI Usage Dashboard (Admin)

```
┌─────────────────────────────────────────┐
│  AI Question Generator - Usage Stats   │
├─────────────────────────────────────────┤
│                                         │
│  This Month:                            │
│  • Questions Generated: 2,450           │
│  • Total Cost: $175.50                  │
│  • Avg Cost/Question: $0.072            │
│                                         │
│  By User:                               │
│  • Admin: 500 ($36)                     │
│  • Chuyên gia A: 800 ($58)              │
│  • Chuyên gia B: 650 ($47)              │
│  • Chuyên gia C: 500 ($35)              │
│                                         │
│  Quality Metrics:                       │
│  • Approval Rate: 85%                   │
│  • Avg Student Rating: 4.2/5            │
│  • Flag Rate: 3%                        │
│                                         │
│  📊 [View Detailed Report]              │
└─────────────────────────────────────────┘
```

---

### 9.2. Personal Usage (Chuyên gia)

```
┌─────────────────────────────────────────┐
│  My AI Usage                            │
├─────────────────────────────────────────┤
│                                         │
│  Today: 15 / 100 questions used         │
│  ████████░░░░░░░░░░░░░░░ 15%           │
│                                         │
│  This Month: 245 questions              │
│  Cost: $18.50                           │
│                                         │
│  Recent Generations:                    │
│  • Jan 13, 10:30 AM - 20 questions      │
│    Topic: Python OOP                    │
│    Cost: $0.15                          │
│                                         │
│  • Jan 12, 3:45 PM - 30 questions       │
│    Topic: JavaScript Async              │
│    Cost: $0.22                          │
│                                         │
│  [View Full History]                    │
└─────────────────────────────────────────┘
```

---

## 10. TÓM TẮT

### 10.1. Key Features

1. ✅ **Generate từ Topic** - Nhập topic → AI tạo câu hỏi
2. ✅ **Generate từ Document** - Upload PDF/URL → AI extract & tạo
3. ✅ **Generate Variations** - Tạo biến thể từ câu có sẵn
4. ✅ **Code Challenge Generator** - Tạo bài code + test cases
5. ✅ **Bulk Generate** - Tạo hàng loạt cho roadmap
6. ✅ **AI Review** - AI review & improve câu hỏi
7. ✅ **Quality Control** - Automated validation + human review

### 10.2. Benefits

**Cho Platform:**

- 🚀 Scale nhanh content
- 💰 Giảm 80% chi phí tạo nội dung
- ⏱️ Tiết kiệm thời gian
- 📈 Tăng số lượng đề thi

**Cho Chuyên gia:**

- ⚡ Tạo nhanh, chỉ cần review
- 💡 AI suggest improvements
- 🎯 Focus vào quality control

**Cho Người học:**

- 📚 Nhiều câu hỏi đa dạng hơn
- 🔄 Luôn có content mới
- ✅ Chất lượng được đảm bảo

### 10.3. Cost Estimate

**Monthly costs (based on usage):**

| Scale      | Questions/Month | Cost (GPT-4) |
| ---------- | --------------- | ------------ |
| Small      | 500             | $40          |
| Medium     | 2,000           | $150         |
| Large      | 5,000           | $375         |
| Enterprise | 10,000+         | $750+        |

**Cost reduction strategies:**

- Use GPT-3.5 cho easy questions (-60% cost)
- Batch requests (-20% cost)
- Cache prompts (-10% cost)
- Fine-tune own model (Phase 2) (-40% cost)

---

**END OF DOCUMENT**

**Tổng số trang:** 25  
**Thời gian đọc:** 30 phút
