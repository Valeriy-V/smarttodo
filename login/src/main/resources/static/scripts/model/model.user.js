var User = Backbone.Model.extend({
  
  urlRoot: "api/users",

  validate: function (options) {
    //TODO validation -> login, email, passwords
    var errors = [];
    if (options.password != options.repeatPassword) {
      errors.push({
        name : 'error-password',
        message : 'login can not be empty'
      });
    }
    
  }
});