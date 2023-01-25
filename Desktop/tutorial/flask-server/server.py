from flask import Flask, jsonify, request
from flask_restful import Api, Resource

app = Flask(__name__)
api = Api(app)


class Login(Resource):
    def post(self):
        posted_data = request.get_json()  # sends a post request to the /login endpoint
        username = posted_data["username"]
        password = posted_data["password"]
        if username == "admin" and password == "pasword":
            return jsonify({
                "is_authenticated": True
            })
        else:
            return jsonify({
                "is_authenticated": False
            })


# add the Login class as a resource to the API
api.add_resource(Login, '/login')

if __name__ == "__main__":
    app.run(debug=True)
