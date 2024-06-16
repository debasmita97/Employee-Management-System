# employee-management-system

Performs CRUD operations for employee data (Create, Read, Update, Delete)

# EndPoints

## Add employee
```
POST localhost:8081/api/employee/addEmployee
```
## Request Body - raw (json)

```{
    "employeeFirstName": "Akash",
    "employeeLastName": "Roy",
    "employeeEmail": "a.Roy@corp.com",
    "employeeContactNo": "9876549812",
    "location": "Kolkata",
    "designation": "Consultant",
    "dateOfJoining": "12/03/2009",
    "dateOfBirth": "23/10/1987",
    "employeeStatus": "Confirmed",
    "gender": "Male",
    "bloodGroup": "B+",
    "project": {
        "projectId": "123456",
        "projectName": "ATM-Project"
    },
    "iou": 
        {
            "iouName": "BFSI",
            "subIouName": "BFSI-LATAM"
        },
    "bankDetails": 
        {
            "bankName": "ABC",
            "accountNumber": "334563097",
            "ifseCode": "ABCB0000987"
        }
}
```
## Response 200 ok

```
{
    "employeeId": "667332f78d22ac4d99ce1be4",
    "employeeFirstName": "Naina",
    "employeeLastName": "Mathur",
    "employeeEmail": "n.mathur@corp.com",
    "employeeContactNo": "8798676521",
    "location": "Pune",
    "designation": "IT Analyst",
    "dateOfJoining": "12/03/2017",
    "dateOfBirth": "23/10/1995",
    "employeeStatus": "Confirmed",
    "gender": "Female",
    "bloodGroup": "AB-",
    "project": {
        "projectId": 132985,
        "projectName": "Digital-Marketing"
    },
    "iou": {
        "iouName": "BFSI",
        "subIouName": "BFSI-EMEA"
    },
    "bankDetails": {
        "bankName": "ABC",
        "accountNumber": "334565412",
        "ifseCode": "ABCB0000987"
    }
}
```

## Response 400 Bad Request
```
{
    "bloodGroup": "bloodGroup can not be blank",
    "dateOfJoining": "dateOfJoining can not be null",
    "employeeLastName": "LastName can not be blank",
    "gender": "gender can not be blank",
    "employeeContactNo": "phonenumber can not be null",
    "employeeEmail": "Email can not be null",
    "dateOfBirth": "dateofbirth can not be null",
    "employeeFirstName": "FirstName can not be blank",
    "location": "location can not be null",
    "designation": "designation can not be null",
    "employeeStatus": "employeeStatus can not be null"
}
```
## UpdateEmployee 
```
PUT localhost:8081/api/employee/updateEmployee
```
## Request Body - raw (json)
```
{
    "employeeId": "666dff2be8328e364cf2f705",
    "employeeFirstName": "Nil",
    "employeeLastName": "Sen",
    "employeeEmail": "n.sen@corp.com",
    "employeeContactNo": "9875645433",
    "location": "Kolkata",
    "designation": "Consultant",
    "dateOfJoining": "12/03/2015",
    "dateOfBirth": "23/10/1989",
    "employeeStatus": "Confirmed",
    "gender": "Male",
    "bloodGroup": "B+",
    "project": {
        "projectId": "123456",
        "projectName": "ATM-Project"
    },
    "iou": 
        {
            "iouName": "BFSI",
            "subIouName": "BFSI-USA"
        },
    "bankDetails": 
        {
            "bankName": "ABC",
            "accountNumber": "3345634567",
            "ifseCode": "ABCB0000987"
        }
}
```

## Response 200 ok

```
{
    "employeeId": "666dff2be8328e364cf2f705",
    "employeeFirstName": "Nil",
    "employeeLastName": "Sen",
    "employeeEmail": "n.sen@corp.com",
    "employeeContactNo": "9875645433",
    "location": "Kolkata",
    "designation": "Consultant",
    "dateOfJoining": "12/03/2015",
    "dateOfBirth": "23/10/1989",
    "employeeStatus": "Confirmed",
    "gender": "Male",
    "bloodGroup": "B+",
    "project": {
        "projectId": 123456,
        "projectName": "ATM-Project"
    },
    "iou": {
        "iouName": "BFSI",
        "subIouName": "BFSI-USA"
    },
    "bankDetails": {
        "bankName": "ABC",
        "accountNumber": "3345634567",
        "ifseCode": "ABCB0000987"
    }
}
```
## UpdateEmployeePartial

```
PATCH localhost:8081/api/employee/updateEmployeePartial?id=666dff2be8328e364cf2f705
```
## Query Params

```
id:666dff2be8328e364cf2f705
```
```
{
    "location: "Pune"
    "bloodGroup": "O+"
}
```
## Response 200 ok

```
{
    "employeeId": "666dff2be8328e364cf2f705",
    "employeeFirstName": "Nil",
    "employeeLastName": "Sen",
    "employeeEmail": "n.sen@corp.com",
    "employeeContactNo": "9875645433",
    "location": "Pune",
    "designation": "Consultant",
    "dateOfJoining": "12/03/2015",
    "dateOfBirth": "23/10/1989",
    "employeeStatus": "Confirmed",
    "gender": "Male",
    "bloodGroup": "O+",
    "project": {
        "projectId": 123456,
        "projectName": "ATM-Project"
    },
    "iou": {
        "iouName": "BFSI",
        "subIouName": "BFSI-USA"
    },
    "bankDetails": {
        "bankName": "ABC",
        "accountNumber": "3345634567",
        "ifseCode": "ABCB0000987"
    }
}
```
## Get All Employees

```
GET localhost:8081/api/employee/getAllEmployees
```
## Response 200 ok

## Get All Employees with Pagination

```
GET localhost:8081/api/employee/getAllEmployeesPagination?pageNo=3&pageSize=2
```
## Query Params
```
pageNo:1
pageSize:5
```
## Response 200 ok

## Get Employee By ID

```
GET localhost:8081/api/employee/getEmployee?id=666dea965d86f014a625dee4
```
## Query Params
```
id:666dea965d86f014a625dee4
```

## Response 200 ok

## Get Employee By Designation And Location

```
GET localhost:8081/api/employee/getEmployeeByDesignationAndLocation?designation=Consultant&location=Kolkata
```
## Query Params
```
designation:Consultant
location:Kolkata
```
## Response 200 ok

## Get Employee By Designation And Location

```
GET localhost:8081/api/employee/getEmployeeFirstNameStartsWith
```
## Query Params
```
startWith:N
```
## Response 200 ok

## Get Employee By IouName

```
GET localhost:8081/api/employee/getEmployeeByIouName?iouName=Retail
```
## Query Params
```
iouName:Retail
```
## Response 200 ok

## Delete Employee By ID

```
Delete localhost:8081/api/employee/getEmployeeByIouName?iouName=Retail
```
## Query Params
```
id:666e04cfece8ce64bbb7bc5f
```
## Response 200 ok

## Get Employee By Project ID

```
GET localhost:8081/api/employee/getEmployeeByProjectID
```
## Query Params
```
projectID:122455
```
## Response 200 ok

## Get Employee By Project Name

```
GET localhost:8081/api/employee/getEmployeeByProjectID
```
## Query Params
```
projectName:ATM-Project
```
## Response 200 ok



