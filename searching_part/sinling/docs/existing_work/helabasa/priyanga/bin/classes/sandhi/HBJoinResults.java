 p a c k a g e   h e l a b a s a . s a n d h i ;  
  
 i m p o r t   h e l a b a s a . H B W o r d ;  
  
 p u b l i c   c l a s s   H B J o i n R e s u l t s   {  
  
 	 p r i v a t e   H B W o r d   o _ L e f t   =   n u l l ;  
 	 p r i v a t e   H B W o r d   o _ R i g h t   =   n u l l ;  
 	 p r i v a t e   H B W o r d   o _ R e s u l t   =   n u l l ;  
 	 p r i v a t e   i n t   i _ J o i n M e t h o d   =   0 ;  
 	 p r i v a t e   l o n g   l _ S c o r e   =   0 ;  
 	 	  
 	 p u b l i c   H B J o i n R e s u l t s ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B W o r d   o R e s u l t ,   i n t   i J o i n M e t h o d )   {  
 	 	 o _ L e f t   =   o L e f t ;  
 	 	 o _ R i g h t   =   o R i g h t ;  
 	 	 o _ R e s u l t   =   o R e s u l t ;  
 	 	 i _ J o i n M e t h o d   =   i J o i n M e t h o d ; 	  
 	 }  
  
 	 p u b l i c   H B W o r d   G e t L e f t ( )  
 	 {  
 	 	 r e t u r n   o _ L e f t ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t R i g h t ( )  
 	 {  
 	 	 r e t u r n   o _ R i g h t ;  
 	 }  
  
 	 p u b l i c   H B W o r d   G e t R e s u l t ( )  
 	 {  
 	 	 r e t u r n   o _ R e s u l t ;  
 	 } 	  
 	  
 	 p u b l i c   i n t   G e t J o i n M e t h o d ( )  
 	 {  
 	 	 r e t u r n   i _ J o i n M e t h o d ; 	 	 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t S c o r e ( l o n g   l S c o r e )  
 	 {  
 	 	 l _ S c o r e   =   l S c o r e ;  
 	 }  
 	  
 	 p u b l i c   l o n g   G e t S c o r e ( )  
 	 {  
 	 	 r e t u r n   l _ S c o r e ;  
 	 }  
 	  
 }  
