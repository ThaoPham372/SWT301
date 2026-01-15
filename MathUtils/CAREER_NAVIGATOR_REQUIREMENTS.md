# TÀI LIỆU YÊU CẦU DỰ ÁN
# CAREER NAVIGATOR PLATFORM

**Phiên bản:** 1.0  
**Ngày:** 13/01/2026  
**Trạng thái:** Draft  
**Người soạn:** Business Analyst Team  

---

## MỤC LỤC
1. [Tổng quan dự án](#1-tổng-quan-dự-án)
2. [Phân tích Stakeholders](#2-phân-tích-stakeholders)
3. [Yêu cầu nghiệp vụ (Business Requirements)](#3-yêu-cầu-nghiệp-vụ)
4. [Yêu cầu chức năng (Functional Requirements)](#4-yêu-cầu-chức-năng)
5. [Yêu cầu phi chức năng (Non-Functional Requirements)](#5-yêu-cầu-phi-chức-năng)
6. [User Stories và Use Cases](#6-user-stories-và-use-cases)
7. [Data Requirements](#7-data-requirements)
8. [Integration Requirements](#8-integration-requirements)
9. [Business Rules](#9-business-rules)
10. [Constraints và Assumptions](#10-constraints-và-assumptions)
11. [Success Metrics](#11-success-metrics)
12. [Roadmap và Priorities](#12-roadmap-và-priorities)

---

## 1. TỔNG QUAN DỰ ÁN

### 1.1. Executive Summary
**Career Navigator Platform** là hệ thống định hướng nghề nghiệp thông minh, kết hợp AI/ML để cá nhân hóa lộ trình học tập và phát triển sự nghiệp cho sinh viên và người đi làm trẻ tại Việt Nam.

### 1.2. Bối cảnh và Vấn đề
#### Vấn đề hiện tại:
- **87%** sinh viên Việt Nam làm không đúng ngành đào tạo
- **65%** sinh viên không biết định hướng nghề nghiệp sau tốt nghiệp
- **Khoảng cách kỹ năng**: Doanh nghiệp khó tìm ứng viên có kỹ năng thực tế
- **Thiếu kết nối**: Sinh viên không tiếp cận được mentor và cơ hội thực tập
- **Học mù quáng**: Học nhiều nhưng không có định hướng rõ ràng

#### Cơ hội:
- 1.2 triệu sinh viên đại học tại Việt Nam
- Nhu cầu reskilling/upskilling tăng 200% trong 3 năm qua
- Digital transformation tạo ra nhiều nghề mới

### 1.3. Mục tiêu dự án
**Ngắn hạn (6-12 tháng):**
- Đạt 10,000 người dùng đăng ký
- 500 người dùng active hàng ngày (DAU)
- Partnership với 20 doanh nghiệp/trường đại học

**Trung hạn (1-2 năm):**
- 100,000 người dùng
- 1,000 micro-internship opportunities
- 85% người dùng hoàn thành ít nhất 1 learning path

**Dài hạn (3-5 năm):**
- Trở thành nền tảng định hướng nghề nghiệp #1 tại Việt Nam
- Mở rộng sang ASEAN
- 1 triệu người dùng

### 1.4. Scope
#### In Scope:
- Career assessment và AI recommendation
- Personalized learning roadmap
- Gamification system (points, badges, leaderboard)
- Community forum và social learning
- Micro-internship marketplace
- Mentor matching system
- Portfolio builder
- Job market analytics
- Mobile-responsive web app

#### Out of Scope (Phase 1):
- Native mobile app (iOS/Android)
- AR/VR career preview
- Blockchain credentials
- Live video streaming
- Payment gateway (phase 2)
- International content (chỉ tiếng Việt)

---

## 2. PHÂN TÍCH STAKEHOLDERS

### 2.1. Primary Stakeholders

| Stakeholder | Vai trò | Nhu cầu chính | Ưu tiên |
|------------|---------|---------------|---------|
| **Sinh viên** | End User | Định hướng nghề nghiệp, học kỹ năng, tìm cơ hội thực tập | Critical |
| **Người đi làm trẻ** | End User | Chuyển đổi nghề nghiệp, nâng cấp kỹ năng | High |
| **Doanh nghiệp** | Partner | Tuyển dụng talent, đăng micro-internship | High |
| **Mentor** | Content Provider | Chia sẻ kinh nghiệm, hỗ trợ mentee | Medium |
| **Nhà trường** | Partner | Theo dõi sinh viên, tích hợp curriculum | Medium |

### 2.2. Secondary Stakeholders
- **Investors/Sponsors**: ROI, growth metrics
- **Content Creators**: Course creation, monetization
- **Government**: Giảm thất nghiệp, phát triển nhân lực

---

## 3. YÊU CẦU NGHIỆP VỤ

### BR-001: Định hướng nghề nghiệp thông minh
**Mô tả:** Hệ thống phải cung cấp khả năng đánh giá toàn diện tính cách, kỹ năng và đưa ra gợi ý nghề nghiệp phù hợp dựa trên AI.

**Business Value:** 
- Giảm 50% thời gian sinh viên tìm kiếm định hướng
- Tăng độ chính xác lựa chọn nghề nghiệp lên 70%

**Success Criteria:**
- 80% người dùng hài lòng với kết quả định hướng
- Completion rate của career test ≥ 75%

---

### BR-002: Cá nhân hóa lộ trình học tập
**Mô tả:** Mỗi người dùng có một learning roadmap riêng, tự động điều chỉnh dựa trên tiến độ, sở thích và xu hướng thị trường.

**Business Value:**
- Tăng engagement rate 3x so với content tĩnh
- Retention rate tăng 60%

**Success Criteria:**
- 70% người dùng hoàn thành ít nhất 1 milestone trong tháng đầu
- Average session time ≥ 15 phút

---

### BR-003: Kết nối cơ hội việc làm thực tế
**Mô tả:** Nền tảng kết nối sinh viên với doanh nghiệp qua micro-internship, project-based learning.

**Business Value:**
- 40% người dùng có cơ hội thực tập/việc làm trong 6 tháng
- Tạo nguồn thu từ enterprise partnership

**Success Criteria:**
- 200+ micro-internship postings trong 6 tháng
- 30% conversion rate (apply → accepted)

---

### BR-004: Xây dựng cộng đồng học tập
**Mô tả:** Tạo môi trường học tập tương tác, hỗ trợ lẫn nhau, gamification để tăng động lực.

**Business Value:**
- Viral growth thông qua referral
- Giảm 40% cost per acquisition

**Success Criteria:**
- 50% người dùng tham gia ít nhất 1 discussion/week
- Net Promoter Score (NPS) ≥ 50

---

## 4. YÊU CẦU CHỨC NĂNG

### 4.1. Module: User Management

#### FR-UM-001: Đăng ký tài khoản
**Priority:** P0 (Must Have)  
**Description:** Người dùng có thể đăng ký tài khoản bằng email/số điện thoại hoặc OAuth (Google, Facebook).

**Acceptance Criteria:**
- [ ] Hỗ trợ đăng ký bằng email + password
- [ ] Hỗ trợ OAuth 2.0 (Google, Facebook)
- [ ] Xác thực email/OTP qua SMS
- [ ] Validate email format và password strength (min 8 ký tự, 1 chữ hoa, 1 số)
- [ ] Hiển thị lỗi rõ ràng khi đăng ký thất bại
- [ ] Tự động đăng nhập sau khi đăng ký thành công

**Business Rules:**
- BR-UM-001: Email phải unique trong hệ thống
- BR-UM-002: Một số điện thoại chỉ được đăng ký tối đa 3 tài khoản
- BR-UM-003: Tài khoản chưa xác thực email bị giới hạn chức năng

---

#### FR-UM-002: Đăng nhập
**Priority:** P0 (Must Have)  
**Description:** Người dùng đăng nhập vào hệ thống để truy cập chức năng.

**Acceptance Criteria:**
- [ ] Đăng nhập bằng email/username + password
- [ ] Đăng nhập bằng OAuth
- [ ] "Remember me" option (session 30 ngày)
- [ ] "Forgot password" flow
- [ ] Lock account sau 5 lần đăng nhập sai (15 phút)
- [ ] Hiển thị thông báo lần đăng nhập cuối

---

#### FR-UM-003: Profile Management
**Priority:** P0 (Must Have)  
**Description:** Người dùng quản lý thông tin cá nhân, avatar, bio.

**Acceptance Criteria:**
- [ ] Upload avatar (max 5MB, format: JPG/PNG/WEBP)
- [ ] Cập nhật: Full name, Bio (max 500 ký tự), Location, Birthday
- [ ] Thêm social links (LinkedIn, GitHub, Portfolio)
- [ ] Privacy settings (public/private profile)
- [ ] Delete account option với confirmation

**Data Fields:**
```
User Profile:
- user_id (PK)
- email (unique, required)
- full_name (required)
- avatar_url
- bio
- location
- birthday (optional)
- linkedin_url
- github_url
- portfolio_url
- privacy_level (enum: public/private)
- created_at
- updated_at
```

---

### 4.2. Module: Career Assessment

#### FR-CA-001: Bài test đánh giá nghề nghiệp
**Priority:** P0 (Must Have)  
**Description:** Hệ thống cung cấp bài test đa dạng để đánh giá tính cách, năng lực, sở thích nghề nghiệp.

**Acceptance Criteria:**
- [ ] Bộ câu hỏi gồm 3 phần:
  - Personality Test (30 câu - based on Big Five model)
  - Skills Assessment (40 câu - technical & soft skills)
  - Interest Inventory (25 câu - Holland Code)
- [ ] Thời gian làm bài: 25-30 phút
- [ ] Hỗ trợ save progress và resume later
- [ ] Progress bar hiển thị % hoàn thành
- [ ] Không cho phép back về câu trước (integrity)
- [ ] Timer countdown (optional, có thể tắt)

**Test Types:**
| Test Type | Câu hỏi | Thời gian | Output |
|-----------|---------|-----------|--------|
| Personality | 30 | 10 min | Big Five scores |
| Skills | 40 | 15 min | Technical/Soft skills level |
| Interest | 25 | 5 min | Holland Code (RIASEC) |

---

#### FR-CA-002: Kết quả và Recommendation
**Priority:** P0 (Must Have)  
**Description:** Sau khi hoàn thành test, hiển thị kết quả chi tiết và gợi ý nghề nghiệp.

**Acceptance Criteria:**
- [ ] Hiển thị điểm số cho từng dimension
- [ ] Visualization (radar chart, bar chart)
- [ ] Top 5 nghề nghiệp phù hợp với:
  - Match percentage
  - Mô tả nghề
  - Mức lương trung bình
  - Career outlook (growth rate)
  - Required skills
- [ ] So sánh với người dùng khác cùng profile
- [ ] Download kết quả PDF
- [ ] Share kết quả lên social media

**AI/ML Requirements:**
- Algorithm: Collaborative Filtering + Content-Based
- Input: Test scores + user demographics + market data
- Output: Ranked list of careers với confidence score
- Retrain model: Monthly với new user data

---

#### FR-CA-003: Re-assessment
**Priority:** P1 (Should Have)  
**Description:** Cho phép người dùng làm lại test sau 6 tháng để track sự thay đổi.

**Acceptance Criteria:**
- [ ] Chỉ cho phép retake sau 6 tháng kể từ lần test cuối
- [ ] So sánh kết quả giữa các lần test
- [ ] Highlight sự thay đổi về skills/interests
- [ ] Update recommendation based on latest result

---

### 4.3. Module: Learning Roadmap

#### FR-LR-001: Generate Learning Path
**Priority:** P0 (Must Have)  
**Description:** Tự động tạo lộ trình học tập cá nhân hóa dựa trên career goal và current skill level.

**Acceptance Criteria:**
- [ ] Chọn career goal từ kết quả assessment hoặc custom
- [ ] Assessment skill level hiện tại (beginner/intermediate/advanced)
- [ ] Hệ thống generate roadmap gồm:
  - Milestones (3-6 milestones)
  - Learning modules cho mỗi milestone
  - Estimated time to complete
  - Prerequisites
- [ ] Visualization: Interactive roadmap với timeline
- [ ] Ability to customize roadmap (add/remove modules)

**Roadmap Structure:**
```
Career Goal: Software Engineer
├── Milestone 1: Programming Fundamentals (2 months)
│   ├── Module 1.1: Python Basics
│   ├── Module 1.2: Data Structures
│   └── Module 1.3: Algorithms
├── Milestone 2: Web Development (3 months)
│   ├── Module 2.1: HTML/CSS/JS
│   ├── Module 2.2: React.js
│   └── Module 2.3: Backend with Node.js
├── Milestone 3: Database & API (2 months)
...
```

---

#### FR-LR-002: Progress Tracking
**Priority:** P0 (Must Have)  
**Description:** Theo dõi tiến độ học tập của người dùng.

**Acceptance Criteria:**
- [ ] Mark module as "In Progress" / "Completed"
- [ ] Overall progress bar (%)
- [ ] Time spent on each module (auto-track)
- [ ] Completion certificate cho mỗi milestone
- [ ] Weekly/Monthly progress report qua email
- [ ] Streak tracking (học liên tục X ngày)

**Progress Metrics:**
- Completion rate
- Average time per module
- Streak days
- Skills acquired
- Certificates earned

---

#### FR-LR-003: Adaptive Roadmap
**Priority:** P1 (Should Have)  
**Description:** Roadmap tự động điều chỉnh dựa trên progress và job market trends.

**Acceptance Criteria:**
- [ ] AI phát hiện nếu user học chậm → suggest easier modules
- [ ] Nếu skill A đã master → auto-skip hoặc suggest advanced content
- [ ] Monthly roadmap review: check if career goal still relevant
- [ ] Suggest new skills based on job market data (trending skills)
- [ ] Notify user về recommended changes với explanation

**Example:**
```
Alert: "We noticed React 19 is now trending. 
We've added 'React Server Components' to your roadmap."
```

---

### 4.4. Module: Gamification System

#### FR-GF-001: Points và Levels
**Priority:** P0 (Must Have)  
**Description:** Người dùng kiếm điểm và level up qua các hoạt động.

**Acceptance Criteria:**
- [ ] Point earning system:
  - Complete module: 100 points
  - Complete milestone: 500 points
  - Daily login: 10 points
  - Help others (forum): 20 points/answer
  - Profile completion: 50 points
- [ ] Level system: Level 1-100
  - Level up công thức: XP needed = 100 * level^1.5
- [ ] Display current level và XP progress
- [ ] Level-up animation với reward

**Points Table:**
| Action | Points | Daily Cap |
|--------|--------|-----------|
| Complete Module | 100 | No cap |
| Complete Quiz (100%) | 50 | 200 |
| Daily Login | 10 | 10 |
| Forum Answer | 20 | 100 |
| Referral (friend signs up) | 200 | 1000 |

---

#### FR-GF-002: Badges và Achievements
**Priority:** P1 (Should Have)  
**Description:** Unlock badges khi đạt achievements đặc biệt.

**Acceptance Criteria:**
- [ ] 50+ badges để unlock
- [ ] Categories: Learner, Helper, Achiever, Social
- [ ] Display badges on profile
- [ ] Badge rarity: Common, Rare, Epic, Legendary
- [ ] Achievement notification với animation
- [ ] Badge showcase (chọn 5 badges để hiển thị)

**Sample Badges:**
- 🎯 **Fast Learner**: Complete 5 modules in 1 week
- 🔥 **On Fire**: 30-day learning streak
- 🏆 **Milestone Master**: Complete 3 milestones
- 💬 **Community Hero**: 100 helpful answers
- 🚀 **Early Adopter**: Among first 1000 users

---

#### FR-GF-003: Leaderboard
**Priority:** P1 (Should Have)  
**Description:** Bảng xếp hạng theo nhiều tiêu chí.

**Acceptance Criteria:**
- [ ] Multiple leaderboards:
  - Overall points (all-time)
  - Weekly/Monthly rankings
  - Specific skills (e.g., Top Python learners)
  - Peer group (same career goal)
- [ ] Display: Rank, Username, Avatar, Points
- [ ] Current user's rank highlighted
- [ ] Filter: Global / Friends / University
- [ ] Opt-out option (privacy)

---

### 4.5. Module: Community & Social Learning

#### FR-CS-001: Discussion Forum
**Priority:** P0 (Must Have)  
**Description:** Diễn đàn hỏi đáp, thảo luận về career và learning.

**Acceptance Criteria:**
- [ ] Create post với:
  - Title (max 200 chars)
  - Content (WYSIWYG editor, max 10,000 chars)
  - Tags (max 5 tags)
  - Attachments (images, files max 10MB)
  - Category (Career, Tech, Learning, General)
- [ ] Comment và reply
- [ ] Upvote/Downvote system
- [ ] Mark answer as "Best Answer"
- [ ] Search posts với filters (tag, category, date)
- [ ] Sort: Latest, Most Popular, Trending
- [ ] Report inappropriate content

**Post Categories:**
- Career Advice
- Technical Q&A
- Learning Resources
- Success Stories
- General Discussion

---

#### FR-CS-002: Study Groups
**Priority:** P1 (Should Have)  
**Description:** Tạo và tham gia nhóm học.

**Acceptance Criteria:**
- [ ] Create study group:
  - Group name, description
  - Public/Private
  - Max members (10-50)
  - Learning goal/topic
- [ ] Join group (request to join if private)
- [ ] Group chat (text-based)
- [ ] Share resources trong group
- [ ] Group challenges và leaderboard
- [ ] Schedule study sessions

---

#### FR-CS-003: Mentor-Mentee Matching
**Priority:** P1 (Should Have)  
**Description:** Kết nối người cần hỗ trợ với mentor.

**Acceptance Criteria:**
- [ ] Mentor registration:
  - Expertise areas
  - Years of experience
  - Availability (hours/week)
  - Max mentees
- [ ] Mentee request mentor với:
  - Learning goals
  - Preferred expertise
- [ ] AI matching algorithm:
  - Expertise match
  - Availability overlap
  - Personality compatibility (from assessment)
- [ ] Mentor-mentee communication channel
- [ ] Session scheduling và reminders
- [ ] Rating và review system

**Matching Criteria:**
| Factor | Weight |
|--------|--------|
| Expertise match | 40% |
| Availability | 20% |
| Personality fit | 20% |
| Past ratings | 20% |

---

### 4.6. Module: Micro-Internship Marketplace

#### FR-MI-001: Job/Internship Posting (Employer)
**Priority:** P0 (Must Have)  
**Description:** Doanh nghiệp đăng micro-internship và project-based opportunities.

**Acceptance Criteria:**
- [ ] Employer registration và verification (business email)
- [ ] Create job posting:
  - Title, Description
  - Required skills
  - Duration (1-12 weeks)
  - Compensation (paid/unpaid/stipend)
  - Location (remote/on-site/hybrid)
  - Application deadline
- [ ] Manage applications (view, shortlist, accept/reject)
- [ ] Posting analytics (views, applications)
- [ ] Expire posting sau deadline hoặc filled

**Job Post Fields:**
```
{
  "job_id": "uuid",
  "company_id": "uuid",
  "title": "Frontend Developer Intern",
  "description": "...",
  "required_skills": ["React", "TypeScript"],
  "duration_weeks": 8,
  "compensation_type": "paid",
  "compensation_amount": 5000000,
  "location_type": "remote",
  "deadline": "2026-03-01",
  "status": "open/closed/filled"
}
```

---

#### FR-MI-002: Job Search và Apply (Student)
**Priority:** P0 (Must Have)  
**Description:** Sinh viên tìm kiếm và apply internship.

**Acceptance Criteria:**
- [ ] Search với filters:
  - Skills, Location, Duration
  - Compensation type
  - Company size
- [ ] Sort: Latest, Best Match, Deadline
- [ ] AI-powered recommendations based on profile
- [ ] Apply với:
  - Auto-fill từ profile
  - Cover letter (optional)
  - Portfolio link
- [ ] Track application status
- [ ] Save jobs for later
- [ ] Email notification khi có update

---

#### FR-MI-003: Application Management
**Priority:** P0 (Must Have)  
**Description:** Quản lý applications từ cả phía student và employer.

**Acceptance Criteria:**
- [ ] Student view:
  - All applications với status
  - Filter by status (pending/shortlisted/accepted/rejected)
  - Withdraw application
- [ ] Employer view:
  - All applications cho mỗi posting
  - Bulk actions (shortlist, reject)
  - Schedule interview
  - Send messages to applicants
- [ ] Status workflow: 
  ```
  Applied → Reviewed → Shortlisted → Interview → Offer/Reject
  ```

---

### 4.7. Module: Portfolio Builder

#### FR-PF-001: Auto-generated Portfolio
**Priority:** P1 (Should Have)  
**Description:** Tự động tạo portfolio website từ profile và achievements.

**Acceptance Criteria:**
- [ ] Select template (3-5 professional templates)
- [ ] Auto-populate:
  - Bio, avatar
  - Skills với proficiency level
  - Completed milestones
  - Certificates
  - Projects (from internships)
- [ ] Customize:
  - Colors, fonts
  - Section order
  - Show/hide sections
- [ ] Public URL: `careernav.vn/@username`
- [ ] Download PDF version
- [ ] Analytics: portfolio views

**Portfolio Sections:**
1. Hero (name, title, photo)
2. About Me
3. Skills
4. Experience (internships)
5. Projects
6. Certifications
7. Contact

---

#### FR-PF-002: Project Showcase
**Priority:** P1 (Should Have)  
**Description:** Add và showcase projects.

**Acceptance Criteria:**
- [ ] Add project manually:
  - Title, description
  - Tech stack (tags)
  - Live demo URL
  - GitHub repo URL
  - Images/screenshots (max 5)
  - Start/End date
- [ ] Auto-import từ GitHub (OAuth)
- [ ] Featured project (pin to top)
- [ ] Project likes/views counter

---

### 4.8. Module: Job Market Analytics

#### FR-JM-001: Skill Demand Trends
**Priority:** P1 (Should Have)  
**Description:** Hiển thị xu hướng nhu cầu kỹ năng trên thị trường.

**Acceptance Criteria:**
- [ ] Dashboard showing:
  - Top 20 in-demand skills (this month)
  - Trending up/down indicators
  - Historical data (6 months line chart)
  - By industry filter
- [ ] Salary ranges by skill
- [ ] Job openings count by skill
- [ ] Data source: Crawl từ job sites (LinkedIn, VietnamWorks, TopCV)

**Data Update Frequency:** Daily

---

#### FR-JM-002: Career Insights
**Priority:** P2 (Nice to Have)  
**Description:** Insights về career paths, salary, growth.

**Acceptance Criteria:**
- [ ] Career path visualization (career tree)
- [ ] Average salary by position và years of experience
- [ ] Job satisfaction ratings
- [ ] Common career transitions
- [ ] Geographic data (job density by city)

---

### 4.9. Module: Notifications

#### FR-NT-001: In-app Notifications
**Priority:** P0 (Must Have)  
**Description:** Thông báo trong app.

**Acceptance Criteria:**
- [ ] Notification types:
  - New job match your profile
  - Mentor accepted/rejected
  - New reply to your post
  - Achievement unlocked
  - Roadmap update suggestion
  - Application status change
- [ ] Notification center với:
  - Mark as read
  - Mark all as read
  - Filter by type
- [ ] Badge count on notification icon
- [ ] Real-time updates (WebSocket)

---

#### FR-NT-002: Email Notifications
**Priority:** P1 (Should Have)  
**Description:** Email notifications cho important events.

**Acceptance Criteria:**
- [ ] Email for:
  - Welcome email
  - Password reset
  - Weekly progress report
  - Application status change
  - New job recommendations (weekly digest)
- [ ] Unsubscribe option
- [ ] Email preferences setting (choose which to receive)

---

#### FR-NT-003: Push Notifications
**Priority:** P2 (Nice to Have - Phase 2)  
**Description:** Push notifications trên mobile browsers.

---

### 4.10. Module: Admin & Moderation

#### FR-AD-001: Admin Dashboard
**Priority:** P0 (Must Have)  
**Description:** Dashboard cho admin quản lý platform.

**Acceptance Criteria:**
- [ ] Overview metrics:
  - Total users, DAU, MAU
  - New registrations (today, week, month)
  - Active job postings
  - Content flagged for review
- [ ] Charts: User growth, engagement rate
- [ ] Quick actions: View recent users, moderate content

---

#### FR-AD-002: User Management
**Priority:** P0 (Must Have)  
**Description:** Quản lý users.

**Acceptance Criteria:**
- [ ] Search users (by name, email)
- [ ] View user details và activity
- [ ] Ban/Suspend user với reason
- [ ] Send message to user
- [ ] View user reports

---

#### FR-AD-003: Content Moderation
**Priority:** P0 (Must Have)  
**Description:** Moderation cho UGC (posts, comments).

**Acceptance Criteria:**
- [ ] Review flagged content
- [ ] Approve/Reject/Delete
- [ ] Warn user
- [ ] Ban user if repeated violations
- [ ] Moderation log

---

## 5. YÊU CẦU PHI CHỨC NĂNG

### 5.1. Performance Requirements

#### NFR-PF-001: Response Time
**Priority:** P0  
**Requirement:**
- Page load time ≤ 2 seconds (desktop)
- Page load time ≤ 3 seconds (mobile)
- API response time ≤ 500ms (p95)
- Search results ≤ 1 second

**Measurement:** Google Lighthouse, Application Performance Monitoring (APM)

---

#### NFR-PF-002: Concurrent Users
**Priority:** P0  
**Requirement:**
- Hỗ trợ 5,000 concurrent users (Phase 1)
- Scale to 50,000 concurrent users (Phase 2)
- No degradation trong peak hours

**Load Testing:** JMeter, k6

---

#### NFR-PF-003: Database Performance
**Priority:** P0  
**Requirement:**
- Query response time ≤ 100ms (p95)
- Database connection pool: min 10, max 100
- Implement caching cho frequently accessed data (Redis)

---

### 5.2. Scalability Requirements

#### NFR-SC-001: Horizontal Scaling
**Priority:** P1  
**Requirement:**
- Kiến trúc microservices để scale independently
- Stateless application servers
- Load balancer (Round-robin, Least Connection)

---

#### NFR-SC-002: Data Growth
**Priority:** P1  
**Requirement:**
- Database có thể handle 1TB data (5 years projection)
- Implement data archiving cho old inactive data
- Database sharding strategy nếu cần

---

### 5.3. Security Requirements

#### NFR-SE-001: Authentication & Authorization
**Priority:** P0  
**Requirement:**
- JWT-based authentication với refresh token
- Token expiry: Access token 15 min, Refresh token 30 days
- Role-based access control (RBAC):
  - Roles: Admin, Moderator, Employer, Mentor, Student
- Multi-factor authentication (MFA) cho admin (Phase 2)

---

#### NFR-SE-002: Data Protection
**Priority:** P0  
**Requirement:**
- Encrypt sensitive data at rest (AES-256)
- Encrypt data in transit (TLS 1.3)
- Hash passwords (bcrypt, cost factor 12)
- Compliance with Vietnam's cybersecurity law
- GDPR-ready (for future international expansion)

---

#### NFR-SE-003: Input Validation
**Priority:** P0  
**Requirement:**
- Validate all user inputs (client & server side)
- Protection against:
  - SQL Injection
  - XSS (Cross-Site Scripting)
  - CSRF (Cross-Site Request Forgery)
  - Rate limiting (100 requests/minute per IP)

---

#### NFR-SE-004: Security Audit
**Priority:** P1  
**Requirement:**
- Penetration testing trước khi launch
- Quarterly security audits
- Bug bounty program (Phase 2)

---

### 5.4. Availability & Reliability

#### NFR-AV-001: Uptime
**Priority:** P0  
**Requirement:**
- 99.5% uptime (Target: 99.9%)
- Planned maintenance: Off-peak hours, <2 hours
- Unplanned downtime: <1 hour/month

**Calculation:** 99.9% uptime = ~8.7 hours downtime/year

---

#### NFR-AV-002: Disaster Recovery
**Priority:** P1  
**Requirement:**
- RTO (Recovery Time Objective): 4 hours
- RPO (Recovery Point Objective): 1 hour
- Daily database backups
- Backup retention: 30 days
- Test disaster recovery quarterly

---

#### NFR-AV-003: Monitoring & Alerting
**Priority:** P0  
**Requirement:**
- Real-time monitoring (Prometheus + Grafana hoặc DataDog)
- Alert for:
  - Server down
  - High error rate (>5%)
  - Slow response time (>2s)
  - High CPU/Memory usage (>80%)
- On-call rotation cho critical issues

---

### 5.5. Usability Requirements

#### NFR-US-001: User Interface
**Priority:** P0  
**Requirement:**
- Responsive design (mobile-first)
- Support browsers: Chrome, Firefox, Safari, Edge (latest 2 versions)
- Accessibility: WCAG 2.1 Level AA
- Consistent UI/UX design system (Material UI / Ant Design / Chakra UI)

---

#### NFR-US-002: Localization
**Priority:** P0 (Tiếng Việt), P2 (English)  
**Requirement:**
- Tiếng Việt as primary language
- Support English (Phase 2)
- Date/Time format: Vietnamese standard
- Currency: VND

---

#### NFR-US-003: User Onboarding
**Priority:** P1  
**Requirement:**
- Interactive tutorial cho first-time users
- Tooltips cho key features
- Help center/FAQ
- Chatbot support (Phase 2)

---

### 5.6. Maintainability Requirements

#### NFR-MT-001: Code Quality
**Priority:** P0  
**Requirement:**
- Code coverage ≥ 80%
- Linting (ESLint, Prettier)
- Code review mandatory trước merge
- Follow style guide (Airbnb / Google)

---

#### NFR-MT-002: Documentation
**Priority:** P1  
**Requirement:**
- API documentation (Swagger/OpenAPI)
- Architecture documentation
- Database schema documentation
- Deployment guide
- Runbook cho operations

---

#### NFR-MT-003: CI/CD
**Priority:** P0  
**Requirement:**
- Automated testing trong CI pipeline
- Automated deployment
- Staging environment cho testing
- Blue-green deployment hoặc Rolling deployment

---

### 5.7. Compliance & Legal

#### NFR-CP-001: Data Privacy
**Priority:** P0  
**Requirement:**
- Privacy policy và Terms of Service
- Cookie consent banner
- Right to data deletion (GDPR Article 17)
- Data export functionality

---

#### NFR-CP-002: Content Policy
**Priority:** P0  
**Requirement:**
- Community guidelines
- Prohibited content policy
- Copyright infringement handling (DMCA)

---

## 6. USER STORIES VÀ USE CASES

### 6.1. User Stories - Student/Learner

#### US-ST-001: Định hướng nghề nghiệp
```
As a: Sinh viên năm 1 chưa biết học gì
I want to: Làm bài test định hướng nghề nghiệp
So that: Tôi biết mình phù hợp với nghề gì

Acceptance Criteria:
- Given tôi là user mới chưa làm test
- When tôi hoàn thành career assessment
- Then hệ thống hiển thị top 5 nghề phù hợp với tôi
- And mỗi nghề có mô tả, lương, skills cần thiết
```

---

#### US-ST-002: Học theo lộ trình
```
As a: Sinh viên muốn học lập trình
I want to: Có một lộ trình học rõ ràng từ beginner đến advanced
So that: Tôi không bị lạc hướng và biết học gì tiếp theo

Acceptance Criteria:
- Given tôi đã chọn career goal là "Software Engineer"
- When hệ thống tạo roadmap cho tôi
- Then roadmap có ít nhất 3 milestones
- And mỗi milestone có các learning modules cụ thể
- And có estimated time to complete
```

---

#### US-ST-003: Tìm cơ hội thực tập
```
As a: Sinh viên đã học được một số skills
I want to: Tìm micro-internship để practice
So that: Tôi có kinh nghiệm thực tế và làm đẹp CV

Acceptance Criteria:
- Given tôi đã có ít nhất 2 skills trong profile
- When tôi search micro-internship
- Then hệ thống hiển thị jobs match với skills của tôi
- And tôi có thể apply với 1 click (auto-fill profile)
```

---

#### US-ST-004: Xây dựng portfolio
```
As a: Sinh viên chuẩn bị đi xin việc
I want to: Tạo portfolio website nhanh chóng
So that: Tôi có thể showcase skills và projects cho nhà tuyển dụng

Acceptance Criteria:
- Given tôi đã hoàn thành ít nhất 1 milestone
- When tôi generate portfolio
- Then hệ thống tạo portfolio với data từ profile
- And tôi có public URL để share
```

---

#### US-ST-005: Nhận sự hỗ trợ từ mentor
```
As a: Sinh viên gặp khó khăn trong quá trình học
I want to: Kết nối với mentor có kinh nghiệm
So that: Tôi được hướng dẫn và giải đáp thắc mắc

Acceptance Criteria:
- Given tôi đã có career goal
- When tôi request mentor
- Then hệ thống suggest 5 mentors phù hợp
- And tôi có thể gửi request và chat với mentor
```

---

### 6.2. User Stories - Employer

#### US-EM-001: Tuyển dụng intern
```
As a: HR của startup
I want to: Đăng micro-internship để tìm talent trẻ
So that: Tôi tìm được candidates phù hợp với budget nhỏ

Acceptance Criteria:
- Given tôi có account employer verified
- When tôi tạo job posting với required skills
- Then hệ thống hiển thị posting cho students match skills
- And tôi nhận được applications và có thể filter/shortlist
```

---

#### US-EM-002: Quản lý applications
```
As a: Hiring manager
I want to: Xem và quản lý applications một cách hiệu quả
So that: Tôi tiết kiệm thời gian screening

Acceptance Criteria:
- Given tôi có 50 applications cho 1 job
- When tôi view applications
- Then tôi có thể sort by match score
- And tôi có thể bulk shortlist/reject
- And tôi có thể send message cho candidates
```

---

### 6.3. User Stories - Mentor

#### US-MN-001: Chia sẻ kinh nghiệm
```
As a: Senior developer
I want to: Trở thành mentor để giúp đỡ người trẻ
So that: Tôi contribute lại cho cộng đồng

Acceptance Criteria:
- Given tôi có ≥3 năm kinh nghiệm
- When tôi đăng ký làm mentor
- Then tôi có thể set expertise areas và availability
- And hệ thống match tôi với mentees phù hợp
```

---

### 6.4. Use Case: Complete Learning Roadmap

**Use Case ID:** UC-001  
**Actor:** Student  
**Preconditions:**
- User đã đăng ký và đăng nhập
- User đã hoàn thành career assessment

**Main Flow:**
1. User chọn career goal từ recommendations
2. System generate personalized roadmap
3. User xem roadmap với milestones và modules
4. User bắt đầu học module đầu tiên
5. User mark module as "In Progress"
6. User hoàn thành learning materials
7. User pass quiz/assessment của module
8. System mark module as "Completed"
9. System cộng points và check if level up
10. System update progress bar
11. System suggest next module
12. Repeat steps 4-11 until complete milestone
13. System issue certificate cho milestone
14. User posts success lên forum

**Alternative Flows:**
- 7a. User fail quiz → System suggest review materials → Return to step 6
- 12a. User stuck → User request mentor help → Mentor assigned → Return to step 6

**Postconditions:**
- User hoàn thành roadmap
- User có certificate và skills mới trong profile
- User có thể apply cho micro-internships

---

## 7. DATA REQUIREMENTS

### 7.1. Entity Relationship Diagram (ERD)

#### Core Entities:

**Users**
```sql
users (
  user_id UUID PRIMARY KEY,
  email VARCHAR(255) UNIQUE NOT NULL,
  password_hash VARCHAR(255) NOT NULL,
  full_name VARCHAR(255) NOT NULL,
  role ENUM('student', 'employer', 'mentor', 'admin'),
  avatar_url TEXT,
  bio TEXT,
  location VARCHAR(255),
  birthday DATE,
  linkedin_url TEXT,
  github_url TEXT,
  portfolio_url TEXT,
  privacy_level ENUM('public', 'private') DEFAULT 'public',
  email_verified BOOLEAN DEFAULT FALSE,
  is_active BOOLEAN DEFAULT TRUE,
  created_at TIMESTAMP DEFAULT NOW(),
  updated_at TIMESTAMP DEFAULT NOW()
)
```

**Career Assessments**
```sql
career_assessments (
  assessment_id UUID PRIMARY KEY,
  user_id UUID REFERENCES users(user_id),
  personality_scores JSONB, -- Big Five scores
  skill_scores JSONB, -- Technical/Soft skills
  interest_scores JSONB, -- Holland Code (RIASEC)
  completed_at TIMESTAMP,
  created_at TIMESTAMP DEFAULT NOW()
)

career_recommendations (
  recommendation_id UUID PRIMARY KEY,
  assessment_id UUID REFERENCES career_assessments(assessment_id),
  career_name VARCHAR(255),
  match_percentage DECIMAL(5,2),
  confidence_score DECIMAL(5,2),
  created_at TIMESTAMP DEFAULT NOW()
)
```

**Learning Roadmaps**
```sql
career_goals (
  goal_id UUID PRIMARY KEY,
  user_id UUID REFERENCES users(user_id),
  career_name VARCHAR(255) NOT NULL,
  target_completion_date DATE,
  status ENUM('active', 'paused', 'completed'),
  created_at TIMESTAMP DEFAULT NOW()
)

milestones (
  milestone_id UUID PRIMARY KEY,
  goal_id UUID REFERENCES career_goals(goal_id),
  title VARCHAR(255) NOT NULL,
  description TEXT,
  sequence_order INT,
  estimated_weeks INT,
  status ENUM('locked', 'unlocked', 'in_progress', 'completed'),
  completed_at TIMESTAMP,
  created_at TIMESTAMP DEFAULT NOW()
)

learning_modules (
  module_id UUID PRIMARY KEY,
  milestone_id UUID REFERENCES milestones(milestone_id),
  title VARCHAR(255) NOT NULL,
  description TEXT,
  content_type ENUM('article', 'video', 'quiz', 'project'),
  content_url TEXT,
  estimated_hours INT,
  sequence_order INT,
  created_at TIMESTAMP DEFAULT NOW()
)

user_progress (
  progress_id UUID PRIMARY KEY,
  user_id UUID REFERENCES users(user_id),
  module_id UUID REFERENCES learning_modules(module_id),
  status ENUM('not_started', 'in_progress', 'completed'),
  time_spent_minutes INT DEFAULT 0,
  quiz_score DECIMAL(5,2),
  started_at TIMESTAMP,
  completed_at TIMESTAMP,
  created_at TIMESTAMP DEFAULT NOW()
)
```

**Gamification**
```sql
user_points (
  user_id UUID REFERENCES users(user_id),
  total_points INT DEFAULT 0,
  current_level INT DEFAULT 1,
  xp_to_next_level INT,
  streak_days INT DEFAULT 0,
  last_activity_date DATE,
  PRIMARY KEY (user_id)
)

badges (
  badge_id UUID PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  icon_url TEXT,
  rarity ENUM('common', 'rare', 'epic', 'legendary'),
  criteria JSONB, -- Unlock criteria
  created_at TIMESTAMP DEFAULT NOW()
)

user_badges (
  user_id UUID REFERENCES users(user_id),
  badge_id UUID REFERENCES badges(badge_id),
  unlocked_at TIMESTAMP DEFAULT NOW(),
  is_showcased BOOLEAN DEFAULT FALSE,
  PRIMARY KEY (user_id, badge_id)
)

point_transactions (
  transaction_id UUID PRIMARY KEY,
  user_id UUID REFERENCES users(user_id),
  action_type VARCHAR(50), -- 'module_complete', 'daily_login', etc.
  points INT,
  created_at TIMESTAMP DEFAULT NOW()
)
```

**Community**
```sql
posts (
  post_id UUID PRIMARY KEY,
  user_id UUID REFERENCES users(user_id),
  title VARCHAR(255) NOT NULL,
  content TEXT NOT NULL,
  category ENUM('career', 'tech', 'learning', 'general'),
  upvotes INT DEFAULT 0,
  downvotes INT DEFAULT 0,
  view_count INT DEFAULT 0,
  is_flagged BOOLEAN DEFAULT FALSE,
  created_at TIMESTAMP DEFAULT NOW(),
  updated_at TIMESTAMP DEFAULT NOW()
)

post_tags (
  post_id UUID REFERENCES posts(post_id),
  tag_name VARCHAR(50),
  PRIMARY KEY (post_id, tag_name)
)

comments (
  comment_id UUID PRIMARY KEY,
  post_id UUID REFERENCES posts(post_id),
  user_id UUID REFERENCES users(user_id),
  parent_comment_id UUID REFERENCES comments(comment_id),
  content TEXT NOT NULL,
  upvotes INT DEFAULT 0,
  is_best_answer BOOLEAN DEFAULT FALSE,
  created_at TIMESTAMP DEFAULT NOW()
)

study_groups (
  group_id UUID PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  creator_id UUID REFERENCES users(user_id),
  is_public BOOLEAN DEFAULT TRUE,
  max_members INT DEFAULT 50,
  member_count INT DEFAULT 1,
  created_at TIMESTAMP DEFAULT NOW()
)

group_members (
  group_id UUID REFERENCES study_groups(group_id),
  user_id UUID REFERENCES users(user_id),
  role ENUM('admin', 'member'),
  joined_at TIMESTAMP DEFAULT NOW(),
  PRIMARY KEY (group_id, user_id)
)
```

**Micro-Internships**
```sql
companies (
  company_id UUID PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  industry VARCHAR(100),
  size ENUM('1-10', '11-50', '51-200', '201-500', '500+'),
  website_url TEXT,
  logo_url TEXT,
  is_verified BOOLEAN DEFAULT FALSE,
  created_at TIMESTAMP DEFAULT NOW()
)

job_postings (
  job_id UUID PRIMARY KEY,
  company_id UUID REFERENCES companies(company_id),
  title VARCHAR(255) NOT NULL,
  description TEXT NOT NULL,
  required_skills TEXT[], -- Array of skills
  duration_weeks INT,
  compensation_type ENUM('paid', 'unpaid', 'stipend'),
  compensation_amount DECIMAL(12,2),
  location_type ENUM('remote', 'on-site', 'hybrid'),
  location VARCHAR(255),
  application_deadline DATE,
  status ENUM('open', 'closed', 'filled'),
  view_count INT DEFAULT 0,
  created_at TIMESTAMP DEFAULT NOW(),
  updated_at TIMESTAMP DEFAULT NOW()
)

applications (
  application_id UUID PRIMARY KEY,
  job_id UUID REFERENCES job_postings(job_id),
  user_id UUID REFERENCES users(user_id),
  cover_letter TEXT,
  status ENUM('applied', 'reviewed', 'shortlisted', 'interview', 'offered', 'rejected', 'withdrawn'),
  applied_at TIMESTAMP DEFAULT NOW(),
  updated_at TIMESTAMP DEFAULT NOW()
)
```

**Mentorship**
```sql
mentors (
  mentor_id UUID REFERENCES users(user_id) PRIMARY KEY,
  expertise_areas TEXT[], -- e.g., ['Software Engineering', 'Data Science']
  years_experience INT,
  availability_hours_per_week INT,
  max_mentees INT DEFAULT 5,
  current_mentees INT DEFAULT 0,
  rating DECIMAL(3,2),
  total_reviews INT DEFAULT 0,
  bio TEXT,
  created_at TIMESTAMP DEFAULT NOW()
)

mentorship_requests (
  request_id UUID PRIMARY KEY,
  mentee_id UUID REFERENCES users(user_id),
  mentor_id UUID REFERENCES mentors(mentor_id),
  message TEXT,
  status ENUM('pending', 'accepted', 'rejected'),
  created_at TIMESTAMP DEFAULT NOW(),
  updated_at TIMESTAMP DEFAULT NOW()
)

mentorship_sessions (
  session_id UUID PRIMARY KEY,
  mentor_id UUID REFERENCES mentors(mentor_id),
  mentee_id UUID REFERENCES users(user_id),
  scheduled_at TIMESTAMP,
  duration_minutes INT,
  status ENUM('scheduled', 'completed', 'cancelled'),
  notes TEXT,
  created_at TIMESTAMP DEFAULT NOW()
)

mentor_reviews (
  review_id UUID PRIMARY KEY,
  mentor_id UUID REFERENCES mentors(mentor_id),
  mentee_id UUID REFERENCES users(user_id),
  rating INT CHECK (rating >= 1 AND rating <= 5),
  comment TEXT,
  created_at TIMESTAMP DEFAULT NOW()
)
```

**Portfolios**
```sql
portfolios (
  portfolio_id UUID PRIMARY KEY,
  user_id UUID REFERENCES users(user_id) UNIQUE,
  template VARCHAR(50),
  custom_domain VARCHAR(255) UNIQUE,
  is_public BOOLEAN DEFAULT TRUE,
  view_count INT DEFAULT 0,
  created_at TIMESTAMP DEFAULT NOW(),
  updated_at TIMESTAMP DEFAULT NOW()
)

portfolio_projects (
  project_id UUID PRIMARY KEY,
  portfolio_id UUID REFERENCES portfolios(portfolio_id),
  title VARCHAR(255) NOT NULL,
  description TEXT,
  tech_stack TEXT[],
  demo_url TEXT,
  github_url TEXT,
  images TEXT[], -- Array of image URLs
  start_date DATE,
  end_date DATE,
  is_featured BOOLEAN DEFAULT FALSE,
  sequence_order INT,
  created_at TIMESTAMP DEFAULT NOW()
)
```

**Notifications**
```sql
notifications (
  notification_id UUID PRIMARY KEY,
  user_id UUID REFERENCES users(user_id),
  type VARCHAR(50), -- 'job_match', 'mentor_accepted', 'new_reply', etc.
  title VARCHAR(255),
  message TEXT,
  link TEXT, -- Deep link to relevant page
  is_read BOOLEAN DEFAULT FALSE,
  created_at TIMESTAMP DEFAULT NOW()
)

email_preferences (
  user_id UUID REFERENCES users(user_id) PRIMARY KEY,
  weekly_progress BOOLEAN DEFAULT TRUE,
  job_recommendations BOOLEAN DEFAULT TRUE,
  application_updates BOOLEAN DEFAULT TRUE,
  mentor_messages BOOLEAN DEFAULT TRUE,
  community_replies BOOLEAN DEFAULT TRUE,
  marketing BOOLEAN DEFAULT FALSE
)
```

**Analytics**
```sql
job_market_data (
  id UUID PRIMARY KEY,
  skill_name VARCHAR(255) NOT NULL,
  demand_score INT, -- 0-100
  avg_salary DECIMAL(12,2),
  job_count INT,
  growth_rate DECIMAL(5,2), -- Percentage
  data_date DATE NOT NULL,
  source VARCHAR(100), -- 'linkedin', 'vietnamworks', etc.
  created_at TIMESTAMP DEFAULT NOW()
)

user_activities (
  activity_id UUID PRIMARY KEY,
  user_id UUID REFERENCES users(user_id),
  activity_type VARCHAR(50), -- 'page_view', 'module_complete', etc.
  metadata JSONB,
  created_at TIMESTAMP DEFAULT NOW()
)
```

### 7.2. Data Volume Estimates (Year 1)

| Entity | Initial | Month 1 | Month 6 | Year 1 |
|--------|---------|---------|---------|--------|
| Users | 100 | 1,000 | 10,000 | 50,000 |
| Posts | 50 | 500 | 5,000 | 30,000 |
| Job Postings | 20 | 100 | 500 | 2,000 |
| Applications | 50 | 500 | 5,000 | 30,000 |
| Learning Modules | 500 | 800 | 1,500 | 3,000 |
| User Progress | 1,000 | 10,000 | 100,000 | 500,000 |

**Storage Estimate:**
- Database: ~50GB (Year 1)
- File storage (images, videos): ~200GB (Year 1)

---

## 8. INTEGRATION REQUIREMENTS

### 8.1. Third-Party Integrations

#### INT-001: OAuth Providers
**Providers:** Google, Facebook  
**Purpose:** Social login  
**APIs:** OAuth 2.0  
**Priority:** P0

---

#### INT-002: Email Service
**Provider:** SendGrid / AWS SES  
**Purpose:** Transactional emails, newsletters  
**Volume:** 10,000 emails/month (Year 1)  
**Priority:** P0

---

#### INT-003: SMS Service
**Provider:** Twilio / ESMS.vn (Vietnam)  
**Purpose:** OTP verification  
**Volume:** 5,000 SMS/month  
**Priority:** P1

---

#### INT-004: Cloud Storage
**Provider:** AWS S3 / Cloudflare R2  
**Purpose:** Store images, files, videos  
**Priority:** P0

---

#### INT-005: CDN
**Provider:** Cloudflare / AWS CloudFront  
**Purpose:** Fast content delivery  
**Priority:** P1

---

#### INT-006: Payment Gateway (Phase 2)
**Provider:** VNPay / Momo / Stripe  
**Purpose:** Premium subscriptions, course payments  
**Priority:** P2

---

#### INT-007: Job Boards API
**Providers:** LinkedIn API, VietnamWorks, TopCV  
**Purpose:** Crawl job market data  
**Frequency:** Daily  
**Priority:** P1

---

#### INT-008: GitHub Integration
**Purpose:** Auto-import projects for portfolio  
**API:** GitHub REST API v3  
**Priority:** P2

---

#### INT-009: Analytics
**Provider:** Google Analytics 4 / Mixpanel  
**Purpose:** User behavior tracking  
**Priority:** P1

---

#### INT-010: Monitoring & Logging
**Provider:** Sentry (errors) + DataDog (APM)  
**Purpose:** Error tracking, performance monitoring  
**Priority:** P0

---

## 9. BUSINESS RULES

### BR-001: User Eligibility
- Người dùng phải ≥16 tuổi để đăng ký
- Employer phải verify business email

### BR-002: Assessment Retake
- Career assessment chỉ có thể retake sau 6 tháng
- Roadmap được update based on latest assessment

### BR-003: Points & Levels
- Points không thể âm
- Daily caps áp dụng cho một số actions (prevent gaming)
- Points không thể transfer giữa users

### BR-004: Job Applications
- User chỉ có thể apply 1 lần cho mỗi job posting
- Không thể apply cho expired jobs
- Employer chỉ nhìn thấy profile của applicants

### BR-005: Mentor-Mentee Ratio
- 1 mentor tối đa 5 mentees đồng thời
- Mentee có thể có tối đa 2 mentors

### BR-006: Content Moderation
- Flagged content cần review trong 24 giờ
- User bị warning 3 lần → suspend 7 ngày
- User bị ban nếu vi phạm nghiêm trọng

### BR-007: Premium Features (Phase 2)
- Free users: 1 roadmap, basic analytics
- Premium users: Unlimited roadmaps, advanced analytics, priority support

### BR-008: Data Retention
- Inactive users (>2 years no login) → data archived
- Deleted accounts → data soft delete (30 days) → hard delete

---

## 10. CONSTRAINTS VÀ ASSUMPTIONS

### 10.1. Constraints

**Technical Constraints:**
- Budget: ~$5,000/month infrastructure (Year 1)
- Team size: 4-6 developers
- Timeline: 6 months to MVP
- Must use open-source technologies (cost)

**Business Constraints:**
- Target market: Vietnam only (Phase 1)
- Language: Tiếng Việt primarily
- Compliance: Vietnam Cybersecurity Law
- No blockchain credentials (Phase 1 - complexity)

**User Constraints:**
- Users may have slow internet (mobile 3G)
- Limited tech literacy (simple UX required)
- Mobile-heavy usage (60%+ on mobile)

---

### 10.2. Assumptions

**User Assumptions:**
- 70% users là sinh viên (18-25 tuổi)
- 80% users access từ mobile devices
- Average session time: 15-20 phút
- 30% conversion rate (visitor → sign up)

**Business Assumptions:**
- Employers willing to pay for talent access (Phase 2)
- Users motivated by gamification và certificates
- Mentors willing to volunteer (initial phase)
- Job market data available via public APIs/crawling

**Technical Assumptions:**
- Cloud infrastructure reliable (AWS/GCP)
- Third-party APIs stable
- AI models có thể train với limited initial data
- Open-source LMS content available

---

## 11. SUCCESS METRICS

### 11.1. North Star Metric
**Active Learners:** Users hoàn thành ít nhất 1 learning module/week

### 11.2. Key Performance Indicators (KPIs)

#### User Acquisition
| Metric | Target (Month 3) | Target (Month 6) | Target (Year 1) |
|--------|------------------|------------------|-----------------|
| Total Users | 1,500 | 10,000 | 50,000 |
| MoM Growth | 30% | 20% | 15% |
| CAC (Cost per Acquisition) | $3 | $2 | $1.5 |

#### User Engagement
| Metric | Target |
|--------|--------|
| DAU (Daily Active Users) | 500 (Month 6) |
| WAU (Weekly Active Users) | 2,000 (Month 6) |
| MAU (Monthly Active Users) | 7,000 (Month 6) |
| Session Duration | 15+ minutes |
| Retention Rate (Day 7) | 40% |
| Retention Rate (Day 30) | 25% |

#### Learning Outcomes
| Metric | Target |
|--------|--------|
| Career Assessment Completion Rate | 75% |
| Average Modules Completed/User | 5 (Month 6) |
| Roadmap Completion Rate | 20% (Month 6) |
| Certificate Issued | 500 (Month 6) |

#### Community
| Metric | Target |
|--------|--------|
| Posts/Day | 50 (Month 6) |
| Comments/Post | 3 average |
| Active Mentors | 50 (Month 6) |
| Mentor Sessions | 200 (Month 6) |

#### Marketplace
| Metric | Target |
|--------|--------|
| Job Postings | 100/month (Month 6) |
| Applications/Posting | 15 average |
| Acceptance Rate | 10% |
| Partner Companies | 20 (Month 6) |

#### Business
| Metric | Target |
|--------|--------|
| NPS (Net Promoter Score) | 50+ |
| CSAT (Customer Satisfaction) | 4.2/5 |
| Referral Rate | 20% |
| Revenue | $10,000/month (Month 12, Phase 2) |

---

## 12. ROADMAP VÀ PRIORITIES

### 12.1. Phase 1 - MVP (Month 1-3)

**Sprint 1-2 (Weeks 1-4): Foundation**
- [ ] Setup infrastructure (servers, DB, CI/CD)
- [ ] User authentication & profile management
- [ ] Basic UI/UX framework
- [ ] Admin dashboard (basic)

**Sprint 3-4 (Weeks 5-8): Core Features**
- [ ] Career assessment (test + algorithm)
- [ ] Career recommendations
- [ ] Learning roadmap generation (manual curated content)
- [ ] Progress tracking

**Sprint 5-6 (Weeks 9-12): Engagement**
- [ ] Gamification (points, levels, badges)
- [ ] Basic forum (posts, comments)
- [ ] Notifications (in-app + email)
- [ ] Mobile responsive

**Launch Criteria:**
- 500+ learning modules curated
- 20 career paths defined
- 50 beta users tested và feedback incorporated

---

### 12.2. Phase 2 - Growth (Month 4-6)

**Sprint 7-8 (Weeks 13-16): Marketplace**
- [ ] Company registration và verification
- [ ] Job posting creation
- [ ] Job search và filtering
- [ ] Application system

**Sprint 9-10 (Weeks 17-20): Community++**
- [ ] Study groups
- [ ] Mentor-mentee matching
- [ ] Live chat
- [ ] Portfolio builder

**Sprint 11-12 (Weeks 21-24): Polish & Scale**
- [ ] AI roadmap personalization (ML model)
- [ ] Advanced analytics dashboard
- [ ] Performance optimization
- [ ] Security audit
- [ ] Marketing push

---

### 12.3. Phase 3 - Monetization (Month 7-12)

**Features:**
- [ ] Premium subscription tiers
- [ ] Payment integration
- [ ] Enterprise features (school/company)
- [ ] Advanced AI coach
- [ ] Video courses
- [ ] Certification programs (paid)

**Business Development:**
- [ ] Partner với 50+ companies
- [ ] Partner với 10+ universities
- [ ] Revenue: $10K/month
- [ ] Break-even point

---

### 12.4. Phase 4 - Expansion (Year 2+)

**Features:**
- [ ] Native mobile apps (iOS/Android)
- [ ] AR/VR career preview
- [ ] Blockchain credentials
- [ ] Live streaming (study together)
- [ ] English language support
- [ ] International content

**Markets:**
- [ ] Expand to Thailand, Indonesia
- [ ] ASEAN regional platform

---

## 13. RISKS VÀ MITIGATION

### RISK-001: Low User Adoption
**Probability:** Medium  
**Impact:** High  
**Mitigation:**
- Partner với universities for initial user base
- Referral program with incentives
- Content marketing (blog, social media)
- Free tier with valuable features

---

### RISK-002: Poor Content Quality
**Probability:** Medium  
**Impact:** High  
**Mitigation:**
- Curate content from reputable sources
- Partner with educators/professionals
- User reviews và ratings
- Continuous content update

---

### RISK-003: Low Employer Participation
**Probability:** Medium  
**Impact:** Medium  
**Mitigation:**
- Free posting initially
- Reach out directly to HR departments
- Success stories showcase
- Provide analytics on candidates

---

### RISK-004: Scalability Issues
**Probability:** Low  
**Impact:** High  
**Mitigation:**
- Cloud auto-scaling
- Database optimization (indexes, caching)
- Load testing before launches
- Monitoring và alerting

---

### RISK-005: Security Breach
**Probability:** Low  
**Impact:** Critical  
**Mitigation:**
- Penetration testing
- Regular security audits
- Follow OWASP guidelines
- Bug bounty program
- Incident response plan

---

### RISK-006: AI Bias in Recommendations
**Probability:** Medium  
**Impact:** Medium  
**Mitigation:**
- Diverse training data
- Regular model audits
- Allow user feedback on recommendations
- Human-in-the-loop for edge cases

---

## 14. APPENDIX

### 14.1. Glossary

| Term | Definition |
|------|------------|
| **Micro-Internship** | Short-term (1-12 weeks) project-based internship |
| **Learning Roadmap** | Personalized curriculum from beginner to career-ready |
| **Milestone** | Major checkpoint in learning roadmap |
| **Module** | Individual learning unit (lesson, quiz, project) |
| **DAU/MAU** | Daily/Monthly Active Users |
| **NPS** | Net Promoter Score - loyalty metric |
| **CAC** | Customer Acquisition Cost |
| **Gamification** | Game elements (points, badges) in non-game context |
| **Big Five** | Personality model (Openness, Conscientiousness, Extraversion, Agreeableness, Neuroticism) |
| **Holland Code (RIASEC)** | Career interest model (Realistic, Investigative, Artistic, Social, Enterprising, Conventional) |

---

### 14.2. References

**Industry Research:**
- Vietnam IT Market Report 2025
- LinkedIn Future of Work Report
- Coursera Global Skills Index

**Competing Platforms:**
- Coursera, Udemy (international)
- Edumall (Vietnam e-learning)
- TopCV, VietnamWorks (job boards)

**Technology Stack References:**
- Next.js Documentation
- PostgreSQL Best Practices
- OAuth 2.0 Specification

---

### 14.3. Contact & Approvals

**Business Analyst:**
- Name: [Your Name]
- Email: ba@careernav.vn
- Date: 13/01/2026

**Stakeholder Approvals:**
- [ ] Product Owner: _________________ Date: _______
- [ ] Technical Lead: _________________ Date: _______
- [ ] UX Designer: ___________________ Date: _______
- [ ] Project Sponsor: ________________ Date: _______

---

**Version History:**

| Version | Date | Author | Changes |
|---------|------|--------|---------|
| 1.0 | 13/01/2026 | BA Team | Initial draft |
|  |  |  |  |

---

**END OF DOCUMENT**

Total Pages: 47  
Total Requirements: 80+ (FR + NFR)  
Total User Stories: 15+  
Estimated Reading Time: 60 minutes

