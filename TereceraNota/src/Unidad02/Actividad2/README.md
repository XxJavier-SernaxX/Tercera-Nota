                         ┌────────────────────────┐
                         │       Category         │
                         ├────────────────────────┤
                         │ - name: String         │
                         │ - description: String  │
                         ├────────────────────────┤
                         │ + getInfo(): String    │
                         │ + addProduct(p:Product):void │
                         └───────────◊────────────┘
                                     │ 1
                                     │
                                     │ * (aggregation)
                                     │
                     ┌────────────────────────────────┐
                     │            Product              │
                     ├────────────────────────────────┤
                     │ - name: String                 │
                     │ - price: double                │
                     ├────────────────────────────────┤
                     │ + getInfo(): String            │
                     └────────────────────────────────┘


┌────────────────────────┐
│        Customer         │
├────────────────────────┤
│ - name: String          │
│ - email: String         │
├────────────────────────┤
│ + getInfo(): String     │
│ + placeOrder(o:Order):void │
└────────────┬───────────┘
             │ 1
             │
             │ * (association)
             │
┌────────────────────────┐
│         Order           │
├────────────────────────┤
│ - date: String          │
│ - total: double         │
├────────────────────────┤
│ + getInfo(): String     │
│ + addProduct(p:Product):void │
└────────────◆───────────┘
             * (composition)
             │
             │
┌────────────────────────┐
│        Product          │
├────────────────────────┤
│ - name: String          │
│ - price: double         │
├────────────────────────┤
│ + getInfo(): String     │
└────────────────────────┘
