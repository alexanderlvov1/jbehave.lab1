# business.insurance.vehicle.getquote

1.0.1-SNAPSHOT
## Stories

### Story: Get Quote
    
    As a user
    I want to enter personalnumber or organizational number, a start date and a registrationnumber
    So that I can get an insurance quote
    
#### Scenario: Quote when entering correct values
    Given any user
    When quote is retrieved for a correct <customerId> a correct start date starting at <daysAheadInTheFutureForStartDate> and a correct <registrationNumber>
    Then the information should be <information>
    
##### Examples:
<table>
<tr>
<th>customerId</th>
<th>daysAheadInTheFutureForStartDate</th>
<th>registrationNumber</th>
<th>information</th>
</tr>
<tr>
<td>196504192730</td>
<td>1</td>
<td>KXK925</td>
<td><pre>{
  "vehicle": {
    "registrationNumber": "KXK925",
    "modelYear": "2011",
    "brandAndModel": "Audi            8p",
    "power": "77"
  },
  "priceForSelectedProduct": {
    "supplementaryPriceProposals": [{
      "availableDeductiblesIds": null,
      "yearlyPrice": 571,
      "supplementaryInsuranceId": "2363"
    }],
    "coveragePriceProposals": [
      {
        "deductibleIds": null,
        "coverageId": "18091006",
        "yearlyPrice": 2292
      },
      {
        "deductibleIds": null,
        "coverageId": "18091183",
        "yearlyPrice": 5050
      },
      {
        "deductibleIds": ["8509"],
        "coverageId": "18091434",
        "yearlyPrice": 9620
      }
    ],
    "quote": {
      "startDate": "2014-06-28 00:00:00",
      "internetCustomerDiscount": 1043,
      "coverageId": "18091434",
      "coverageName": "Helförsäkring",
      "yearlyPrice": 10191,
      "paymentAlternatives": [
        {
          "averagePrice": 10191,
          "paymentTermAdditionFactor": 1,
          "paymentTerm": "TWELVE_MONTHS",
          "paymentTermDistributions": [{
            "amount": 9437,
            "to": "2015-06-01 00:00:00",
            "termAddition": 0,
            "from": "2014-06-28 00:00:00"
          }],
          "paymentMethod": "BANKGIRO"
        },
        {
          "averagePrice": 5248.365,
          "paymentTermAdditionFactor": 1.03,
          "paymentTerm": "SIX_MONTHS",
          "paymentTermDistributions": [
            {
              "amount": 4488,
              "to": "2014-12-01 00:00:00",
              "termAddition": 132,
              "from": "2014-06-28 00:00:00"
            },
            {
              "amount": 5233,
              "to": "2015-06-01 00:00:00",
              "termAddition": 152,
              "from": "2014-12-01 00:00:00"
            }
          ],
          "paymentMethod": "BANKGIRO"
        },
        {
          "averagePrice": 10191,
          "paymentTermAdditionFactor": 1,
          "paymentTerm": "TWELVE_MONTHS",
          "paymentTermDistributions": [{
            "amount": 9437,
            "to": "2015-06-01 00:00:00",
            "termAddition": 0,
            "from": "2014-06-28 00:00:00"
          }],
          "paymentMethod": "AUTOGIRO"
        },
        {
          "averagePrice": 5095.5,
          "paymentTermAdditionFactor": 1,
          "paymentTerm": "SIX_MONTHS",
          "paymentTermDistributions": [
            {
              "amount": 4355,
              "to": "2014-12-01 00:00:00",
              "termAddition": 0,
              "from": "2014-06-28 00:00:00"
            },
            {
              "amount": 5082,
              "to": "2015-06-01 00:00:00",
              "termAddition": 0,
              "from": "2014-12-01 00:00:00"
            }
          ],
          "paymentMethod": "AUTOGIRO"
        },
        {
          "averagePrice": 849.25,
          "paymentTermAdditionFactor": 1,
          "paymentTerm": "ONE_MONTH",
          "paymentTermDistributions": [
            {
              "amount": 85,
              "to": "2014-07-01 00:00:00",
              "termAddition": 0,
              "from": "2014-06-28 00:00:00"
            },
            {
              "amount": 865,
              "to": "2014-08-01 00:00:00",
              "termAddition": 0,
              "from": "2014-07-01 00:00:00"
            },
            {
              "amount": 865,
              "to": "2014-09-01 00:00:00",
              "termAddition": 0,
              "from": "2014-08-01 00:00:00"
            },
            {
              "amount": 838,
              "to": "2014-10-01 00:00:00",
              "termAddition": 0,
              "from": "2014-09-01 00:00:00"
            },
            {
              "amount": 865,
              "to": "2014-11-01 00:00:00",
              "termAddition": 0,
              "from": "2014-10-01 00:00:00"
            },
            {
              "amount": 838,
              "to": "2014-12-01 00:00:00",
              "termAddition": 0,
              "from": "2014-11-01 00:00:00"
            },
            {
              "amount": 865,
              "to": "2015-01-01 00:00:00",
              "termAddition": 0,
              "from": "2014-12-01 00:00:00"
            },
            {
              "amount": 865,
              "to": "2015-02-01 00:00:00",
              "termAddition": 0,
              "from": "2015-01-01 00:00:00"
            },
            {
              "amount": 783,
              "to": "2015-03-01 00:00:00",
              "termAddition": 0,
              "from": "2015-02-01 00:00:00"
            },
            {
              "amount": 865,
              "to": "2015-04-01 00:00:00",
              "termAddition": 0,
              "from": "2015-03-01 00:00:00"
            },
            {
              "amount": 838,
              "to": "2015-05-01 00:00:00",
              "termAddition": 0,
              "from": "2015-04-01 00:00:00"
            },
            {
              "amount": 865,
              "to": "2015-06-01 00:00:00",
              "termAddition": 0,
              "from": "2015-05-01 00:00:00"
            }
          ],
          "paymentMethod": "AUTOGIRO"
        }
      ],
      "bonus": {
        "amount": 0,
        "name": "Guld-, Silver-, Bronskundsrabatt"
      },
      "moments": [
        {
          "damageCategories": null,
          "yearlyPrice": 2292,
          "deductible": "1000 kronor",
          "name": "Trafik"
        },
        {
          "damageCategories": [
            {
              "deductible": "1800 kronor",
              "name": "Brand"
            },
            {
              "deductible": "35 % av skada, lägst  1000 kronor",
              "name": "Glas"
            },
            {
              "deductible": "1800 kronor",
              "name": "Stöld"
            },
            {
              "deductible": "1500 kronor",
              "name": "Räddning"
            },
            {
              "deductible": "20 % av skada, lägst  1000 kronor",
              "name": "Rättsskydd"
            },
            {
              "deductible": "3000/5000 kr",
              "name": "Maskin"
            },
            {
              "deductible": "1000 kronor",
              "name": "Allrisk"
            },
            {
              "deductible": "Ingen självrisk",
              "name": "Kris"
            }
          ],
          "yearlyPrice": 2758,
          "deductible": null,
          "name": "Delkasko"
        },
        {
          "damageCategories": null,
          "yearlyPrice": 4570,
          "deductible": "3000 kronor",
          "name": "Vagnskada"
        },
        {
          "damageCategories": null,
          "yearlyPrice": 571,
          "deductible": "1000 kronor",
          "name": "MER"
        }
      ],
      "productName": "Personbil"
    },
    "productId": "701"
  },
  "products": [{
    "vehicleTypeCode": "CAR",
    "id": "701",
    "seasonalVariance": false,
    "name": "Personbil",
    "recommendation": {
      "message": "Din bil är ganska ny och de flesta kunder väljer att köpa en helförsäkring. Du får då ett fullgott skydd på din bil även om du orsakat olyckan.",
      "deductibleIds": ["8509"],
      "coverageId": "18091434",
      "supplementaryInsuranceIds": ["2363"]
    },
    "type": "CAR_PRIVATE",
    "options": {
      "highValueQuestion": null,
      "protectiveGearQuestion": null,
      "mileage": {
        "selectedMileage": "1001",
        "mileageIntervals": [
          {
            "to": "1000",
            "from": "0"
          },
          {
            "to": "1500",
            "from": "1001"
          },
          {
            "to": "2000",
            "from": "1501"
          },
          {
            "to": "2500",
            "from": "2001"
          },
          {
            "to": "99999",
            "from": "2501"
          }
        ]
      },
      "availableCoverages": [
        {
          "id": "18091006",
          "name": "Trafikförsäkring",
          "availableDeductibles": [],
          "type": "TRAFFIC"
        },
        {
          "id": "18091183",
          "name": "Halvförsäkring",
          "availableDeductibles": [],
          "type": "PARTIAL"
        },
        {
          "id": "18091434",
          "name": "Helförsäkring",
          "availableDeductibles": [{
            "name": "Vagnskada",
            "deductibleAmounts": [
              {
                "amount": 3000,
                "deductibleId": "8509",
                "name": "3000 kronor"
              },
              {
                "amount": 5000,
                "deductibleId": "8511",
                "name": "5000 kronor"
              }
            ],
            "type": "VEHICLE_DAMAGE"
          }],
          "type": "FULL"
        }
      ],
      "availableSupplementaryInsurances": [{
        "id": "2363",
        "availableDeductibles": null,
        "label": "MER",
        "validForCoverages": [
          "18091434",
          "18091183"
        ],
        "type": "EXTENDED"
      }]
    }
  }],
  "regionalCompany": {
    "phoneNumber": "08-562 834 00",
    "email": "info@sth.lansforsakringar.se",
    "name": "Länsförsäkringar Stockholm",
    "code": "28"
  },
  "banks": [
    {
      "id": "0000000035",
      "name": "Danske Bank"
    },
    {
      "id": "0000000132",
      "name": "DnB Nor"
    },
    {
      "id": "0000000027",
      "name": "Handelsbanken"
    },
    {
      "id": "0000000116",
      "name": "ICA Bank"
    },
    {
      "id": "0000000124",
      "name": "Länsförsäkringar Bank"
    },
    {
      "id": "0000000167",
      "name": "Marginalen Bank"
    },
    {
      "id": "0000000078",
      "name": "Nordea"
    },
    {
      "id": "0000000183",
      "name": "SBAB"
    },
    {
      "id": "0000000019",
      "name": "SEB"
    },
    {
      "id": "0000000043",
      "name": "SkandiaBanken"
    },
    {
      "id": "0000000159",
      "name": "Sparbanken Syd"
    },
    {
      "id": "0000000086",
      "name": "SPB Öresund fd Finn"
    },
    {
      "id": "0000000051",
      "name": "Swedbank"
    },
    {
      "id": "0000000248",
      "name": "Ålandsbanken"
    }
  ]
}</pre></td>
</tr>
</table>

