# Hibernate

# 📖 Description

Ce projet est une application Java qui utilise Hibernate pour gérer des entités de type Machine et Salle. L'application fournit des services pour effectuer des opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) sur ces entités.

# 🛠️ Technologies Utilisées

Java : Langage de programmation principal.
Hibernate : Framework ORM pour la gestion de la base de données.
Maven : Gestionnaire de dépendances et de construction.


# 🏗️ Structure du Projet

# 1. DAO (Data Access Object)
L'interface IDao<T> définit les méthodes de base pour les opérations CRUD.

# 2. Services
MachineService : Gère les opérations liées aux machines.
SalleService : Gère les opérations liées aux salles.

# 3. Utilitaire Hibernate
HibernateUtil est une classe utilitaire qui fournit une instance de SessionFactory pour établir des connexions à la base de données.
