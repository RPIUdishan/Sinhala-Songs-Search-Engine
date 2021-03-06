 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B K n o w l e d g e B a s e ;  
 i m p o r t   h e l a b a s a . H B L e m m a ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n S y n t h e s i z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B N o u n F o r m S c o r i n g A l o g o r i t h m ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . A d m i n L o g i n ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . H B J o i n T e s t e r ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . W e b U t i l s ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 p u b l i c   c l a s s   C o n j u g a t i o n R u l e L i s t   e x t e n d s   H t t p S e r v l e t   {  
  
         / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 9 8 5 4 8 6 8 4 5 9 7 9 2 8 9 6 4 1 L ;  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
 	 	 i f ( A d m i n L o g i n . V e r i f y ( o R e q ,   o R e s ) )  
 	 	 { 	 	         	 	         	  
 	         	 p r i n t P a g e ( o R e q ,   o R e s ) ; 	         	  
 	 	 }  
         }  
 	  
  
 	  
         p r i v a t e   v o i d   p r i n t P a g e ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )   t h r o w s   I O E x c e p t i o n  
         {         	  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 8 " ) ;  
         	  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                 H e l a b a s a . I n i t ( ) ;  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                              
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   N o u n   C o n j u g a t i o n   R u l e s < / t i t l e > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > a   { t e x t - d e c o r a t i o n : n o n e ; } \ n a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } \ n < / s t y l e > \ n < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;                                                
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / a d m i n _ p a g e ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / a > < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > S i n h a l a   N o u n   C l a s s i f i c a t i o n   (�����  ���  �� �����  ��������� )   < / h 3 > " ) ;  
                                                
                 P r i n t R e s u l t s L i s t s ( o u t ) ;  
                  
                 o u t . p r i n t l n ( A d m i n L o g i n . G e t L o g o u t P a n e l ( o R e q ) ) ;  
                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' > r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;                  
                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;                  
         }  
          
  
          
         p u b l i c   v o i d   P r i n t R e s u l t s L i s t s ( P r i n t W r i t e r   o u t )  
         {  
         	 / / o u t . p r i n t l n ( " < h r > < p   a l i g n = ' c e n t e r ' > < h 4   a l i g n = ' c e n t e r ' >   L e m m a   I D   f r o m   " +   i F r o m +   "   t o   "   +   i T o   +   " < / h 4 > < / p > " ) ;  
         	      
         	 H B N o u n C o n j u g a t i o n R u l e s   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s ( ) ;  
         	 L i s t < H B T r a n s f o r m R u l e S e t >   l i s t R S   =   o R u l e s . G e t R u l e S e t L i s t ( ) ;  
         	  
         	 i n t   i C o u n t   =   l i s t R S . s i z e ( ) ;  
         	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < t a b l e     b o r d e r = 1   a l i g n = ' c e n t e r ' > " ) ;  
         	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
         	 {  
         	 	 H B T r a n s f o r m R u l e S e t   o R S   =   l i s t R S . g e t ( i ) ;  
         	 	  
         	 	 o u t . p r i n t l n ( " < t r > < t d   s t y l e = ' b a c k g r o u n d - c o l o r :   l i g h t g r e y ; ' > < b >   N o u n   C l a s s   [ "   +   o R S . G e t I D ( )   +   " ]   :   "   +   o R S . G e t N a m e ( )   +   " < / b > < / t d > < / t r > < t r > < t d > " ) ;  
         	 	  
         	 	 o R S . D e b u g P r i n t ( ) ;  
         	 	 o u t . p r i n t l n ( " < / t d > < / t r > " ) ;  
         	 }       	  
         	 o u t . p r i n t l n ( " < / t a b l e > < / p > " ) ;         	 	   	  
         }  
   }  