### Story: Validation errors
    
    As a user,
    I want to be informed, if entering invalid request data
    
#### Scenario: Invalid registration number
    Given any user
    When quote is retrieved for invalid <registrationNumber>
    Then the response should contain <errorCode>
    
##### Examples:
<table>
<tr>
<th>registrationNumber</th>
<th>errorCode</th>
</tr>
<tr>
<td>ABCD123</td>
<td>103</td>
</tr>
</table>
    
    
#### Scenario: Invalid start date
    Given any user
    When quote is retrieved for a start date with invalid <daysAheadInTheFutureForStartDate>
    Then the response should contain <errorCode>
    
##### Examples:
<table>
<tr>
<th>daysAheadInTheFutureForStartDate</th>
<th>errorCode</th>
</tr>
<tr>
<td>-1</td>
<td>109</td>
</tr>
<tr>
<td>366</td>
<td>109</td>
</tr>
</table>

## Request
    Request {
        customerId (string, required): "(12 digits) Personal or organisation number",
        registrationNumber (string, required): "This is the registration number of the vehicle. The registration number must be a real registration number, and may contain both uppercase and lowercase characters.",
        startDate (timestamp, optional): "Format: [YYYY-MM-DD] If not set, system time will be used as default. If set, the date must be between this date and 1 year from now",
        payment(Payment, optional): "Selection of payment alternatives."
        insuranceDetails(InsuranceDetails, optional): "Detailed information about the insurance."
        carDealerId(string, optional): "Agent number, used by car dealers. The agent number is distributed by LF. If specified a commission is paid to the car dealer when the policy is signed."
        productId(string, optional): "(Only digits) Specifies the product to use when calculating the price and signing the policy. If omitted the system will use the default product for the specified vehicle. The productId are present in Product.id in the response."
    }

    InsuranceDetails {
        yearlyMileage (string, optional): "(Only digits) See Mileage.availableYearlyMileages in response for available values.",
        protectiveGear (boolean, optional): "See ProductOptions.protectiveGearQuestion in response.",
        highValue (boolean, optional): "See ProductOptions.highValueQuestion in the response. If set if the vehicle is regarded to have a high value."
        coverage (Coverage, optional): "Selected coverage.",
        supplementaryInsurances (array[SupplementaryInsurance], optional): "Selected supplementary insurances for the selected coverage."
    }

    Coverage {
        id (string, required): "Id of selected coverage. Available id:s are present in the field ProductOptions.availableCoverages in the response.",
        deductibles (array[string], optional): "Selected deductible id:s for the coverage. Available id:s are present from the field Coverage.availableDeductibles in the response."
    }

    SupplementaryInsurance {
        id (string , required): "Id of a selected supplementary insurance. Available id:s are present in the field ProductOptions.availableSupplementaryInsurancese.",
        deductible (string, optional): "Id of selected deductible for the supplementary insurance. Available id:s are present in the field SupplementaryInsurance.availableDeductibles in the response."
    }

    Payment {
        paymentTerm (string, optional):   "[ONE_MONTH | SIX_MONTHS: default | TWELVE_MONTHS] - Valid combinations of paymentMethod and paymentTerm can be found in the response. See the field priceForSelectedProduct.quote.paymentAlternatives.paymentTerm"
        paymentMethod (string, optional): "[BANKGIRO: default | AUTOGIRO] - Preferred payment method."
    }

