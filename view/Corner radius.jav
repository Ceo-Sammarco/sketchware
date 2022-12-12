

/* Corner radius
=============================== */
card.setBackground(
    new GradientDrawable() {
        public GradientDrawable getIns( int a, int b ) {
            this.setCornerRadius( a ); 
            this.setColor( b ); 
            return this; 
        }
    }.getIns( ( int )18, 0x99FFFFFF )
);
