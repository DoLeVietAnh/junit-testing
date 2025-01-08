# JUnit Testing

Đỗ Lê Việt Anh - BIT220014 - 22SE1

Bài tập 1 của môn "Kiểm thử phần mềm" sử dụng JUnit5 của một máy tính cầm tay cơ bản.

#### Chức năng:
- Cộng: cộng 2 con số.
- Trừ: trừ 2 con số.
- Nhân: nhân 2 con số.
- Chia: chia 2 con số.

#### Yêu cầu:
- Java Development Kit (JDK) 11 trở lên.
- Maven 3.6+.
- JUnit: Phiển bản 5 trở lên. 
- Một IDE như IntelliJ IDEA hoặc Eclipse.

### Hướng dẫn cài đặt và chạy chương trình
#### 1. Clone repository
```
git clone https://github.com/DoLeVietAnh/junit-testing.git
cd junit-testing
```
#### 2. Biên dịch mã nguồn
```
mvn compile
```
#### 3. Chạy kiểm thử
```
mvn test
```
#### 4. Kết quả kiểm thử
- Sau khi chạy lệnh trên, Maven sẽ hiển thị kết quả kiểm thử trong terminal. Ngoài ra, bạn có thể kiểm tra tệp log tại target/surefire-reports

### Mô tả lớp Calculator
#### Lớp Calculator bao gồm các phương thức cơ bản:
- **add(int a, int b)**: Cộng hai số nguyên.
- **subtract(int a, int b)**: Trừ hai số nguyên.
- **multiply(int a, int b)**: Nhân hai số nguyên.
- **divide(int a, int b)**: Chia hai số nguyên (trả về kết quả dạng int và kiểm tra chia cho 0).

![image](https://github.com/user-attachments/assets/def4d57b-b28d-40b8-9736-03555f2a3e9a)

#### Lớp Kiểm thử
![image](https://github.com/user-attachments/assets/3b8b1f7c-7b6c-494f-83a0-92395afabe16)

### Mô tả lớp kiểm thử:
#### Lớp kiểm thử sử dụng JUnit 5 để kiểm tra các phương thức chính của lớp Calculator. Các trường hợp kiểm thử bao gồm:
- **Cộng**: cộng ra số âm và số dương.
- **Trừ**: trừ ra số âm và số dương.
- **Nhân**: nhân ra số âm và số dương.
- **Chia**: chia ra số âm và số dương và chia cho không.

### Kết quả kiểm thử: 

| Phương thức      | Trường hợp kiểm thử                     | Đầu vào                  | Kết quả mong đợi                  | Kết quả thực tế | Ghi chú                          |
|-------------------|-----------------------------------------|--------------------------|------------------------------------|-----------------|-----------------------------------|
| `add`            | Cộng hai số dương                      | 2, 3                    | 5                                  | 5               | Đạt                              |
| `add`            | Cộng một số âm và một số dương          | -2, 1                   | -1                                 | -1              | Đạt                              |
| `add`            | Cộng hai số 0                          | 0, 0                    | 0                                  | 0               | Đạt                              |
| `add`            | Cộng giá trị biên                      | `Integer.MAX_VALUE`, 0  | `Integer.MAX_VALUE`                | `Integer.MAX_VALUE` | Đạt                          |
| `add`            | Giá trị âm tại biên                    | `Integer.MIN_VALUE`, 1  | `Integer.MIN_VALUE + 1`            | `Integer.MIN_VALUE + 1` | Đạt                      |
| `subtract`       | Trừ hai số dương                       | 3, 2                    | 1                                  | 1               | Đạt                              |
| `subtract`       | Trừ một số âm và một số dương           | -2, 1                   | -3                                 | -3              | Đạt                              |
| `subtract`       | Trừ hai số 0                           | 0, 0                    | 0                                  | 0               | Đạt                              |
| `subtract`       | Trừ giá trị biên                       | `Integer.MAX_VALUE`, 0  | `Integer.MAX_VALUE`                | `Integer.MAX_VALUE` | Đạt                          |
| `subtract`       | Giá trị âm tại biên                    | `Integer.MIN_VALUE`, 0  | `Integer.MIN_VALUE`                | `Integer.MIN_VALUE` | Đạt                          |
| `multiply`       | Nhân hai số dương                      | 2, 3                    | 6                                  | 6               | Đạt                              |
| `multiply`       | Nhân một số với 0                      | 0, 5                    | 0                                  | 0               | Đạt                              |
| `multiply`       | Nhân một số âm với một số dương         | -2, 3                   | -6                                 | -6              | Đạt                              |
| `multiply`       | Nhân giá trị biên với 0                | `Integer.MAX_VALUE`, 0  | 0                                  | 0               | Đạt                              |
| `multiply`       | Nhân hai giá trị biên lớn               | `Integer.MAX_VALUE`, `Integer.MAX_VALUE` | Ngoại lệ `ArithmeticException` | Ngoại lệ       | Đạt                              |
| `divide`         | Chia hai số dương                      | 6, 3                    | 2                                  | 2               | Đạt                              |
| `divide`         | Chia một số dương với một số âm         | 4, -2                   | -2                                 | -2              | Đạt                              |
| `divide`         | Chia số 0                              | 0, 5                    | 0                                  | 0               | Đạt                              |
| `divide`         | Chia một số cho 0                      | 5, 0                    | Ngoại lệ `IllegalArgumentException` | Ngoại lệ       | Đạt                              |
| `divide`         | Chia hai giá trị biên lớn               | `Integer.MAX_VALUE`, `Integer.MAX_VALUE` | 1              | 1               | Đạt                              |
| `divide`         | Chia giá trị âm tại biên với 1          | `Integer.MIN_VALUE`, 1  | `Integer.MIN_VALUE`                | `Integer.MIN_VALUE` | Đạt                      |


![image](https://github.com/user-attachments/assets/cca93917-c8ef-4f9f-8a7a-107d5c210f3e)

#### Link ChatGPT: https://chatgpt.com/share/677c978b-e3b8-800c-9d4e-353d5ecd69d1

### Contact