## Response
    Response {
        response (QuoteResponse, optional):,
        errors (array[Error], optional): "Returned when any error exist"
    }
    
    QuoteResponse {
        vehicle (Vehicle, required): "Information about the vehicle",
        products(array[Product], required): "All available insurance products",
        priceForSelectedProduct (PriceCalculation, required): "Price information for the product the customer chosen in a previous request, or a product that the system has chosen for the customer",
        regionalCompany (RegionalCompany, required): "Information about the LF regional company placed closest to the customer home address."
        banks (array[Bank], required): "All valid banks that can be selected for electronic invoices"
    }

    Vehicle {
        registrationNumber (string, optional: "The registration number for the vehicle" |
        modelYear (string, required): "The model year",
        brandAndModel (string, required): "Brand and model",
        power (number, required): "(Measured in kW) The power of the engine"
    }

    Product {
        id (string, required): "(Only digits) Unique id for the product",
        name (string, required) "The name of the product",
        type (string, required) = CAR_PRIVATE|CAR_CORPORATE|MOTORBIKE_YEARLY_INSURANCE_PRIVATE|MOTORBIKE_SMART|EU_MOPED|SNOWMOBIL_11_13_YEARLY_INSURANCE|SNOWMOBIL_14_16_YEARLY_INSURANCE|LIGHT_TRUCK_PRIVATE|LIGHT_TRUCK_CORPORATE|LIGHT_TRAILER|SUZUKI_MOTORBIKE_INSURANCE: "The type of the product",
        vehicleTypeCode (string, required) = CAR|TAXI|BUS|MOTORBIKE|TERRAIN_VEHICLE|LIGHT_TRUCK|HEAVY_TRUCK|TRAILER|CARAVAN|AGRIMOTOR|MOTORIZED_EQUIPMENT|FIRE_ENGINE: "The type of the vehicle",   
        options (ProductOptions, required): "Contains the different options for the product",
        recommendation (Recommendation, required): "Insurance recommended from Rally"
        seasonalVariance (boolean, required): "Indicates that the premium is higher when the vehicle is normally used and is lower when the vehicle isn’t used. E.g. for MC the premium is higher in the summer and lower in the winter. For a snow mobile it’s the opposite."
    }


    ProductOptions {
        protectiveGearQuestion(boolean, optional) : If set then question regarding protective gear should be given to user. If set, then the value of this boolean is the value given in the service request (or a default value if nothing was set in the request). Price calculation is based on this value.
        highValueQuestion (boolean, required) optional : If set then question regarding high value should be given to user. If set, then the value of this boolean is the value given in the service request (or a default value if nothing was set in the request).
        mileage (Mileage, optional) : "Holds information about the mileage consumed by vehicle",
        availableCoverages (array[Coverage], required): "A list of all the available coverages for the vehicle, that the customer may choose from",
        availableSupplementaryInsurances (array{SupplementaryInsurance], optional): "A list of att the supplementary (extra) insurances that the customer may choose from",
    }

    Recommendation {
        coverageId (string, required): "The unique id of the coverage that Rally recommends the customer to choose",
        deductibleIds (array[string], optional): "The unique ids of the deductibles that Rally recommends the customer to choose",
        supplementaryInsuranceIds (array[string], optional): "A list of all the supplementary insurance ids that Rally recommend the customer to choose"
        message (string, required): "A message from Rally, explaining why this insurance product is a recommendation"
    }
    
    Milage {
        selectedMileage (string, required) : "the selected mileage consumption in swedish miles"
        availableYearlyMileages (array[MileageInterval], optional): "A list of all the yearly swedish miles intervals that the customer can choose from",
    }

    MileageInterval {
        from (string, required): "The from-part of the Interval",
        to (string, required): "The to-part of the Interval"
    }

    Coverage {
        id (string, required): "Unique id for the coverage",
        name (string, required) :"Name of the coverage"
        type (string, required) = FULL|PARTIAL|TRAFFIC: "The type of the coverage",
        availableDeductibles (array[Deductible], optional): "A list of all the available deductibles for the coverage",
    }

    SupplementaryInsurance {
        id (string, required): "Unique id for the supplementary insurance",
        label (string, required): "A text label for the supplementary insurance",
        type (string, required) = EXTENDED: "The type of the supplementary insurance",
        validForCoverages (array[string], required): "Array of coverage Ids, that this supplementary insurance is valid for"
        availableDeductibles (array[Deductible], optional): "A list of all deductibles, that the customer may choose from"
    }
	
	Deductible {
		name (string, required): "The name of the deductible",
		type (string, required) = TRAFFIC, VEHICLE_DAMAGE: "The type of the deductible",
		deductibleAmounts (array[DeductibleAmount], required): "A list of all the excesses that are available for the coverage",
	}

    DeductibleAmount {
        deductibleId (string, required): "Unique id for the deductible",
        name (string, required): "The amount in a string format. It may be a name representing krona or percent",
        amount (number, required): "The amount of the excess in krona. If it is in percent of a base amount, the amount is calculated to krona"
    }
    
    PriceCalculation {
        productId (string, required): "The id of the product, that the price is information is calculated for",
        coveragePriceProposals (array[CoveragePriceProposal], required): "A list of price proposals for all the coverages for the product",
        supplementaryPriceProposals (array[SupplementaryPriceProposal], optional): "A list of price proposals for all the supplementary insurances for the product",
        quote (Quote, required): "Price for the product chosen by the user",
    }

    CoveragePriceProposal {
        coverageId (string, optional): "Unique id for the coverage that this price proposal is for",
        yearlyPrice (number, required): "The yearly price for the coverage that this pricing proposal is for",
        deductibleIds (array[string], optional): A list of deductible ids that this price proposal is for"
    }
    
    SupplementaryPriceProposal {
        supplementaryInsuranceId (string, optional): "The id of the supplementary insurance, that the pricing is for.",
        yearlyPrice (number, required): "The yearly price for the supplementary insurance",
        deductiblesIds (array[string], optional): "A list of all the deductible ids this price proposal is for"
     }

    Quote {
        productName(string, required): "Name of the selected product",
        coverageId(string, required): "The coverageId this Quote is for",
        coverageName(string, required): "The name of the coverage this Quote is for"
        startDate (timestamp, required): "Start date for the insurance",
        bonus (Bonus, required): "Bonus information for the customer",
        yearlyPrice (number, required): "The yearly net premium for the coverage",
        internetCustomerDiscount (number, required): "Discount for using Internet to sign the policy"
        moments (array[Moment], required): "A list of the detailed information (moments) for the coverage",
        paymentAlternatives (array[PaymentAlternative], required): "A list of payment options",
    }

    Bonus {
        amount (number, required): "Bonus in SEK for the customer",
        name (string, required): "Name of the bonus"
    }

    Moment {
        yearlyPrice (string, required): "Yearly net premium for the moment. Amount is in SEK",
        name (string, required): "Name of the moment",
        deductible (string, optional): "Excess for moment",
        damageCategories (array[DamageCategory], optional): "A list of damage categories (sub coverages)"
    }

    DamageCategory {
        name (string, required): "Name of the damage category",
        deductible (string, required): "The deductible for the damage category",
    }

    PaymentAlternative {
        paymentMethod (string, required) = AUTOGIRO|BANKGIRO: "The payment method",
        averagePrice (number, required): "Contains average of the yearly net premium divided by the number of payment cycles",
        paymentTerm(string, required) = ONE_MONTH|SIX_MONTHS|TWELVE_MONTHS: "The payment term"
        paymentTermDistributions (array[Term], required): "A list of payment terms, containing information for each individual term",
        paymentTermAdditionFactor (number, required): "The factor of the extra fee for the selected payment term. E.g. 1.04 for a 4% extra fee."
    }

    Term {
        from (timestamp, required): "The from-part for the term",
        to (timestamp, required): "The to-part of the term",
        termAddition (number, required): "An extra fee in SEK for the selected payment method",
        amount (number, required): "The price for the given term"
    }

    RegionalCompany {
        code (string, required): "Unique number of the local company",
        name (string, required): "Name of the local company",
        email (string, optional): "The email address to the local company",
        phoneNumber (string, optional): "The phone number to the local company"
    }

    Bank {
        id (string, required): "This is the unique that identifies the bank",
        name (string, required): "The name of the bank"
    }

     Error {
        errorCode (integer, required)=[
                                     10:  "Access denied" | 
                                     11:  "System error" | 
                                     100: "Validation error (customer id is empty)" |
                                     101: "Validation error (customer id has invalid format)" |
                                     102: "Validation error (registration number is empty)" |
                                     103: "Validation error (registration number has invalid format)" |
                                     104: "Validation error (coverage id is empty)" |
                                     105: "Validation error (coverage id has invalid format)" |
                                     106: "Validation error (yearly milage has invalid format)" |
                                     107: "Validation error (supplementary id has invalid format)" |
                                     108: "Validation error (product id has invalid format)" |
                                     109: "Validation error (startdate is invalid)"
                     
                                     201: "Price proposal can not be provided" |
                                     202: "Vehicle is of a model that the price proposal must be calculated manually" |
                                     203: "Customer id does not exist in Vägtrafikregistret" |
                                     204: "It is missing data for the specified customer and organisation in Vägtrafikregistret" |
                                     205: "Vehicle is deregistered and must therefore be calculated manually" |
                                     206: "Model year for the vehicle is older than the threshold 1964 for cars or 1965 for motorbike. It must be calculated manually" |
                                     207: "According to Vägtrafikregistret, the vehicle has changed owner and the new owner is unknown for Transportstyrelsen. It must be calculated manually" |
                                     208: "According to Vägtrafikregistret, the vehicle is sold abroad" |
                                     209: "According to Vägtrafikverket, the vehicle is intended for commercial traffic. It must be calculated manually" |
                                     210: "Customer must have a residential insurance at Länsförsäkringar to be able to use this service" |
                                     211: "There already exist an insurance at Länsförsäkringar for the household or for the provided registration number and the provided customer id. Price proposal must be handled manually" |
                                     212: "According to Vägtrafikregistret, the vehicle is called and the price proposal must therefore be calculated manually" |
                                     213: "Try again later" |
                                     214: "Price proposal can not be calculated for provided registration number" |
                                     215: "Registration number is not existing in Vägtrafikregistret" |

                                     217: "Only price proposal can be provided for this vehicle. According to Vägtrafikregistret, the vehicle is pre-registered, and policy can not be created via Internet" |
                                     218: "Only price proposal can be provided for this vehicle. According to Vägtrafikregistret, the vehicle has a driving ban and policy can not be created via Internet" |
                                     219: "Only price proposal can be provided for this vehicle. The customer is not having any resident insurance at Länsförsäkringar so policy can not be created via Internet" |
                                     220: "Only price proposal can be provided for this vehicle. Registration number must be provided to be able to create policy" |
                                     221: "Invalid email" |
                                     222: "Invalid start date. The insurance can at the earliest start from today's date and must at the latest start one year from today's date") |
                                     223: "Provided car dealer id is missing"
                                     224: "The vehicle is of type Motorbike and has the property Highvalue. It is an invalid combination";
                                     
                                    ]: "",
        errorMessage (string, required): "Description of the error in english"
     }

## Business Service dependencies
None

## Integration Service dependencies
* integration.rally.nyteckning.beraknapris.v1/1.0.0-SNAPSHOT

## Flow
![Flow](GetQoute.jpg)

