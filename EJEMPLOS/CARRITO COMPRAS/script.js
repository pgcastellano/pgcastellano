const lista = document.querySelector('#lista');
const arrayLista = ['item 1', 'item2', 'item3'];

const template = document.querySelector("#template-li").content;
const fragment = document.createDocumentFragment();

arrayLista.forEach (item => {
    template.querySelector('span').textContent = item;
    const clone = template.cloneNode(true);
    fragment.appendChild(clone);

})
