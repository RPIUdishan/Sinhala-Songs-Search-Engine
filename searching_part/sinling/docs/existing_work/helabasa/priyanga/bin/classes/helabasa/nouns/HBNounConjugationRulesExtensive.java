 p a c k a g e   h e l a b a s a . n o u n s ;  
  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
  
 p u b l i c   c l a s s   H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e   e x t e n d s   H B N o u n C o n j u g a t i o n R u l e s {  
  
 	 p u b l i c   H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p u b l i c   s t a t i c   v o i d   L o a d R u l e s ( L i s t < H B T r a n s f o r m R u l e S e t >   l i s t R u l e S e t )  
 	 {  
 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * G " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +����� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 3 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +����� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +���� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "�����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 4 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +����� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 5 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� "   ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +����� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +���� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 6 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +�� " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +����� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +���� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "�����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 7 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +�� " ) ;    
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +����� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * s " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 8 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * s " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 9 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * s " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 0 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +���� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * s " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "�����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 1 ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� "   ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * s " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 2 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� "   ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 	  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * G " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 3 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "��  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 4 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 7 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 5 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 7 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "�����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 6 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 7 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;    
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 7 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 7 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 8 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 7 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 9 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 0 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 1 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;    
 	 	 o R u l e S e t . S e t N a m e ( "�����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 2 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * s " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 3 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 7 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * G " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 4 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;   	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ; 	 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * s " ) ;    
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 5 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 3 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * s " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 6 ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 	  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * s " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 7 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���   " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 7 ) ;  
  
 	 	 / / o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 / / o R u l e S e t . S e t I D ( 2 8 ) ;  
 	 	 / / o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * G " ) ;    
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "�����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 9 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M���� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 1 2 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * G " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 3 0 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 1 2 ) ;  
 	 	 	  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 3 1 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;    
 	 	 o R u l e S e t . S e t N a m e ( "������  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 3 2 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M��� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 1 0 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;    
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 3 3 ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M� " ) ;    
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M���� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 1 1 ) ;  
  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * S " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 3 4 ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M� " ) ; 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M����� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M� " ) ;    
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M����� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M����� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M���� " ) ;  
 	 	 l i s t R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 o R u l e S e t . S e t R a n k ( 1 2 ) ;  
 	 }  
 }  
