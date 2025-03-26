
<%
    // Vérifier si l'utilisateur est connecté
    if (session.getAttribute("name") == null) {
        // Si l'utilisateur n'est pas connecté, rediriger vers la page de connexion
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- HTMX -->
    <script src="https://unpkg.com/htmx.org@1.9.2"></script>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome pour les icônes -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: #f8f9fa;
        }

        .hero {
            background: #ffffff;
            padding: 60px 20px;
            text-align: center;
            border-radius: 20px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.05);
            margin-top: 40px;
        }

        .hero img {
            max-width: 100%;
            height: auto;
            border-radius: 20px;
            margin-bottom: 30px;
        }

        .btn-main {
            background-color: #007bff;
            color: white;
            padding: 12px 30px;
            font-size: 18px;
            border-radius: 30px;
        }

        .btn-main:hover {
            background-color: #0056b3;
        }

        footer {
            margin-top: 50px;
            padding: 20px;
            text-align: center;
            font-size: 14px;
            color: #888;
        }
    </style>
</head>

<body>

    <div class="container">
        <div class="hero">
            <h1 class="mb-4">Bienvenue sur notre projet Developpement Web avec Java</h1>
            <p class="lead mb-4">Ce projet est une démonstration dynamique utilisant <strong>JSP, Servlet, JDBC, HTMX et MySQL</strong>.</p>

            <!-- Image illustrative -->
            <img src="assets/img/webdev.png" alt="Illustration Développement Web" class="img-fluid"/>

                <form hx-get="logout" hx-target="#logoutMessage" hx-swap="innerHTML">
                <button type="submit" class="btn btn-outline-danger">
               <i class="fas fa-sign-out-alt me-2"></i> log out
             </button>
            </form>
             <div id="logoutMessage" style="margin-top: 15px;"></div>
                
            </div>
        </div>
    </div>

    <footer>
        &copy; 2025 - Projet Développement Web - Groupe 1
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>











