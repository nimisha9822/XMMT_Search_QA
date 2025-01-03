# Automated Make My Trip Website Testing

## Project Overview
This project involves automating the Make My Trip website to fetch flight, bus, and train details between two destinations. Additionally, it validates the search functionality of the website to ensure the accuracy and completeness of the retrieved information.

---

## Scope of Work
The following test cases were automated successfully:

1. **Verify Make My Trip Homepage URL**  
   Ensured that the homepage URL loads correctly and matches the expected URL.

2. **Get Flight Details**  
   Automated the retrieval of flight details from **Bangalore** to **New Delhi**, displaying information like flight names, departure times, and prices.

3. **Get Train Details**  
   Automated the retrieval of train details from **Bangalore** to **New Delhi**, displaying train names, schedules, and availability.

4. **Verify Bus Availability**  
   Validated that there are no buses operating between **Bangalore** and **New Delhi** for the selected dates.

---

## Skills and Tools Used
- **Selenium WebDriver**: For web automation and interaction with the Make My Trip website.
- **Dynamic XPaths**: To locate web elements efficiently and dynamically.
- **Window Handling**: To manage multiple browser tabs or pop-ups during the automation process.

---

## Project Features
- Automated search functionality for flights, trains, and buses.
- Validations to ensure data accuracy and edge case handling.
- Efficient handling of dynamic elements and pop-ups on the Make My Trip website.

---

## How to Run the Tests
1. Clone the repository and open the project in your preferred IDE.
2. Set up Selenium WebDriver and add the required browser driver (e.g., ChromeDriver).
3. Update the `src/test/resources/config.properties` file with the appropriate configurations:
   - Base URL for Make My Trip.
   - Source and destination locations.
4. Run the test cases using your test runner (e.g., TestNG).

---

## Future Enhancements
- Add test cases to validate additional filters (e.g., non-stop flights, AC/Non-AC trains).
- Automate end-to-end booking functionality.
- Extend validations to cover edge cases like invalid destinations or empty search results.

---
