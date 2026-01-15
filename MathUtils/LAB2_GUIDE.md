# Lab 2 – JUnit 5, Maven, DDT & Coverage

Tài liệu này tóm tắt các bước mình đã làm trong dự án `MathUtils` để hoàn thành yêu cầu Lab 2 và cách bạn có thể chạy lại.

## 1) Chuẩn bị môi trường
- JDK 17, Maven (tích hợp sẵn trong IDE hoặc cài riêng).
- NetBeans/IDE khác tùy chọn.

## 2) Cấu hình Maven (pom.xml)
- Nâng cấp JUnit 5 lên `5.11.4` (aggregator `junit-jupiter`).
- Giữ Surefire `3.2.5` để chạy test JUnit 5.
- Thêm JaCoCo `0.8.14` để đo coverage.
- Thiết lập `exec.mainClass` về `com.mycompany.mathutil.main.Main`.

## 3) Mã nguồn cần test
- `src/main/java/com/mycompany/mathutil/core/MathUtil.java`: tính giai thừa, giới hạn 0..20.
- `src/main/java/com/mycompany/mathutil/core/AccountService.java`: logic đăng ký tài khoản (username không rỗng, password > 6 ký tự, email hợp lệ).

## 4) Dữ liệu kiểm thử (DDT)
- `src/test/resources/data/factorial_test_data.csv`: dữ liệu giai thừa.
- `src/test/resources/data/account_test_data.csv`: dữ liệu đăng ký tài khoản (username,password,email,expected).

## 5) Test JUnit 5 đã bổ sung
- `src/test/java/com/mycompany/mathutil/core/MathUtilTest.java`
  - `@CsvSource` kiểm thử nhanh các giá trị 0..6.
  - `@CsvFileSource` đọc file CSV để kiểm thử thêm (0,1,2,3,5,10,20).
  - `@Test` xác nhận ném `IllegalArgumentException` khi ngoài 0..20.
- `src/test/java/com/mycompany/mathutil/core/AccountServiceTest.java`
  - `@CsvFileSource` chạy nhiều bộ dữ liệu đăng ký từ `account_test_data.csv`.
  - Các `@CsvSource` riêng kiểm tra `isValidEmail`, `isValidPassword`, và ràng buộc username trống.

## 6) Cách chạy
```bash
mvn clean test
```
- Kết quả test hiển thị trong console.
- Báo cáo coverage: `target/site/jacoco/index.html` (mở file này bằng trình duyệt).

## 7) Cách mở rộng / tùy chỉnh
- Thêm dòng dữ liệu vào các file CSV nếu muốn kiểm thử thêm.
- Điều chỉnh regex email trong `AccountService` nếu muốn kiểm tra chặt hơn.
- Thêm các test khác (ví dụ kiểm thử ranh giới password, null input, …).

## 8) Checklist nhanh
- [x] JUnit 5 cấu hình đúng phiên bản.
- [x] Surefire + JaCoCo hoạt động.
- [x] Test DDT cho MathUtil (inline + CSV).
- [x] Test DDT cho AccountService (CSV + các rule riêng).

