import React from "react";
import { useParams } from "react-router-dom";

function User() {
  const { id } = useParams();
  return (
    <div className="flex justify-center items-center m-5 text-3xl">
      User: {id}
    </div>
  );
}

export default User;
