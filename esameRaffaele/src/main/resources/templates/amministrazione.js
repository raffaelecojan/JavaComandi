function aggiungiTour(tourName) {
    fetch('/api/tours', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ name: tourName }),
    }).then(response => response.json())
      .then(data => {
          // Aggiungere il tour alla lista
          const tourList = document.getElementById('tourList');
          const div = document.createElement('div');
          div.className = 'tour-item';
          div.innerHTML = `
              ${data.name}
              <input type="checkbox" class="ml-2" data-id="${data.id}">
          `;
          tourList.appendChild(div);
      }).catch(error => {
          console.error('Errore:', error);
      });
}

function aggiungiTour(tourName) {
    fetch('/api/tours', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ name: tourName }),
    }).then(response => response.json())
      .then(data => {
          // Aggiungere il tour alla lista
          const tourList = document.getElementById('tourList');
          const div = document.createElement('div');
          div.className = 'tour-item';
          div.innerHTML = `
              ${data.name}
              <input type="checkbox" class="ml-2" data-id="${data.id}">
          `;
          tourList.appendChild(div);
      }).catch(error => {
          console.error('Errore:', error);
      });
}