
function submitReview(event, productName) {
    event.preventDefault();


    let rating = document.getElementById('rating').value;
    let review = document.getElementById('review').value;


    let reviews = JSON.parse(localStorage.getItem('productReviews')) || {};
    reviews[productName] = reviews[productName] || [];
    reviews[productName].push({ rating: rating, review: review });
    localStorage.setItem('productReviews', JSON.stringify(reviews));


    window.location.href = 'reviews.html';
}
