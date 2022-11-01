# Assignment2-Group16

## Use Case Diagram
![image](https://user-images.githubusercontent.com/93552245/199147408-346fdf49-55d6-48b0-af00-5a6cab4101c2.png)
<br>
<br>
<br>

## Use Cases
| Use Case | Description  | Requirements |
| :-: | ------------- | :-: |
| UC-1 | A cashier can start a purchasing session using the keyboard prior to any product scans and should be able to cancel the session at any time which will nullify all scanned items. | R-01, R-02 |
| UC-2 | A cashier can scan barcodes to identify and display a product's name, quantity and price. If the barcode of a product was unable to be read by the scanner, the cashier can enter the barcode through the keyboard. | R-03, R-04 |
| UC-3 | The cashier can use the cash register to process different payment methods including Cash, Debit or Credit Card. The payment information gets verified by the bank. | R-05, R-06 |
| UC-4 | The cash register should be able to change platforms in the future like automatic self checkers. | R-08 |
| UC-5 | The cash register will contain a database with a catalog of all scannable products and codes for unscannable items that link to the correct items. | R-09 |
<br>
<br>

## Quality Scenarios
|   |   |
|---|---|
| Requirements | R-01, R-02, R-03, R-04, R-05, R-06, R-07 & R-09 |
| Source | Cashier, keyboard, barcode scanner, products, display, 3rd party payment system, receipt printer and database |
| Stimulus | Cashier starting a product purchasing session |
| Artifact | Cash register system |
| Environment | During store operation hours |
| Response | After the cashier starts a product purchasing session through their keyboard, the barcodes are scanned for each product. The product’s name, quantity and price are retrieved from the local database and displayed on the display. For an unknown product, the barcode can be entered manually through the cashier’s keyboard. Once all products have been scanned, the cashier can use a 3rd party payment system to complete the product purchasing session. Once the payment has been confirmed, the receipt is printed and the session ends. This session or individual products can also be canceled. |
| Response Measure | The cash register system must be available at all times during the store operation hours. |
<br>

|   |   |
|---|---|
| Requirements | R-08 |
| Source | Cash register hardware platform |
| Stimulus | Production of improved cash register hardware platform |
| Artifact | Cash register system |
| Environment | Outside of store operation hours |
| Response | The system must be able to transfer information, such as the local database, to the improved platform. |
| Response Measure | With a latency of less than 5 minutes. |
<br>
<br>


## Constraints
| CON-ID | Constrain |
|---|---|
| CON-1 | Cashier must be knowledgeable on how to operate system. |
| CON-2 | The products being scanned must be present in the cash register database. |
| CON-3 | All products have a barcode linked to them. |
<br>
<br>

## MVC Diagram
![image](https://user-images.githubusercontent.com/93552245/199148844-735a5ae3-9a08-45fd-9d4a-4356cf17eec5.png)
<br>
<br>
<br>

## Sequence Diagram
![image](https://user-images.githubusercontent.com/94460287/199147501-8868fb14-5c7f-4ffc-9a99-738cd900c05f.png)
