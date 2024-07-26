import React, { useState } from 'react';
import PropTypes from 'prop-types';


export default function TextForm(props) {

    const [text, setText] = useState("Enter text here");

    const UpperCase = () => {
        // console.log("Uppercase was clicked");
        setText(text.toUpperCase());
    }
    const LowerCase = () => {
        // console.log("LowerCase was clicked");
        setText(text.toLowerCase());
    }
    const Clear = () => {
        // console.log("Clear was clicked");
        setText("");
    }

    const onChange = (event) => {
        console.log("On Change");
        setText(event.target.value);
    }
    return (
        <div>
            <h1>{props.heading}</h1>
            <div className="mb-3">
                <textarea className="form-control" id="myBox" value={text} onChange={onChange} rows="8"></textarea>
            </div>

            <button type="button" className="btn btn-primary mx-2" onClick={UpperCase}>UpperCase</button>
            <button type="button" className="btn btn-primary mx-2" onClick={LowerCase}>LowerCase</button>
            <button type="button" className="btn btn-primary mx-2" onClick={Clear}>Clear</button>

            <div className="container my-3">
                <h1>Your text summary</h1>
                <p>{text.split(" ").length} words and {text.length} characters</p>
                <p>{0.008 * text.split(" ").length} Minutes read</p>
                <h2>Preview</h2>
                <p>{text}</p>
            </div>
        </div>

    );
}

TextForm.propTypes = {
    heading: PropTypes.string,
};

TextForm.defaultProps = {
    heading: "Add some heading here",
};