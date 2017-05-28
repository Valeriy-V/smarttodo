var ViewSingUp = Backbone.View.extend({
  
  el: '.container',

  events: {
    'submit .form-signin': 'save'
  },
  
  save: function () {
    var user = new User({
      login : $('#inputLogin').val(),
      email : $('#inputEmail').val(),
      password : $('#inputPassword').val(),
      repeatPassword : $('#inputRepeatPassword').val()
    });
    user.save();
  }
});