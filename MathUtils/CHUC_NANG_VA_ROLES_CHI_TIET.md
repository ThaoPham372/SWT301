# TÀI LIỆU CHI TIẾT CHỨC NĂNG VÀ PHÂN QUYỀN

# NỀN TẢNG ĐÁNH GIÁ NĂNG LỰC & ĐỊNH HƯỚNG NGHỀ NGHIỆP

**Phiên bản:** 1.0  
**Ngày:** 13/01/2026  
**Mục đích:** Assessment & Certification Platform với Career Roadmap Recommendation

---

## MỤC LỤC

1. [Tổng quan hệ thống](#1-tổng-quan-hệ-thống)
2. [Phân tích Roles và Quyền hạn](#2-phân-tích-roles-và-quyền-hạn)
3. [Chi tiết Chức năng theo Role](#3-chi-tiết-chức-năng-theo-role)
4. [Ma trận Phân quyền](#4-ma-trận-phân-quyền)
5. [User Journey theo từng Role](#5-user-journey-theo-từng-role)
6. [Workflow chính](#6-workflow-chính)

---

## 1. TỔNG QUAN HỆ THỐNG

### 1.1. Mục đích chính

Nền tảng cho phép người học:

- ✅ **Làm bài test** để đánh giá kiến thức đã học
- ✅ **Nhận chứng chỉ** khi đạt yêu cầu
- ✅ **Định hướng nghề nghiệp** dựa trên kết quả test
- ✅ **Nhận gợi ý lộ trình học** (roadmap) - học ở đâu là quyền của họ
- ✅ **Theo dõi tiến độ** qua các kỳ thi

### 1.2. Scope rõ ràng

✅ **TRONG SCOPE:**

- Hệ thống thi trực tuyến
- Ngân hàng đề thi đa dạng
- Chấm điểm tự động
- Cấp chứng chỉ số
- Đề xuất lộ trình học
- Định hướng nghề nghiệp
- Portfolio/Profile người học
- Thống kê năng lực

❌ **NGOÀI SCOPE:**

- Nội dung học tập (videos, bài giảng)
- Quản lý lớp học
- Live teaching
- Learning Management System (LMS)

---

## 2. PHÂN TÍCH ROLES VÀ QUYỀN HẠN

### 2.1. Danh sách Roles

| STT | Role                    | Mô tả                                  | Số lượng dự kiến |
| --- | ----------------------- | -------------------------------------- | ---------------- |
| 1   | **Admin**               | Quản trị viên hệ thống                 | 2-3 người        |
| 2   | **Chuyên gia nội dung** | Tạo đề thi, câu hỏi, roadmap           | 5-10 người       |
| 3   | **Người học**           | Làm test, nhận chứng chỉ, xem roadmap  | Không giới hạn   |
| 4   | **Nhà tuyển dụng**      | Xem profile, verify chứng chỉ ứng viên | Không giới hạn   |
| 5   | **Mentor**              | Hướng dẫn, tư vấn lộ trình             | 20-50 người      |

---

### 2.2. Chi tiết từng Role

## ROLE 1: ADMIN (Quản trị viên)

### Quyền hạn tổng quát:

- Full access toàn hệ thống
- Quản lý users, content, certificates
- Xem toàn bộ thống kê và báo cáo
- Cấu hình hệ thống

### Chức năng chi tiết:

#### 1.1. Quản lý người dùng

**CN-AD-001: Xem danh sách người dùng**

- Xem tất cả users (Người học, Nhà tuyển dụng, Mentor, Chuyên gia)
- Tìm kiếm theo: tên, email, role, ngày đăng ký
- Filter: Role, Status (Active/Inactive), Verified
- Sort: Ngày tạo, Last login, Số lượng test đã làm
- Phân trang: 20 users/trang

**CN-AD-002: Xem chi tiết người dùng**

- Thông tin cá nhân
- Lịch sử làm test
- Chứng chỉ đã đạt
- Hoạt động gần đây
- Thống kê tổng quan (số test, điểm TB, ranking)

**CN-AD-003: Chỉnh sửa thông tin người dùng**

- Sửa: Tên, email, role
- Xác thực tài khoản (verify)
- Reset password cho user

**CN-AD-004: Khóa/Mở khóa tài khoản**

- Suspend account với lý do
- Ban vĩnh viễn (với lý do vi phạm)
- Unlock account

**CN-AD-005: Phân quyền**

- Thay đổi role của user
- Grant/Revoke permissions đặc biệt

---

#### 1.2. Quản lý nội dung thi

**CN-AD-006: Quản lý danh mục kiến thức**

- Tạo/Sửa/Xóa Categories (VD: Lập trình, Marketing, Design...)
- Tạo/Sửa/Xóa Subcategories (VD: Python, Java, React...)
- Tạo/Sửa/Xóa Topics (VD: Python Basics, OOP, Data Structures...)
- Sắp xếp thứ tự hiển thị
- Active/Inactive category

**CN-AD-007: Duyệt đề thi**

- Xem danh sách đề thi chờ duyệt (từ Chuyên gia nội dung)
- Xem chi tiết đề thi (câu hỏi, đáp án, độ khó)
- Approve/Reject với ghi chú
- Yêu cầu chỉnh sửa

**CN-AD-008: Quản lý đề thi**

- Xem tất cả đề thi (Draft, Published, Archived)
- Publish/Unpublish đề thi
- Archive đề thi cũ
- Xóa đề thi (soft delete)
- Sao chép đề thi

**CN-AD-009: Cấu hình điều kiện đạt chứng chỉ**

- Set điểm tối thiểu để pass (VD: 70%)
- Set số lần được thi lại
- Set thời gian giữa các lần thi
- Set thời hạn chứng chỉ (VD: 2 năm)

---

#### 1.3. Quản lý chứng chỉ

**CN-AD-010: Xem danh sách chứng chỉ**

- Tất cả chứng chỉ đã cấp
- Filter: Loại chứng chỉ, Ngày cấp, User
- Tìm kiếm: Tên user, Mã chứng chỉ

**CN-AD-011: Thu hồi chứng chỉ**

- Revoke certificate với lý do (gian lận, vi phạm)
- Gửi thông báo cho user
- Log lại lịch sử revoke

**CN-AD-012: Tạo mẫu chứng chỉ**

- Design template chứng chỉ (background, logo, layout)
- Customize fields: Tên, Ngày, Điểm, QR code
- Preview trước khi save
- Set làm default template

**CN-AD-013: Verify chứng chỉ**

- Nhập mã chứng chỉ để kiểm tra
- Hiển thị: Valid/Invalid/Revoked
- Thông tin chi tiết: Người nhận, Ngày cấp, Điểm số

---

#### 1.4. Quản lý roadmap

**CN-AD-014: Duyệt roadmap**

- Xem roadmap chờ duyệt (từ Chuyên gia)
- Approve/Reject roadmap
- Yêu cầu chỉnh sửa

**CN-AD-015: Quản lý roadmap**

- Xem tất cả roadmap
- Publish/Unpublish
- Featured roadmap (hiển thị nổi bật)
- Archive roadmap cũ

---

#### 1.5. Thống kê & Báo cáo

**CN-AD-016: Dashboard tổng quan**

- Tổng số users (theo role)
- Số lượng test đã làm (hôm nay, tuần, tháng)
- Số chứng chỉ đã cấp
- Top 10 test phổ biến nhất
- Growth chart (users, tests, certificates)
- Active users (DAU, WAU, MAU)

**CN-AD-017: Báo cáo người dùng**

- User growth (theo thời gian)
- User retention rate
- Conversion rate (visitor → registered → tested)
- Top users (theo số test, điểm số)

**CN-AD-018: Báo cáo bài thi**

- Test completion rate
- Average score by test
- Tỷ lệ pass/fail
- Thời gian làm bài trung bình
- Câu hỏi khó nhất (fail rate cao)

**CN-AD-019: Báo cáo chứng chỉ**

- Số lượng cấp theo thời gian
- Top certificates phổ biến
- Certificate by category

**CN-AD-020: Export báo cáo**

- Export Excel/CSV/PDF
- Schedule email report (weekly/monthly)

---

#### 1.6. Cấu hình hệ thống

**CN-AD-021: Cấu hình chung**

- Tên website, logo, favicon
- Email hệ thống
- Timezone, ngôn ngữ
- Maintenance mode

**CN-AD-022: Cấu hình bảo mật**

- Password policy (độ dài, độ phức tạp)
- Session timeout
- Max login attempts
- IP whitelist (cho admin)

**CN-AD-023: Cấu hình email**

- SMTP settings
- Email templates (welcome, password reset, cert issued)
- Test gửi email

**CN-AD-024: Quản lý nội dung trang**

- Chỉnh sửa: Giới thiệu, FAQ, Điều khoản, Chính sách
- Upload hình ảnh, banner

---

#### 1.7. Kiểm duyệt & An toàn

**CN-AD-025: Xem báo cáo vi phạm**

- Danh sách reports từ users
- Loại vi phạm: Spam, Nội dung không phù hợp, Gian lận
- Review nội dung được report
- Action: Delete content, Warn user, Ban user

**CN-AD-026: Phát hiện gian lận**

- Xem danh sách suspicious activities:
  - Làm bài quá nhanh
  - Điểm cao bất thường
  - Cùng IP nhiều tài khoản
  - Copy answers (pattern matching)
- Investigate và xử lý

---

## ROLE 2: CHUYÊN GIA NỘI DUNG (Content Creator)

### Quyền hạn tổng quát:

- Tạo/Chỉnh sửa câu hỏi, đề thi
- Tạo/Chỉnh sửa roadmap
- Xem thống kê nội dung của mình
- KHÔNG quản lý users

### Chức năng chi tiết:

#### 2.1. Quản lý câu hỏi

**CN-CC-001: Tạo câu hỏi mới**

- Nhập câu hỏi (hỗ trợ Rich text, LaTeX cho công thức)
- Chọn loại câu hỏi:
  - **Trắc nghiệm 1 đáp án** (Single choice)
  - **Trắc nghiệm nhiều đáp án** (Multiple choice)
  - **Đúng/Sai** (True/False)
  - **Điền vào chỗ trống** (Fill in the blank)
  - **Matching** (Nối cột)
  - **Code challenge** (Viết code, auto-grade)
- Thêm đáp án (tối thiểu 2, tối đa 10)
- Đánh dấu đáp án đúng
- Upload hình ảnh minh họa (optional)
- Thêm giải thích (explanation khi user chọn sai)
- Chọn độ khó: Dễ, Trung bình, Khó
- Chọn category/topic
- Thêm tags (VD: Python, Loop, Beginner)
- Save as Draft hoặc Submit for Review

**CN-CC-002: Quản lý ngân hàng câu hỏi**

- Xem danh sách câu hỏi của mình
- Filter: Category, Topic, Độ khó, Status (Draft/Published/Rejected)
- Search câu hỏi
- Sort: Ngày tạo, Độ khó, Usage (số lần dùng)

**CN-CC-003: Chỉnh sửa câu hỏi**

- Sửa nội dung câu hỏi
- Sửa đáp án
- Thay đổi độ khó, category
- Version control (xem lịch sử thay đổi)

**CN-CC-004: Xóa câu hỏi**

- Xóa câu hỏi Draft
- KHÔNG xóa được câu hỏi đã Published (phải Unpublish trước)

**CN-CC-005: Nhân bản câu hỏi**

- Duplicate câu hỏi để tạo biến thể
- Chỉnh sửa ít thay đổi

**CN-CC-006: Preview câu hỏi**

- Xem câu hỏi như user thấy
- Test chức năng chấm điểm

---

#### 2.2. Quản lý đề thi

**CN-CC-007: Tạo đề thi mới**

- Thông tin đề thi:
  - Tên đề thi
  - Mô tả (mục đích, đối tượng)
  - Category/Topic
  - Độ khó tổng thể
  - Thời gian làm bài (phút)
  - Điểm tối thiểu để pass (%)
  - Số lượng câu hỏi
- Chọn loại đề thi:
  - **Fixed Test**: Câu hỏi cố định cho tất cả users
  - **Randomized Test**: Random từ question pool
  - **Adaptive Test**: Câu hỏi thay đổi theo độ khó dựa trên câu trước
- Thêm câu hỏi:
  - Chọn từ ngân hàng câu hỏi
  - Hoặc tạo câu hỏi mới ngay lúc tạo đề
  - Drag & drop để sắp xếp thứ tự
  - Set điểm cho từng câu (point allocation)
- Cấu hình:
  - Cho phép thi lại (Yes/No, max attempts)
  - Shuffle câu hỏi (Yes/No)
  - Shuffle đáp án (Yes/No)
  - Hiển thị đáp án sau khi thi (Yes/No)
  - Hiển thị giải thích (Yes/No)
- Preview đề thi
- Save as Draft hoặc Submit for Review

**CN-CC-008: Quản lý đề thi**

- Xem danh sách đề thi của mình
- Filter: Status (Draft/Pending Review/Published/Rejected)
- Search đề thi
- View số lượng người đã làm

**CN-CC-009: Chỉnh sửa đề thi**

- Chỉnh sửa thông tin, câu hỏi
- KHÔNG sửa được đề đang có người thi (phải Unpublish)
- Version control

**CN-CC-010: Xóa đề thi**

- Xóa đề Draft
- KHÔNG xóa được đề đã Published

**CN-CC-011: Xem thống kê đề thi**

- Số lượng người làm
- Điểm trung bình
- Tỷ lệ pass/fail
- Thời gian làm bài trung bình
- Câu hỏi nào khó nhất (fail rate)
- Distribution chart (phân bố điểm)

---

#### 2.3. Quản lý Roadmap

**CN-CC-012: Tạo roadmap nghề nghiệp**

- Thông tin roadmap:
  - Tên nghề nghiệp (VD: "Backend Developer")
  - Mô tả nghề (responsibilities, job outlook)
  - Mức lương trung bình
  - Skill yêu cầu
  - Thời gian đào tạo dự kiến (tháng)
- Tạo các milestones (giai đoạn):
  - **Milestone 1**: Foundational (VD: "Lập trình cơ bản")
  - **Milestone 2**: Intermediate (VD: "Backend Framework")
  - **Milestone 3**: Advanced (VD: "Microservices & Cloud")
- Mỗi milestone có:
  - Tên, mô tả
  - Thời gian dự kiến (tuần)
  - Skills cần đạt (list skills)
  - **Đề thi để verify** (chọn từ danh sách tests)
  - **Tài nguyên học tập gợi ý** (links):
    - Khóa học online (Udemy, Coursera, YouTube...)
    - Sách (links đến Amazon, Tiki...)
    - Documentation (official docs)
    - Practice platforms (HackerRank, LeetCode...)
    - Projects gợi ý
- Tạo prerequisites (milestone A phải hoàn thành trước milestone B)
- Upload career path diagram/flowchart
- Save as Draft hoặc Submit for Review

**CN-CC-013: Quản lý roadmap**

- Xem danh sách roadmap của mình
- Filter: Status, Category
- View số người đang follow

**CN-CC-014: Chỉnh sửa roadmap**

- Cập nhật thông tin
- Thêm/Xóa milestones
- Update tài nguyên học tập (links mới, links hết hạn)

**CN-CC-015: Xem thống kê roadmap**

- Số người đang follow roadmap
- Tỷ lệ hoàn thành từng milestone
- Average time to complete
- Feedback/rating từ users

---

#### 2.4. Quản lý chứng chỉ

**CN-CC-016: Tạo loại chứng chỉ mới**

- Thông tin chứng chỉ:
  - Tên chứng chỉ (VD: "Python Developer Certificate")
  - Mô tả
  - Yêu cầu đạt chứng chỉ:
    - Phải pass X đề thi
    - Điểm tối thiểu mỗi đề
    - Thời gian hoàn thành (optional)
  - Thời hạn chứng chỉ (VD: 2 năm, hoặc vô thời hạn)
  - Badge design (upload image)
- Submit for review

**CN-CC-017: Xem danh sách người nhận chứng chỉ**

- Xem ai đã đạt chứng chỉ do mình tạo
- Export danh sách

---

#### 2.5. Hỗ trợ người học

**CN-CC-018: Trả lời câu hỏi**

- Xem questions về đề thi/nội dung của mình
- Reply và hỗ trợ

**CN-CC-019: Xem feedback**

- Nhận feedback từ người học về chất lượng đề/câu hỏi
- Improve dựa trên feedback

---

## ROLE 3: NGƯỜI HỌC (Learner/Student)

### Quyền hạn tổng quát:

- Làm test để kiểm tra kiến thức
- Xem kết quả, lời giải
- Nhận chứng chỉ khi đạt
- Xem roadmap gợi ý
- Theo dõi tiến độ
- Build profile/portfolio

### Chức năng chi tiết:

#### 3.1. Quản lý tài khoản

**CN-LN-001: Đăng ký tài khoản**

- Đăng ký bằng email/password
- Đăng ký bằng Google/Facebook OAuth
- Xác thực email (OTP)

**CN-LN-002: Đăng nhập**

- Đăng nhập email/password
- Đăng nhập OAuth
- Remember me
- Forgot password

**CN-LN-003: Quản lý profile**

- Thông tin cá nhân:
  - Họ tên, ảnh đại diện
  - Sinh nhật, giới tính
  - Địa chỉ, số điện thoại
  - Bio (giới thiệu bản thân)
- Thông tin học vấn:
  - Trường đang học/đã học
  - Chuyên ngành
  - Năm học
- Mục tiêu nghề nghiệp:
  - Nghề muốn làm (chọn từ danh sách hoặc nhập)
  - Timeline (VD: 6 tháng, 1 năm)
- Social links:
  - LinkedIn, GitHub, Portfolio website
- Privacy settings:
  - Public/Private profile
  - Ai có thể xem chứng chỉ của tôi

**CN-LN-004: Đổi password**

- Đổi password (nhập old password)
- Bảo mật 2 lớp (optional - Phase 2)

---

#### 3.2. Định hướng nghề nghiệp

**CN-LN-005: Làm bài test định hướng nghề nghiệp**

- Làm Career Assessment Test (30-50 câu):
  - Phần 1: Tính cách (Personality) - 20 câu
  - Phần 2: Sở thích (Interests) - 15 câu
  - Phần 3: Kỹ năng hiện tại (Skills) - 15 câu
- Không giới hạn thời gian
- Có thể save và làm tiếp sau
- Progress bar

**CN-LN-006: Xem kết quả định hướng**

- Kết quả hiển thị:
  - **Top 5 nghề phù hợp** với điểm match (%)
  - Mỗi nghề có:
    - Mô tả công việc
    - Mức lương trung bình (VN)
    - Skills cần thiết
    - Career outlook (triển vọng)
    - Companies đang tuyển (links)
  - Biểu đồ Radar Chart (tính cách, sở thích, kỹ năng)
- So sánh với người dùng khác (optional)
- Download kết quả PDF
- Share lên mạng xã hội

**CN-LN-007: Chọn career goal**

- Chọn 1 trong 5 nghề được gợi ý
- Hoặc tự chọn nghề khác (search)
- Hệ thống generate roadmap tương ứng

**CN-LN-008: Làm lại test định hướng**

- Làm lại sau 6 tháng
- So sánh kết quả cũ vs mới
- Highlight sự thay đổi

---

#### 3.3. Xem và Follow Roadmap

**CN-LN-009: Browse roadmaps**

- Xem tất cả roadmaps available
- Filter: Category (Tech, Business, Design...), Level (Entry/Mid/Senior)
- Search roadmap by keyword
- Sort: Phổ biến nhất, Mới nhất

**CN-LN-010: Xem chi tiết roadmap**

- Xem full roadmap:
  - Overview nghề nghiệp
  - Các milestones (giai đoạn)
  - Skills từng milestone
  - Đề thi để verify
  - **Tài nguyên học tập gợi ý**:
    - Khóa học online (links)
    - Sách đề xuất (links)
    - Documentation
    - Practice platforms
    - Project ideas
- Thời gian hoàn thành dự kiến
- Số người đã follow
- Reviews/ratings

**CN-LN-011: Follow roadmap**

- Click "Bắt đầu roadmap"
- Roadmap được thêm vào "My Roadmaps"
- Bắt đầu track progress

**CN-LN-012: Đánh dấu tiến độ**

- Đánh dấu milestone "Bắt đầu", "Hoàn thành"
- Ghi chú cho mỗi milestone (học gì, ở đâu, cảm nhận)
- Upload proof of learning (optional):
  - Screenshot
  - Project links
  - Course completion cert từ platform khác

**CN-LN-013: Xem tiến độ roadmap**

- Progress bar (%) cho toàn roadmap
- Thời gian đã spent vs estimated
- Milestones completed vs total
- Next milestone gợi ý

---

#### 3.4. Làm bài test kiến thức

**CN-LN-014: Browse tests**

- Xem tất cả tests available
- Filter: Category, Topic, Độ khó, Thời gian
- Search test
- Xem: Số lượng câu hỏi, thời gian, độ khó, rating
- Xem số người đã làm, điểm trung bình

**CN-LN-015: Xem test thuộc roadmap**

- Từ roadmap, click vào test cần làm
- Xem prerequisites (nếu có)

**CN-LN-016: Bắt đầu làm test**

- Đọc instructions (thời gian, số câu, điểm pass)
- Confirm start
- Timer bắt đầu đếm ngược
- Làm từng câu hỏi:
  - Hiển thị 1 câu/trang hoặc tất cả (config)
  - Mark for review (đánh dấu câu muốn xem lại)
  - Navigation: Prev, Next, Jump to question
- Question palette (thumbnail các câu):
  - Answered: Xanh
  - Not answered: Xám
  - Marked: Vàng
- Auto-save answers (mỗi 30s)
- Warning khi còn 5 phút

**CN-LN-017: Submit test**

- Review tất cả câu trước khi submit
- Confirm submit (không thể thay đổi sau khi submit)
- Hệ thống chấm tự động

**CN-LN-018: Xem kết quả ngay lập tức**

- Điểm tổng (X/100)
- Pass/Fail status
- Thời gian hoàn thành
- Breakdown theo topic (nếu có):
  - Topic A: 8/10
  - Topic B: 6/10
- Xem đáp án đúng/sai của từng câu
- Xem giải thích (explanation)
- Xem ranking (vị trí của bạn vs others)

**CN-LN-019: Thi lại (Retake)**

- Nếu fail, có thể thi lại (nếu allowed)
- Xem số lần thi còn lại
- Wait time giữa các lần (nếu có)

**CN-LN-020: Pause test (Phase 2)**

- Save và resume sau (nếu test cho phép)

---

#### 3.5. Xem lịch sử và tiến độ

**CN-LN-021: Xem lịch sử làm bài**

- Tất cả tests đã làm
- Filter: Pass/Fail, Date, Category
- Mỗi test hiển thị: Ngày, Điểm, Status, Time spent
- Re-view test đã làm (câu hỏi + đáp án đã chọn)

**CN-LN-022: Dashboard tiến độ**

- Tổng quan:
  - Số test đã làm
  - Tỷ lệ pass/fail
  - Điểm trung bình
  - Chứng chỉ đã đạt
  - Roadmap progress
- Charts:
  - Score trend (điểm qua thời gian)
  - Tests by category
  - Time spent learning
- Skills radar chart
- Streak (số ngày liên tiếp làm test)

**CN-LN-023: Xem ranking**

- Ranking toàn hệ thống (by total score, by category)
- Vị trí của bạn
- Filter: Global, Friends, School

---

#### 3.6. Quản lý chứng chỉ

**CN-LN-024: Xem chứng chỉ có thể đạt**

- Browse tất cả chứng chỉ available
- Xem yêu cầu (tests phải pass, điểm tối thiểu)
- Track progress đến chứng chỉ (X/Y tests completed)

**CN-LN-025: Xem chứng chỉ đã đạt**

- Danh sách chứng chỉ của mình
- Thông tin: Tên, Ngày cấp, Điểm, Valid until
- View certificate (PDF design đẹp):
  - Tên người nhận
  - Tên chứng chỉ
  - Ngày cấp
  - Chữ ký số
  - QR code (để verify)
  - Certificate ID
- Download PDF
- Share certificate:
  - Copy public link
  - Share lên LinkedIn, Facebook
  - Embed vào portfolio

**CN-LN-026: Verify chứng chỉ của người khác**

- Nhập Certificate ID hoặc scan QR
- Xem: Valid/Invalid/Revoked
- Thông tin: Người nhận, Ngày cấp

---

#### 3.7. Portfolio/Profile công khai

**CN-LN-027: Tạo portfolio tự động**

- Hệ thống auto-generate portfolio page:
  - URL: `platform.vn/@username`
  - Sections:
    - Hero (tên, ảnh, bio)
    - Career Goal
    - Skills (từ tests đã pass)
    - Certificates
    - Test scores (nếu public)
    - Roadmap progress
    - GitHub/LinkedIn links
- Chọn template (3-5 templates đẹp)
- Customize: Colors, show/hide sections

**CN-LN-028: Share profile**

- Copy profile URL
- QR code cho profile
- Add profile link vào CV

**CN-LN-029: Xem profile người khác**

- Search user
- Xem profile public

---

#### 3.8. Community & Tương tác

**CN-LN-030: Hỏi đáp (Q&A Forum)**

- Đặt câu hỏi về test, roadmap, career
- Reply câu hỏi người khác
- Upvote/Downvote
- Mark best answer
- Theo dõi câu hỏi

**CN-LN-031: Tìm study buddy**

- Tìm người cùng học cùng career goal
- Send friend request
- Chat (Phase 2)

**CN-LN-032: Mentor request**

- Browse mentors by expertise
- Send mentor request với message
- Nếu mentor accept:
  - Chat 1-1
  - Schedule meeting (optional)

**CN-LN-033: Đánh giá (Rating & Review)**

- Rate tests (1-5 sao)
- Review roadmap
- Review mentor

---

#### 3.9. Thông báo

**CN-LN-034: Xem notifications**

- Thông báo:
  - Đạt chứng chỉ mới
  - Có test mới thuộc roadmap của bạn
  - Mentor accept/reject request
  - Reply câu hỏi của bạn
  - Reminder: Đã lâu chưa làm test
  - Milestone reminder
- Mark as read

**CN-LN-035: Email notifications**

- Weekly progress report
- Certificate issued
- Application: Cài đặt email preferences

---

## ROLE 4: NHÀ TUYỂN DỤNG (Employer/Recruiter)

### Quyền hạn tổng quát:

- Tìm kiếm ứng viên tiềm năng
- Xem profile và chứng chỉ ứng viên
- Verify chứng chỉ
- Post job openings (optional)

### Chức năng chi tiết:

#### 4.1. Quản lý tài khoản

**CN-EM-001: Đăng ký tài khoản doanh nghiệp**

- Thông tin công ty:
  - Tên công ty
  - Email công ty (corporate email để verify)
  - Địa chỉ, website
  - Lĩnh vực (Industry)
  - Quy mô (1-10, 11-50, 51-200, 200+)
  - Logo
  - Mô tả công ty
- Xác thực email công ty
- Chờ admin approve (nếu cần)

**CN-EM-002: Quản lý company profile**

- Cập nhật thông tin công ty
- Thêm team members (HR khác)

---

#### 4.2. Tìm kiếm ứng viên

**CN-EM-003: Search talent**

- Search candidates:
  - By skills
  - By certificates
  - By career goal
  - By location
  - By graduation year
- Advanced filters:
  - Test scores (min score)
  - Certifications
  - Experience level
  - Availability

**CN-EM-004: Browse profiles**

- Xem danh sách profiles match search
- Preview: Tên, Avatar, Skills, Certs, Score
- Sort: Highest score, Latest certified, Recommended

**CN-EM-005: Xem chi tiết profile**

- View full profile (nếu public):
  - Bio, career goal
  - Skills breakdown
  - Certificates
  - Test history và scores
  - Portfolio (nếu có)
  - Contact info (nếu candidate cho phép)
- Verify certificates (click vào cert → check valid)

**CN-EM-006: Save candidates**

- Add candidate vào "Saved" list
- Add notes (ghi chú nội bộ)
- Categorize (Junior, Senior, Interested...)

---

#### 4.3. Liên hệ ứng viên

**CN-EM-007: Contact candidates**

- Gửi message qua platform
- Hoặc xem email/phone (nếu candidate public)
- Invite to apply job

---

#### 4.4. Đăng tin tuyển dụng (Optional)

**CN-EM-008: Post job opening**

- Tạo job posting:
  - Job title
  - Description
  - Required skills (select from list)
  - Required certificates (optional)
  - Location, Type (Full-time, Intern...)
  - Salary range
  - Application deadline
- Hệ thống auto-match với candidates
- Publish job

**CN-EM-009: Quản lý job postings**

- View all job postings
- Edit/Close posting
- View số lượng views, applications

**CN-EM-010: Xem applications**

- Xem ứng viên apply
- View profile của applicant
- Shortlist/Reject
- Contact applicant

---

#### 4.5. Thống kê

**CN-EM-011: Talent analytics**

- Dashboard:
  - Số lượng profiles viewed
  - Searches performed
  - Saved candidates
  - Jobs posted
  - Applications received

---

## ROLE 5: MENTOR

### Quyền hạn tổng quát:

- Hướng dẫn, tư vấn cho người học
- Trả lời câu hỏi
- Review roadmap progress
- Được đánh giá bởi mentees

### Chức năng chi tiết:

#### 5.1. Quản lý tài khoản Mentor

**CN-MT-001: Đăng ký làm mentor**

- Application form:
  - Expertise areas (select multiple: Python, Career, Marketing...)
  - Years of experience (min 2 năm)
  - Current job title và company
  - LinkedIn profile (verify)
  - Bio (kinh nghiệm, thành tích)
  - Upload CV/Resume
  - Certifications (nếu có)
- Set availability:
  - Giờ/tuần có thể mentor
  - Max number of mentees
- Submit for review
- Admin approve

**CN-MT-002: Quản lý mentor profile**

- Update expertise, availability
- Upload thêm credentials
- View rating và reviews

---

#### 5.2. Quản lý mentees

**CN-MT-003: Xem mentor requests**

- Danh sách requests từ students
- Mỗi request có:
  - Mentee profile
  - Career goal
  - Message/Why they need mentor
  - Match score
- Accept/Reject request với message

**CN-MT-004: Quản lý mentees**

- Danh sách mentees hiện tại
- View progress của từng mentee:
  - Roadmap progress
  - Recent test scores
  - Certificates earned
- Add notes (nội bộ)

**CN-MT-005: Chat với mentees**

- 1-1 chat
- Schedule meeting (optional - Phase 2)

**CN-MT-006: Review progress**

- Xem chi tiết progress mentee
- Give feedback
- Suggest next steps

---

#### 5.3. Hỗ trợ cộng đồng

**CN-MT-007: Trả lời câu hỏi forum**

- Xem questions thuộc expertise area
- Answer questions
- Get points/badges khi helpful

**CN-MT-008: Tạo nội dung**

- Viết blog posts/guides (nếu hệ thống có)
- Share career tips

---

#### 5.4. Thống kê

**CN-MT-009: Mentor dashboard**

- Số mentees hiện tại
- Total mentees đã hỗ trợ
- Average rating
- Number of questions answered
- Impact score

---

## 3. CHI TIẾT CHỨC NĂNG THEO MODULE

### MODULE 1: HỆ THỐNG THI (Testing System)

#### 3.1. Các loại câu hỏi hỗ trợ

**1. Trắc nghiệm 1 đáp án (Single Choice)**

```
Câu hỏi: Python được phát triển bởi ai?
○ Guido van Rossum  [Đúng]
○ James Gosling
○ Brendan Eich
○ Dennis Ritchie

Điểm: 1 point
```

**2. Trắc nghiệm nhiều đáp án (Multiple Choice)**

```
Câu hỏi: Ngôn ngữ nào sau đây là frontend? (Chọn 2)
□ HTML  [Đúng]
□ Python
□ JavaScript  [Đúng]
□ C++

Điểm: 2 points (all or nothing)
Hoặc: Partial credit (1 point mỗi đáp án đúng)
```

**3. Đúng/Sai (True/False)**

```
Câu hỏi: Python là ngôn ngữ compiled.
○ Đúng
● Sai  [Đúng]

Điểm: 1 point
```

**4. Điền vào chỗ trống (Fill in the Blank)**

```
Câu hỏi: Python sử dụng từ khóa _____ để định nghĩa hàm.

[def]  ← User nhập

Đáp án chấp nhận: def, DEF (case-insensitive option)
Điểm: 1 point
```

**5. Matching (Nối cột)**

```
Nối cột A với cột B:

Column A          Column B
1. HTML       →   A. Database
2. CSS        →   B. Markup Language  [1-B]
3. MySQL      →   C. Styling  [2-C]
                 D. Programming
                    [3-A]

Điểm: 3 points (1 point/match đúng)
```

**6. Code Challenge**

```
Câu hỏi: Viết hàm tính giai thừa của n

def factorial(n):
    # Code của user
    if n == 0:
        return 1
    return n * factorial(n-1)

Test cases:
- factorial(0) → 1  ✓
- factorial(5) → 120  ✓
- factorial(10) → 3628800  ✓

Auto-graded: Run code với test cases
Điểm: 5 points
```

---

### MODULE 2: CHỨNG CHỈ (Certification System)

#### 2.1. Loại chứng chỉ

**1. Single Test Certificate**

- Hoàn thành 1 test với điểm ≥ X%
- VD: "Python Basics Certificate"

**2. Multi-Test Certificate**

- Hoàn thành nhiều tests
- VD: "Full Stack Developer Certificate"
  - Pass: HTML/CSS Test
  - Pass: JavaScript Test
  - Pass: React Test
  - Pass: Node.js Test
  - Pass: Database Test

**3. Roadmap Completion Certificate**

- Hoàn thành toàn bộ roadmap
- VD: "Backend Engineer Learning Path Certificate"

**4. Skill-Based Certificate**

- Đạt điểm tối thiểu trong tất cả tests của 1 skill category
- VD: "Data Science Expert Certificate"

#### 2.2. Thiết kế chứng chỉ

**Thông tin trên chứng chỉ:**

```
┌─────────────────────────────────────┐
│       [LOGO PLATFORM]               │
│                                     │
│   CERTIFICATE OF ACHIEVEMENT        │
│                                     │
│        Proudly Presented to         │
│         NGUYỄN VĂN A                │
│                                     │
│           For Successfully          │
│      Completing and Passing         │
│    "Python Developer Certificate"   │
│                                     │
│   Score: 92/100                     │
│   Date: 13/01/2026                  │
│   Valid Until: 13/01/2028           │
│                                     │
│   Certificate ID: CERT-2026-001234  │
│   [QR CODE]                         │
│                                     │
│   _______________                   │
│   [Digital Signature]               │
│   Issued by Platform                │
└─────────────────────────────────────┘
```

**Tính năng chứng chỉ:**

- Download PDF (high quality)
- Shareable link: `platform.vn/cert/CERT-2026-001234`
- QR code verification
- Blockchain verification (Phase 2)
- LinkedIn share button
- Embed code cho website

---

### MODULE 3: ROADMAP (Career Roadmap)

#### 3.1. Cấu trúc roadmap

**Ví dụ: Backend Developer Roadmap**

```
ROADMAP: Backend Developer
Duration: 9-12 tháng
Level: Beginner → Advanced

┌──────────────────────────────────────┐
│ MILESTONE 1: Lập trình cơ bản       │
│ Duration: 8 tuần                     │
│ Skills:                              │
│ - Python Basics                      │
│ - Data Structures                    │
│ - OOP                                │
│                                      │
│ Tài nguyên học:                      │
│ 📺 [Python for Beginners - YouTube] │
│ 📖 [Automate Boring Stuff - Book]   │
│ 💻 [HackerRank Python Track]        │
│                                      │
│ Tests để verify:                     │
│ ✓ Python Basics Test (pass ≥70%)   │
│ ✓ OOP Test (pass ≥70%)             │
└──────────────────────────────────────┘
        ↓
┌──────────────────────────────────────┐
│ MILESTONE 2: Web Backend            │
│ Duration: 10 tuần                    │
│ Skills:                              │
│ - HTTP/REST API                      │
│ - Flask/Django                       │
│ - Database (SQL)                     │
│                                      │
│ Tài nguyên học:                      │
│ 📺 [REST API Tutorial - Udemy]      │
│ 📖 [Django Official Docs]           │
│ 💻 [Build a Blog Project]           │
│                                      │
│ Tests:                               │
│ ✓ REST API Test                     │
│ ✓ Django Test                       │
│ ✓ SQL Test                          │
└──────────────────────────────────────┘
        ↓
┌──────────────────────────────────────┐
│ MILESTONE 3: Advanced Topics        │
│ Duration: 12 tuần                    │
│ ...                                  │
└──────────────────────────────────────┘
```

#### 3.2. Follow roadmap flow

```
1. User chọn roadmap → Click "Bắt đầu"
2. Hệ thống unlock Milestone 1
3. User học từ tài nguyên gợi ý (ngoài platform)
4. User về platform làm test để verify
5. Nếu pass → Unlock Milestone 2
6. Repeat...
7. Complete tất cả → Nhận Roadmap Completion Certificate
```

---

## 4. MA TRẬN PHÂN QUYỀN

### 4.1. Ma trận quyền đầy đủ

| Chức năng               | Admin | Chuyên gia | Người học | Nhà tuyển dụng | Mentor |
| ----------------------- | :---: | :--------: | :-------: | :------------: | :----: |
| **User Management**     |
| Xem tất cả users        |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| Xóa/Ban users           |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| Phân quyền              |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| **Content Management**  |
| Tạo câu hỏi             |  ✅   |     ✅     |    ❌     |       ❌       |   ❌   |
| Duyệt câu hỏi           |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| Tạo đề thi              |  ✅   |     ✅     |    ❌     |       ❌       |   ❌   |
| Duyệt đề thi            |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| Publish đề thi          |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| Tạo roadmap             |  ✅   |     ✅     |    ❌     |       ❌       |   ✅   |
| Duyệt roadmap           |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| **Testing**             |
| Làm test                |  ✅   |     ✅     |    ✅     |       ❌       |   ✅   |
| Xem đáp án              |  ✅   |     ✅     |    ✅     |       ❌       |   ✅   |
| Xem thống kê test       |  ✅   |  ✅ (own)  | ✅ (own)  |       ❌       |   ❌   |
| **Certificates**        |
| Tạo loại cert           |  ✅   |     ✅     |    ❌     |       ❌       |   ❌   |
| Cấp cert                |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| Thu hồi cert            |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| Verify cert             |  ✅   |     ✅     |    ✅     |       ✅       |   ✅   |
| Download own cert       |   -   |     ✅     |    ✅     |       -        |   ✅   |
| **Roadmap**             |
| View roadmap            |  ✅   |     ✅     |    ✅     |       ✅       |   ✅   |
| Follow roadmap          |  ❌   |     ❌     |    ✅     |       ❌       |   ❌   |
| Track progress          |  ❌   |     ❌     |    ✅     |       ❌       |   ❌   |
| **Talent Search**       |
| Search candidates       |  ❌   |     ❌     |    ❌     |       ✅       |   ❌   |
| View profiles           |  ✅   |     ❌     |    ✅     |       ✅       |   ✅   |
| Contact candidates      |  ❌   |     ❌     |    ❌     |       ✅       |   ❌   |
| **Mentorship**          |
| Become mentor           |  ❌   |     ❌     |    ❌     |       ❌       |   ✅   |
| Request mentor          |  ❌   |     ❌     |    ✅     |       ❌       |   ❌   |
| Accept mentees          |  ❌   |     ❌     |    ❌     |       ❌       |   ✅   |
| **Reports & Analytics** |
| System-wide stats       |  ✅   |     ❌     |    ❌     |       ❌       |   ❌   |
| Own content stats       |  ✅   |     ✅     |    ❌     |       ❌       |   ❌   |
| Own progress stats      |   -   |     ✅     |    ✅     |       -        |   ✅   |
| Employer analytics      |  ❌   |     ❌     |    ❌     |       ✅       |   ❌   |

---

## 5. USER JOURNEY THEO TỪNG ROLE

### 5.1. User Journey - NGƯỜI HỌC (Typical Flow)

**Journey 1: Từ mới đăng ký đến nhận chứng chỉ đầu tiên**

```
NGÀY 1: Khám phá
├─ Đăng ký tài khoản (email/Google)
├─ Hoàn thiện profile (tên, ảnh, thông tin)
├─ Làm Career Assessment Test (30 phút)
├─ Nhận kết quả: Top 5 nghề phù hợp
├─ Chọn career goal: "Backend Developer"
└─ Hệ thống generate roadmap

NGÀY 2-7: Milestone 1
├─ View roadmap chi tiết
├─ Click Milestone 1: "Programming Fundamentals"
├─ Xem tài nguyên gợi ý (links đến Coursera, YouTube...)
├─ User tự học ở các platform đó (1 tuần)
└─ [Học ngoài platform]

NGÀY 8: Test kiến thức
├─ Quay lại platform
├─ Làm "Python Basics Test" (20 câu, 30 phút)
├─ Kết quả: 85/100 - PASS ✓
├─ Xem đáp án + giải thích
├─ Hệ thống unlock Milestone 2
└─ Nhận email chúc mừng

TUẦN 2-4: Tiếp tục
├─ Follow Milestone 2
├─ Học từ tài nguyên gợi ý
├─ Làm thêm tests liên quan:
│  ├─ Data Structures Test - 78/100 PASS
│  ├─ OOP Test - 92/100 PASS
└─ Complete Milestone 1 ✓

THÁNG 3: Nhận chứng chỉ
├─ Complete tất cả milestones
├─ Hệ thống tự động issue:
│  "Backend Developer Learning Path Certificate"
├─ Download PDF
├─ Share lên LinkedIn
└─ Add vào portfolio

THÁNG 4+: Tìm việc
├─ Profile đã có:
│  ├─ 15 tests passed
│  ├─ 3 certificates
│  ├─ Roadmap completed
├─ Nhà tuyển dụng tìm thấy profile
├─ Nhận job offer 🎉
```

---

### 5.2. User Journey - NHÀ TUYỂN DỤNG

```
NGÀY 1: Đăng ký
├─ Đăng ký company account
├─ Verify corporate email
├─ Hoàn thiện company profile
└─ Admin approve (24h)

NGÀY 2: Tìm kiếm talent
├─ Đăng nhập employer dashboard
├─ Search candidates:
│  ├─ Skill: "Python"
│  ├─ Certificate: "Backend Developer"
│  ├─ Location: "Hà Nội"
│  └─ Min score: 75
├─ Kết quả: 45 candidates match
├─ Sort by: Highest score
└─ Browse profiles

NGÀY 3: Review candidates
├─ Click vào profile ứng viên A:
│  ├─ View certificates (verify valid ✓)
│  ├─ View test scores (avg 88/100)
│  ├─ View skills breakdown
│  ├─ View portfolio
├─ Save candidate
├─ Add note: "Good for Junior position"
└─ Repeat cho top 10 candidates

NGÀY 4: Liên hệ
├─ Send message qua platform
├─ Hoặc xem email (nếu public)
├─ Invite to interview
└─ Track responses

TUẦN 2: Post job (Optional)
├─ Create job posting:
│  ├─ Title: "Junior Backend Dev"
│  ├─ Required cert: "Python Developer"
│  ├─ Salary: 15-20M
├─ Publish
├─ Hệ thống auto-match 30 candidates
├─ Send notification đến matching candidates
└─ Receive applications

THÁNG 2+: Hire & Repeat
├─ Interview candidates
├─ Hire successful candidates
├─ Continue using platform cho future hiring
└─ Subscription renewal (nếu có phí)
```

---

### 5.3. User Journey - CHUYÊN GIA NỘI DUNG

```
TUẦN 1: Onboarding
├─ Admin tạo account và grant "Content Creator" role
├─ Đăng nhập, xem dashboard
├─ Tutorial về cách tạo câu hỏi, đề thi
└─ Xem guideline chất lượng

TUẦN 2: Tạo câu hỏi
├─ Click "Tạo câu hỏi mới"
├─ Chọn category: "Programming" > "Python"
├─ Nhập 50 câu hỏi Python:
│  ├─ 20 câu dễ (Basics)
│  ├─ 20 câu trung bình (OOP, Functions)
│  └─ 10 câu khó (Advanced)
├─ Mỗi câu có:
│  ├─ Question text
│  ├─ 4 đáp án
│  ├─ Đáp án đúng
│  ├─ Giải thích
│  └─ Hình minh họa (nếu cần)
└─ Submit for review

TUẦN 3: Tạo đề thi
├─ Admin approve 45/50 câu
├─ Tạo đề thi: "Python Fundamentals Test"
├─ Add 30 câu từ question bank:
│  ├─ 15 câu dễ
│  ├─ 10 câu TB
│  └─ 5 câu khó
├─ Set thời gian: 45 phút
├─ Set điểm pass: 70%
├─ Preview test
└─ Submit for review

TUẦN 4: Tạo roadmap
├─ Tạo "Python Developer Roadmap"
├─ 3 milestones:
│  ├─ M1: Python Basics (8 tuần)
│  │   ├─ Skills: Syntax, Data types, Functions
│  │   ├─ Tests: Python Fundamentals Test
│  │   └─ Tài nguyên: [20 links đến courses]
│  ├─ M2: Advanced Python (10 tuần)
│  └─ M3: Frameworks (12 tuần)
├─ Upload roadmap visual (flowchart)
└─ Submit for review

THÁNG 2+: Maintain & Improve
├─ Admin approve roadmap → Publish
├─ 100+ users follow roadmap
├─ Xem feedback từ users:
│  ├─ "Câu 15 test Python khó quá"
│  ├─ "Thiếu tài nguyên về decorators"
├─ Update:
│  ├─ Adjust độ khó câu 15
│  ├─ Thêm links về decorators
├─ Xem thống kê:
│  ├─ Test completion rate: 85%
│  ├─ Average score: 76/100
│  └─ Pass rate: 68%
└─ Iterate và improve content
```

---

## 6. WORKFLOW CHÍNH

### 6.1. Workflow: Tạo và Publish đề thi

```
┌──────────────────────┐
│ Chuyên gia nội dung  │
│ Tạo câu hỏi          │
└──────────┬───────────┘
           │
           ↓
    ┌──────────────┐
    │ Save Draft   │
    └──────┬───────┘
           │
           ↓
    ┌────────────────────┐
    │ Submit for Review  │
    └──────┬─────────────┘
           │
           ↓
    ┌────────────┐
    │   Admin    │
    │   Review   │
    └──────┬─────┘
           │
      ┌────┴────┐
      │         │
      ↓         ↓
  ┌────────┐ ┌────────┐
  │Approve │ │Reject  │
  └───┬────┘ └───┬────┘
      │          │
      │          ↓
      │     ┌────────────────────┐
      │     │Send feedback       │
      │     │Request changes     │
      │     └────────┬───────────┘
      │              │
      │              ↓
      │     ┌──────────────────┐
      │     │Chuyên gia revise │
      │     └────────┬─────────┘
      │              │
      └──────────────┘
      │
      ↓
┌──────────────┐
│  Published   │
│  Available   │
│  for users   │
└──────────────┘
```

---

### 6.2. Workflow: Người học làm test và nhận cert

```
┌────────────────┐
│ User browse    │
│ available tests│
└────────┬───────┘
         │
         ↓
┌──────────────────┐
│ Select test      │
│ Read instructions│
└────────┬─────────┘
         │
         ↓
┌──────────────┐
│ Start test   │
│ Timer starts │
└────────┬─────┘
         │
         ↓
┌────────────────────┐
│ Answer questions   │
│ (auto-save)        │
└────────┬───────────┘
         │
    ┌────┴─────┐
    │          │
    ↓          ↓
┌────────┐ ┌────────────┐
│Time up │ │User submits│
│Auto-   │ │manually    │
│submit  │ │            │
└───┬────┘ └─────┬──────┘
    │            │
    └────┬───────┘
         │
         ↓
┌────────────────┐
│ Auto-grading   │
│ Calculate score│
└────────┬───────┘
         │
         ↓
┌────────────────────┐
│ Display results    │
│ Score, Pass/Fail   │
└────────┬───────────┘
         │
    ┌────┴─────┐
    │          │
    ↓          ↓
┌──────┐   ┌──────┐
│ Pass │   │ Fail │
└──┬───┘   └───┬──┘
   │           │
   │           ↓
   │      ┌─────────────┐
   │      │Allow retake?│
   │      └─────┬───────┘
   │            │
   │            ↓
   │      ┌──────────┐
   │      │ Retry    │
   │      └────┬─────┘
   │           │
   └───────────┘
   │
   ↓
┌───────────────────────┐
│ Check cert conditions │
└───────────┬───────────┘
            │
       ┌────┴────┐
       │         │
       ↓         ↓
┌──────────┐ ┌────────────┐
│All tests │ │More tests  │
│completed │ │needed      │
└─────┬────┘ └────────────┘
      │
      ↓
┌──────────────────┐
│ Issue Certificate│
│ Send notification│
│ Send email       │
└──────────────────┘
```

---

### 6.3. Workflow: Verify chứng chỉ

```
┌─────────────────────┐
│ User/Employer có    │
│ Certificate ID      │
│ hoặc QR code        │
└──────────┬──────────┘
           │
           ↓
┌─────────────────────┐
│ Go to verify page   │
│ platform.vn/verify  │
└──────────┬──────────┘
           │
      ┌────┴─────┐
      │          │
      ↓          ↓
┌──────────┐ ┌──────────┐
│Enter ID  │ │Scan QR   │
└────┬─────┘ └────┬─────┘
     │            │
     └────┬───────┘
          │
          ↓
┌──────────────────┐
│ Query database   │
└──────────┬───────┘
           │
      ┌────┴─────┐
      │          │
      ↓          ↓
┌──────────┐ ┌────────────┐
│ Found    │ │ Not found  │
└────┬─────┘ └─────┬──────┘
     │             │
     │             ↓
     │      ┌──────────────┐
     │      │ Show:        │
     │      │ Invalid cert │
     │      └──────────────┘
     │
     ↓
┌───────────────┐
│ Check status  │
└───────┬───────┘
        │
   ┌────┴────┐
   │         │
   ↓         ↓
┌─────────┐ ┌──────────┐
│ Valid   │ │ Revoked  │
└────┬────┘ └─────┬────┘
     │            │
     │            ↓
     │      ┌─────────────┐
     │      │ Show:       │
     │      │ Revoked     │
     │      │ Reason: ... │
     │      └─────────────┘
     │
     ↓
┌─────────────────────┐
│ Display cert info:  │
│ - Holder name       │
│ - Issue date        │
│ - Expiry date       │
│ - Score             │
│ - Issuer signature  │
└─────────────────────┘
```

---

## 7. BỔ SUNG: THỐNG KÊ VÀ KPIs

### 7.1. Dashboard Admin

**Metrics tổng quan (Real-time):**

```
┌─────────────────────────────────────┐
│       PLATFORM OVERVIEW             │
├─────────────────────────────────────┤
│                                     │
│  Total Users: 12,450 (+120 today)  │
│  ├─ Người học: 10,200              │
│  ├─ Nhà tuyển dụng: 80             │
│  ├─ Mentor: 50                      │
│  └─ Chuyên gia: 15                 │
│                                     │
│  Tests Taken (Today): 450           │
│  Tests Taken (Total): 85,340        │
│                                     │
│  Certificates Issued: 2,340         │
│  ├─ This month: 180                │
│  └─ This week: 45                  │
│                                     │
│  Active Roadmaps: 25                │
│  Users following roadmaps: 5,200    │
│                                     │
│  DAU: 1,200 (10% of total)         │
│  MAU: 6,800 (55% of total)         │
│                                     │
└─────────────────────────────────────┘

📊 Charts:
- User growth (line chart, 6 months)
- Tests per day (bar chart, last 30 days)
- Certificate issuance (area chart)
- Top 10 popular tests (bar chart)
```

---

### 7.2. Dashboard Người học

```
┌─────────────────────────────────────┐
│       MY LEARNING DASHBOARD         │
├─────────────────────────────────────┤
│                                     │
│  📚 Tests Taken: 15                 │
│  ✅ Passed: 12 (80%)                │
│  ❌ Failed: 3 (20%)                 │
│                                     │
│  📜 Certificates Earned: 3          │
│                                     │
│  🎯 Roadmap Progress:               │
│  "Backend Developer"                │
│  ████████░░░░░░░░░░ 40%             │
│  Milestone 2/5 completed            │
│                                     │
│  🏆 Your Rank:                      │
│  #245 / 10,200 users                │
│  Top 3% in Python category          │
│                                     │
│  📈 Average Score: 82/100           │
│                                     │
│  🔥 Streak: 7 days                  │
│                                     │
│  ⏱ Time Spent: 18 hours            │
│                                     │
└─────────────────────────────────────┘

📊 Charts:
- Score trend over time
- Skills radar chart
- Test performance by category
```

---

## 8. TỔNG KẾT

### 8.1. Số lượng chức năng theo Role

| Role                | Số chức năng       |
| ------------------- | ------------------ |
| Admin               | 26 chức năng chính |
| Chuyên gia nội dung | 19 chức năng       |
| Người học           | 35 chức năng       |
| Nhà tuyển dụng      | 11 chức năng       |
| Mentor              | 9 chức năng        |
| **TỔNG**            | **100 chức năng**  |

### 8.2. Core Features Summary

1. ✅ **Assessment System** - Hệ thống thi đa dạng
2. ✅ **Certification System** - Chứng chỉ số, verification
3. ✅ **Career Guidance** - Định hướng nghề nghiệp
4. ✅ **Roadmap System** - Lộ trình học cá nhân hóa
5. ✅ **Progress Tracking** - Theo dõi tiến độ
6. ✅ **Portfolio Builder** - Profile công khai
7. ✅ **Talent Marketplace** - Kết nối ứng viên - NTD
8. ✅ **Mentorship** - Hệ thống mentor-mentee
9. ✅ **Analytics & Reports** - Thống kê đa chiều
10. ✅ **Community** - Q&A, Discussion

---

**END OF DOCUMENT**

**Tổng số trang:** 35  
**Tổng số chức năng:** 100+  
**Thời gian đọc ước tính:** 45 phút
