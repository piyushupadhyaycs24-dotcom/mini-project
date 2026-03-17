const express = require("express");
const app = express();
const PORT = 3000;
app.use(express.json());
app.get("/", (req, res) => {
    res.send("Server is running successfully!");
});
app.get("/api", (req, res) => {
    res.json({ message: "Hello from backend API" });
});
app.post("/data", (req, res) => {
    const data = req.body;
    res.json({
        message: "Data received",
        data: data
    });
});
app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});