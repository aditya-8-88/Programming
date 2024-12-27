const express = require("express");
const app = express();
const zod = require("zod");

app.use(express.json());

const schema = zod.array(zod.onumber());

app.post("/health-checkup", (req, res) => {
    const kidneys = req.body.kidneys;
    const response = schema.safeParse(kidneys);
    res.send({
        response
    });
});
                                                                            

app.listen(3000);