PGDMP     4    (            	    z           test1    14.5    14.5                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16433    test1    DATABASE     i   CREATE DATABASE test1 WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE test1;
                postgres    false            ?            1259    24642    orders    TABLE     ?   CREATE TABLE public.orders (
    id integer NOT NULL,
    "user" text NOT NULL,
    drink text NOT NULL,
    size text NOT NULL
);
    DROP TABLE public.orders;
       public         heap    postgres    false            ?            1259    24641    orders_id_seq    SEQUENCE     ?   CREATE SEQUENCE public.orders_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.orders_id_seq;
       public          postgres    false    210                       0    0    orders_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.orders_id_seq OWNED BY public.orders.id;
          public          postgres    false    209            ?            1259    24651    payments    TABLE     q   CREATE TABLE public.payments (
    id integer NOT NULL,
    "user" text NOT NULL,
    amount integer NOT NULL
);
    DROP TABLE public.payments;
       public         heap    postgres    false            ?            1259    24650    payments_id_seq    SEQUENCE     ?   CREATE SEQUENCE public.payments_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.payments_id_seq;
       public          postgres    false    212            	           0    0    payments_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.payments_id_seq OWNED BY public.payments.id;
          public          postgres    false    211            ?            1259    24660    products    TABLE     ?   CREATE TABLE public.products (
    id integer NOT NULL,
    drink_name text NOT NULL,
    size text NOT NULL,
    price double precision NOT NULL
);
    DROP TABLE public.products;
       public         heap    postgres    false            ?            1259    24659    products_id_seq    SEQUENCE     ?   CREATE SEQUENCE public.products_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.products_id_seq;
       public          postgres    false    214            
           0    0    products_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.products_id_seq OWNED BY public.products.id;
          public          postgres    false    213            f           2604    24645 	   orders id    DEFAULT     f   ALTER TABLE ONLY public.orders ALTER COLUMN id SET DEFAULT nextval('public.orders_id_seq'::regclass);
 8   ALTER TABLE public.orders ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    209    210    210            g           2604    24654    payments id    DEFAULT     j   ALTER TABLE ONLY public.payments ALTER COLUMN id SET DEFAULT nextval('public.payments_id_seq'::regclass);
 :   ALTER TABLE public.payments ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    212    211    212            h           2604    24663    products id    DEFAULT     j   ALTER TABLE ONLY public.products ALTER COLUMN id SET DEFAULT nextval('public.products_id_seq'::regclass);
 :   ALTER TABLE public.products ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    213    214    214            ?          0    24642    orders 
   TABLE DATA           9   COPY public.orders (id, "user", drink, size) FROM stdin;
    public          postgres    false    210          ?          0    24651    payments 
   TABLE DATA           6   COPY public.payments (id, "user", amount) FROM stdin;
    public          postgres    false    212   ?                 0    24660    products 
   TABLE DATA           ?   COPY public.products (id, drink_name, size, price) FROM stdin;
    public          postgres    false    214                     0    0    orders_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.orders_id_seq', 100, true);
          public          postgres    false    209                       0    0    payments_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.payments_id_seq', 20, true);
          public          postgres    false    211                       0    0    products_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.products_id_seq', 39, true);
          public          postgres    false    213            n           2606    24680    products drink_name_size 
   CONSTRAINT     _   ALTER TABLE ONLY public.products
    ADD CONSTRAINT drink_name_size UNIQUE (drink_name, size);
 B   ALTER TABLE ONLY public.products DROP CONSTRAINT drink_name_size;
       public            postgres    false    214    214            j           2606    24649    orders orders_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.orders DROP CONSTRAINT orders_pkey;
       public            postgres    false    210            l           2606    24658    payments payments_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.payments
    ADD CONSTRAINT payments_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.payments DROP CONSTRAINT payments_pkey;
       public            postgres    false    212            p           2606    24667    products products_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.products DROP CONSTRAINT products_pkey;
       public            postgres    false    214            ?   W  x??VK?? \?S?	R?wɆ???S??)*??>??x???"?BR?FMo???y?}8??D??񘻊 ??c?-cg??(??]?}:3?~???"g????%????w&???????f??`Ǳ?H=?n.??(??p????y3??ܘ?t?5?5??4?J?????????l@???`?M.mL 7???N?xl????Of(r????~?B?̴?9?k_Ф?]?{?x?AH?)???
v?Gu/tn?#?՞?D}?_??v*N?,??wJ??m;/)Qnfq???p(?X?=dOE|\!}a??Q??Y?z(?Ӣ?O?8 ???ٻ??M ??????x??<?'?8????C??5??Z??{Wpr?+^?8=?/?v:?Ht>z?D-.3r?U?o\{??#??9?Y?J1ȑ	ZHC????gDV?4H?//?u??P9J?&믾Hy?a?F*!ɑ?I??4?Z$yv?CR\`???{mv?I ?Pջ?߂???Z)?-?ӻ4?k?϶f??y??|rJ\@U?o?R?????????j N,???,??T??D?4??I$?	????GO???B??j?k(۩??VU?_???4      ?   ?   x?M?A?0???T?fI?_z??
ԈHT=??o$?j?ؔ\?<?F?l5?S)???˸?"F?|???n?|@?u?O???M?_~C҉??cּ??:?7Գ????@;??tR??T0\6w?<?_CLG??N?b5?o ~p>>         ?   x?}?I? E??)r??????$%H?????dp?????s	~?.T?gG?[???xC???mA??S4 ?
?????U?q????Z?=?2?ھ???Q=?O???N?U#9?e?X???~K	???L?K??9*thH+Gh6?;?Ƙ???=CB???Њ:8??]k???T     