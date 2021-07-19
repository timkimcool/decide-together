var mongoose = require ('mongoose');

var Schema = mongoose.Schema;

var GenreSchema = new Schema(
  {
    name: { type: String, required: true, minLength: 3, maxLength: 100 }
  }
)


// Virtual for genre's URL
GenreSchema
.virtual('url')
.get(() => {
  return '/catalog/bookinstance/' + this._id;
});

// Export model
module.exports = mongoose.model('genre', GenreSchema);