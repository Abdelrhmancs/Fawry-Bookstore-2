# Quantum Bookstore

Quantum Bookstore is a simple Java-based console application that simulates a bookstore system. It supports multiple types of books and allows adding, removing, and buying them from an inventory.

---

## Features

- Add books to the inventory with details like ISBN, title, author, year, price
- Book types:
  - PaperBook: Physical book with quantity & shipping
  - EBook: Sent via email
  - ShowcaseBook: Demo book (not for sale)
- Remove outdated books based on age
- Buy books using ISBN, quantity, email & address
- Simulated shipping & email services
- Error handling for unavailable or unsellable books

---
## Output

```
Quantum book store: Book added - Introduction to SQL
Quantum book store: Book added - Introduction to java
Quantum book store: Book added - Quantum Theory
Quantum book store: Removing outdated book - Quantum Theory
Quantum Book Store: Shipping PaperBook to mokkattam Cairo
Quantum book store: Book purchased - Introduction to SQL, Total paid: 600.0
Quantum book store: Sending EBook to ght7234@gmail.com
Quantum book store: Book purchased - Introduction to java , Total paid: 450.0
Quantum book store: Book not found
```
