var RouterLoginService = Backbone.Router.extend({
  routes : {
    "sign_up" : 'signup',
  }
});

var ViewSignUp = new ViewSingUp();
var router = new RouterLoginService();

router.on('route:signup', function () {
  ViewSignUp.render();
});

Backbone.history.start();