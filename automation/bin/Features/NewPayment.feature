
@tag
Feature: New Payment 
 

@tag1
Scenario: Login to the application
 Given User Launch Chrome browser
 When User Opens URL "http://localhost:4200/login/pt"
 And Click on InitialLogin
 And User enter Email as "mark@pointchain.io" and Password as "pointchain"
 And Click on Login
 Then Page header Should be "Mark's Greenhouse"
    
@tag2
Scenario: Successful Payment with valid Amount and steps
  When Click on NewPayment button
  Then Page Title Should be "MakePayment"
  And Available Wallet Balance should be "7,309.50"
  And Select vendor as "Dan's Baked Goods"
  Then It Should Display Header as "Payment Details"
  When Select payment Date as "17-12-2020"
  And Enter Payment Amount as "1"
  And Click on checkbox
  And Enter Payment Notes as "Test payment"
  And Enter Other Amount as "8"
  And Enter Other Amout Description as "sample payment"
  And Click On Confirm Payment button
  Then Should redirect to Dashboard page
  And Display payer as "Mark's Greenhouse" and Payee as "Dan's Baked Goods" Status as "Completed" Payment Date as "17/12/2020" and Amount as "8"
  And Current Funds should be "7,300.50"
   
   
@tag3
Scenario: Successful Payment without entering Other Amount
  When Click on NewPayment button
  Then Page Title Should be "MakePayment"
  And Available Wallet Balance should be "7,300.50"
  And Select vendor as "Dan's Baked Goods"
  Then It Should Display Header as "Payment Details"
  When Select payment Date as "17-12-2020"
  And Enter Payment Amount as "1.50"
  And Click on checkbox
  And Enter Payment Notes as "Test payment"
  And Click On Confirm Payment button
  Then Should redirect to Dashboard page
  And Verify payment details payer as "Mark's Greenhouse" and Payee as "Dan's Baked Goods" and Status as "Completed" and Date as "
  And Current Funds should be "7,299.50" 
  
@tag4
Scenario: Successful Payment without entering Payment Note and Other Description
  When Click on NewPayment button
  Then Page Title Should be "MakePayment"
  And Available Wallet Balance should be "7,299.50"
  And Select vendor as "Dan's Baked Goods"
  Then It Should Display Header as "Payment Details"
  When Select payment Date as "17-12-2020"
  And Enter Payment Amount as "10"
  And Click on checkbox
  And Enter Other Amount as "10"
  And Click On Confirm Payment button
  Then Should redirect to Dashboard page
  And Display payer as "Mark's Greenhouse" and Payee as "Dan's Baked Goods" Status as "Completed" Payment Date as "17/12/2020" and Amount as "20"
  And Current Funds should be "7,279.50"   
  
@tag5
Scenario: Failure Payment without selecting Bills and Amount
  When Click on NewPayment button
  Then Page Title Should be "MakePayment"
  When Select vendor as "Dan's Baked Goods"
  Then Display payment Details section
  When Click On Confirm Payment button
  Then Response should be null
  
@tag6
Scenario: Failure Payment with excess bill amount owed
  When Click on NewPayment button
  Then Page Title Should be "MakePayment"
  When Select vendor as "Dan's Baked Goods"
  Then Display payment Details section
  When Enter Payment Amount as "1000000000"
  Then Display Error as "Exceed Bill Amount Owed"
  
@tag7
Scenario: Failure Payment without cicking on Check boxes
  When Click on NewPayment button
  Then Page Title Should be "MakePayment"
  When Select vendor as "Dan's Baked Goods"
  Then Display payment Details section
  When Enter Payment Amount as "1"
  And Click On Confirm Payment button
  Then Response should be null
  
       
@tag8
Scenario: Failure Payment with negative amount in Bill/PO input field.
  When Click on NewPayment
  Then Page Title Should be "MakePayment"
  When Select vendor as "Dan's Baked Goods"
  Then Display payment Details section
  When Enter Payment Amount as "-1"
  Then It Should Display Error as "Enter Valid Amount"
    
@tag9
Scenario: Failure Payment with negative amount in other amount input field..
  When Click on NewPayment
  Then Page Title Should be "MakePayment"
  When Select vendor as "Dan's Baked Goods"
  Then Display payment Details section
  When Enter Other Amount as "-10"
  Then It Should Display Error as "Enter Valid Amount"
    
@tag10
Scenario: Failure Payment with Previous Date
  When Click on NewPayment
  Then Page Title Should be "MakePayment"
  When Select vendor as "Dan's Baked Goods"
  And Select payment Date as "17-12-2019"
  Then Response should be null
    
@tag11
Scenario: Pending payment by entering only Other Amount.
   When Click on NewPayment button
   Then Page Title Should be "MakePayment"
   And Available Wallet Balance should be "7,279.50"
   And Select vendor as "Dan's Baked Goods"
   Then It Should Display Header as "Payment Details"
   When Select payment Date as "17-12-2020"
   And Enter Other Amount as "1"
   And Click On Confirm Payment button
   Then Should redirect to Dashboard page
   And Display payer as "Mark's Greenhouse" and Payee as "Dan's Baked Goods" Status as "RFI" Payment Date as "17/12/2020" and Amount as "8"
   And Current Funds should be "7,279.50"
   
   
@tag12
Scenario: Pending payment by entering only Other Amount.
  When Click on NewPayment
  Then Page Title Should be "MakePayment"
  When Select vendor as "Dan's Baked Goods"
  Then Display payment Details section
  When Enter Other Amount as "10000000"
  Then It Should Display Error as "Insufficient Funds In Wallet"
   
   

