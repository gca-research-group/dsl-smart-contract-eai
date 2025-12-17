# 🐢 Jabuti DSL

**Jabuti DSL** is a **domain-specific language (DSL)** designed to specify **smart contracts for Enterprise Application Integration (EAI) processes**.

The language provides a **high-level, declarative abstraction** to define contractual rules — such as obligations, prohibitions, and permissions — governing interactions among integrated applications, while remaining independent of specific blockchain platforms or smart contract programming languages.

---

## 📌 Motivation

Enterprise Application Integration processes frequently involve **business-critical interactions** among heterogeneous systems. When these interactions are executed across organizational boundaries, **trust, compliance, and accountability** become central concerns.

Blockchain-based smart contracts offer mechanisms to enforce agreements automatically. However, writing smart contracts directly in low-level languages (e.g., Solidity) requires **blockchain expertise** and makes contracts **hard to understand for domain experts**.

**Jabuti DSL addresses this gap** by enabling the specification of smart contracts:

* at the **business and integration level**,
* using **domain-oriented abstractions**,
* decoupled from blockchain-specific implementation details.

---

## 🎯 Objectives

The Jabuti DSL aims to:

* Provide a **high-level language** for specifying smart contracts in EAI scenarios
* Support **rights, obligations, and prohibitions** explicitly
* Improve **readability, maintainability, and validation** of contracts
* Enable **automatic transformation** to executable smart contract languages
* Serve as a **research and experimentation platform** for contract-based integration

---

## 🚀 Main Features

* 🧩 DSL focused on **Enterprise Application Integration**
* 📄 Declarative specification of:

  * Obligations
  * Prohibitions
  * Rights
* 🧠 Clear separation between:

  * Contract specification
  * Execution platform (blockchain)
* 📦 Language definition, metamodels, and examples
* 🔗 Integration with the **Jabuti ecosystem** (editor and transformation tools)
* 📜 Apache-2.0 open-source license

---

## 🧱 Repository Scope

This repository contains the **core assets of the Jabuti DSL**, including:

* The **conceptual definition** of the language
* Language models and metamodels
* Case studies and example contracts
* Supporting artifacts used in research and tooling

> ⚠️ **Important:**
> This repository **does not contain the full execution toolchain**. Parsing, editor support, and code generation are provided by complementary projects in the Jabuti ecosystem (see below).

---

## 📁 Repository Structure

```text
jabuti-dsl/
├── 01-language/                     # Language definition and core concepts
├── 02-models/                       # Metamodels and structural models
├── 03-case-study/                   # Case studies using Jabuti DSL
├── 04-feature-and-update-to-plugin/ # Updates related to tooling integration
├── 05-jabutidsl-eclipse-plugin/     # Eclipse-based plugin artifacts
├── contract-examples/               # Example contracts written in Jabuti DSL
├── metamodelo/                      # Conceptual and UML-like metamodels
├── LICENSE
└── README.md
```

---

## ✍️ Jabuti DSL at a Glance

A Jabuti contract specifies **participants, variables, and contractual clauses** that govern an integration process.

### Example (simplified)

```plaintext
contract OrderIntegration {

  variables {
    clientId
    orderDate
  }

  clauses {

    obligation SendOrder {
      rolePlayer = process
      operation  = write
      terms {
        Timeout(5)
      }
    }

    prohibition RejectOrder {
      rolePlayer = application
      operation  = response
      terms {
        MaxNumberOfOperation(0)
      }
    }

  }
}
```

This example illustrates:

* An **obligation** to send an order within a given time
* A **prohibition** preventing order rejection
* A contract expressed independently of any blockchain language

---

## 🧩 Jabuti Ecosystem

The Jabuti DSL is part of a broader ecosystem of tools:

* **Jabuti DSL Grammar (ANTLR4)**
  Implements the language grammar and parser.

* **Jabuti CE (Contract Editor)**
  An IDE/editor with syntax highlighting, validation, and assistance.

* **Transformation Engine**
  Automatically transforms Jabuti contracts into executable smart contracts (e.g., Solidity).

These tools are maintained in separate repositories within the **GCA Research Group** organization.

---

## 🎓 Research Context

Jabuti DSL is a **research-driven language** developed in the context of academic work on:

* Smart contracts
* Enterprise integration
* Contract-based coordination
* Model-driven engineering

Parts of this work have been published in peer-reviewed conferences and journals, and the language continues to evolve as part of ongoing research.

---

## 🤝 Contributing

Contributions are welcome, including:

* Improvements to language models
* New example contracts and case studies
* Documentation enhancements
* Tooling integration proposals

Please open an *issue* or submit a *pull request*.

---

## 📜 License

This project is licensed under the **Apache License 2.0**.
See the [LICENSE](LICENSE) file for details.

---

## 📬 Contact

For questions, collaboration, or research discussions, please contact the maintainers of the **GCA Research Group**.

 
