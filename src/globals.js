

window.addEventListener( "load", ev => {
	var links = document.querySelectorAll( "li[link]" );

	links.forEach( link => link.addEventListener( "click", ev => {
		window.open( `https://ceo-sammarco.github.io/sketchware/${link.getAttribute( "link" )}`, "_self" );
	} ) );
} );