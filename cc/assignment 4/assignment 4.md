### Assignment 4: Following Jericho cloud cube model, making decisions to select the proper IT infrastructure that fits our organization requirements.

**Step 1: Is cloud a good fit for this request?**

**Requirements:**

-   Appointment, scheduling and billing for incoming patients (around 1000
    incoming per day)

-   Storage and processing of health and lab reports of millions of patients
    with privacy of individual identity.

-   Administration and monitoring of hospital staff, members, wards and beds.

-   MIS (Management Information System) for gathering data from multiple online
    systems, analyzes the information, and reports data to aid in management
    decision-making

-   Payroll management and financial operation

-   Tracking and managing pharmacy and health equipment inventory and stock

-   Capability to address laws and regulations

-   Flexibility to expand with the organization

**Table 1:Performing a cloud affinity assessment involves evaluating the
information collected in the cloud requirements against the drivers and
inhibitors of cloud adoption and determining the viability of a cloud service.
(0:neutral, 1:low, 2:medium, 3:high)**

| **Characteristics**    |    | **Cloud adoption inhibitors**                                                                                                           | **Nil** |    | **Cloud adoption drivers**                                                                               |
|------------------------|----|-----------------------------------------------------------------------------------------------------------------------------------------|---------|----|----------------------------------------------------------------------------------------------------------|
| **Scalability**        | \- | Load will remain constant over time                                                                                                     | \-      | 2  | Load will vary significantly                                                                             |
| **Elasticity**         | 2  | Project load will vary at a low pace                                                                                                    | \-      | \- | Project load will vary at a fast pace.                                                                   |
| **Adaptability**       | \- | Once deployed, the solution is not modified                                                                                             | \-      | 2  | There will be multiple changes on solution over time, and deployments can benefit from cloud automation. |
| **Financial strategy** | \- | We have the financial capital to host the solution in our own data center.                                                              | 0       | \- | Our organization aims at shifting capital expenditures to operational expenditure.                       |
| **Skills**             | \- | We have internal capabilities to operate this solution                                                                                  | \-      | 2  | We do not have internal capabilities (such as skills, infrastructure, space) to operate this solution.   |
| **Security**           | 3  | The solution candidate processes and requires storage of sensitive data                                                                 | \-      | \- | The solution does not process any sensitive data.                                                        |
| **Integration effort** | 2  | The solution candidate must connect to several other applications (e.g. active directory and so forth).                                 | \-      | \- | The solution does not require connection to existing systems.                                            |
| **Exit strategy**      | \- | This solution candidate leads to a high level of dependency on cloud service, and it is difficult to switch cloud service if necessary. | \-      | 3  | It is easier to switch to a different cloud service if necessary.                                        |
| **Urgency**            | \- | Request is not urgent                                                                                                                   | 0       | \- | Request must be completed very quickly.                                                                  |
| **Project duration**   | \- | The solution candidate will be used for a long time.                                                                                    | 0       | \- | The solution will be used for a short time.                                                              |

**Step2:**

**Conclusion**: A solution with hybrid approach of both in-house infrastructure
and cloud services should be taken. Following are decision mapping different
dimension of cloud formation to our requirements.

| **Requirements**                                     | **Int/ Ext** | **Pro /Open** | **Para/ De-para** | **Out/In** |
|------------------------------------------------------|--------------|---------------|-------------------|------------|
| **Appointment, scheduling and billing**              | Ext          | Open          | De-para           | Out        |
| **Storage and processing of health and lab reports** | Int          | Pro           | Para              | In         |
| **Administration and monitoring**                    | Ext          | Open          | De-para           | Out        |
| **MIS**                                              | Int          | Pro           | Para              | In         |
| **Payroll management and financial operation**       | Int          | Pro           | Para              | Out        |
| **Tracking and managing inventory and stock**        | Ext          | Open          | De-para           | Out        |
| **Capability to address laws and regulations**       | Ext          | Open          | De-para           | Out        |

**Here:**

**Int/Ext:** Internal/External, **Pro/Open:** Proprietary/Open,

**Para/De-para:** Parametrized/De-parametrized, **Out/In:** Outsourced/Insourced

**Team member:**

Sakchhyam Gurung

Anjal Baral

Saugat Aryal
