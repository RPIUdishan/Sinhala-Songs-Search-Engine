 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t e s t ;  
  
 i m p o r t   h e l a b a s a . H B A n a l y z e r ;  
 i m p o r t   h e l a b a s a . H B C o r p u s ;  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B F o r m C o n t a i n e r ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B K n o w l e d g e B a s e ;  
 i m p o r t   h e l a b a s a . H B L e m m a ;  
 i m p o r t   h e l a b a s a . H B P O S ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . K n o w l e d g e B a s e M a n a g e r ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . N o u n C o n j u g a t o r ;  
  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B K B T e s t e r   {  
  
 	 p u b l i c   H B K B T e s t e r ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p u b l i c   v o i d   T e s t ( )  
 	 {  
 / / 	 	 H B K n o w l e d g e B a s e   o K B   =   n e w   H B K n o w l e d g e B a s e ( ) ;  
 / / 	 	  
 / / 	 	 S t r i n g   s L e m m a   =   "������ " ;  
 / / 	 	 s h o r t   i T y p e   =   1 ;  
 / / 	 	 s h o r t   i S u b T y p e   =   0 ;  
 / / 	 	 s h o r t   i R u l e I D   =   3 ;  
 / / 	 	 s h o r t   i U s e r I D   =   4 ;  
 / / 	 	  
 / / 	 	  
 / / 	 	 l o n g   i L e m m a I D   =   o K B . R e g i s t e r L e m m a ( s L e m m a ,   i T y p e ,   i S u b T y p e ) ;  
 / / 	 	  
 / / 	 	 o K B . C o n f i r m M o r p h i n g ( s L e m m a ,   i T y p e ,   i S u b T y p e ,   i R u l e I D ,   i U s e r I D ) ;  
 / /  
 / / 	 	  
 / / 	 	 s h o r t   i F o r m T y p e   =   8 ;  
 / / 	 	 s h o r t   i F o r m S u b T y p e   =   0 ;  
 / / 	 	  
 / / 	 	 o K B . A d d E x c e p t i o n ( 5 ,   i F o r m T y p e ,   i F o r m S u b T y p e ,   "����� " ,   i U s e r I D ) ;  
 / / 	 	  
 / / 	 	 H B L e m m a   o L e m m a   =   o K B . I d e n t i f y L e m m a ( s L e m m a ,   i T y p e ,   i S u b T y p e ) ;  
 / / 	 	  
 / / 	 	 o L e m m a . D e b u g P r i n t ( ) ;  
 / / 	 	  
 	 	 l o n g   l I D   =   H B K n o w l e d g e B a s e . C o n f i r m L e m m a I D ( "���� " ,   ( s h o r t ) 1 ,   ( s h o r t ) 0 ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " L e m m a   I D = "   +   l I D ) ;  
 	 	  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " A d d i n g   E x c e p t i o n   . . . " ) ;  
 	 	 H B K n o w l e d g e B a s e . A d d E x c e p t i o n ( l I D ,   ( s h o r t ) 0 ,   ( s h o r t ) 3 ,   "���� " ,   ( s h o r t ) 1 ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 }  
 	  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )    
 	 {  
 	 	 S y s t e m . o u t . p r i n t l n ( " S t a r t i n g   T e s t   . . . " ) ;  
 	 	 	 	  
 	 	 H e l a b a s a . I n i t ( ) ;  
 	 	 H e l a b a s a . S e t L o g ( n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ) ;  
 	 	 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = =   T E S T   1   = = = = = = = = = = = = = = = = = = = " ) ; 	 	  
 	 	 H B K B T e s t e r   o T e s t e r   =   n e w   H B K B T e s t e r ( ) ;  
 	 	 o T e s t e r . T e s t ( ) ;  
 	 	  
 	 }  
  
 }  
