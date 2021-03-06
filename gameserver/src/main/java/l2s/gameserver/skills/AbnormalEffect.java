package l2s.gameserver.skills;

/**
 * @author Bonux
**/
public enum AbnormalEffect
{
	// Normal Abnormal Effects
	/*0*/NONE,
	/*1*/DOT_BLEEDING,
	/*2*/DOT_POISON,
	/*3*/DOT_FIRE, // Мигает красный круг вокруг живота персонажа.
	/*4*/DOT_WATER, // Висит и мигает кусок для на животе персонажа.
	/*5*/DOT_WIND,
	/*6*/DOT_SOIL, // Из персонажа появляется куча бардового дыма и зеленькие кружочки.
	/*7*/STUN,
	/*8*/SLEEP,
	/*9*/SILENCE,
	/*10*/ROOT,
	/*11*/PARALYZE,
	/*12*/FLESH_STONE,
	/*13*/DOT_MP, //unk
	/*14*/BIG_HEAD,
	/*15*/DOT_FIRE_AREA, // Пламя огня начиная с ног персонажа.
	/*16*/CHANGE_TEXTURE,
	/*17*/BIG_BODY,
	/*18*/FLOATING_ROOT,
	/*19*/DANCE_ROOT,
	/*20*/GHOST_STUN, // Звездочки как у стана и на ногах красный круг.
	/*21*/STEALTH,
	/*22*/SEIZURE1, // Вокруг живота синий туман с электричеством.
	/*23*/SEIZURE2, // Вокруг живота синий туман с электричеством.
	/*24*/MAGIC_SQUARE,
	/*25*/FREEZING, // Висит и мигает кусок для на животе персонажа.
	/*26*/SHAKE, // Землетрясение.
	/*27*/UNK_27, //unk
	/*28*/ULTIMATE_DEFENCE,
	/*29*/VP_UP,
	/*30*/REAL_TARGET,
	/*31*/DEATH_MARK,
	/*32*/TURN_FLEE, // Синяя морда черепа над головой.
	/*33*/INVINCIBILITY,
	/*34*/AIR_BATTLE_SLOW, // Мигает красный туманный шар вокруг живота персонажа.
	/*35*/AIR_BATTLE_ROOT,  // Мигает красный туманный шар вокруг живота персонажа.
	/*36*/CHANGE_WP, // Багет вместо оружия.
	/*37*/CHANGE_HAIR_G, // Золотая афро-прическа.
	/*38*/CHANGE_HAIR_P, // Розовая афро-прическа.
	/*39*/CHANGE_HAIR_B, // Черная афро-прическа.
	/*40*/UNK_40, // unk
	/*41*/STIGMA_OF_SILEN,
	/*42*/SPEED_DOWN, // Зеленые и белые линии запутуются в ногах.
	/*43*/FROZEN_PILLAR,
	/*44*/CHANGE_VES_S, // Переодевает персонажа в золотой веспер.
	/*45*/CHANGE_VES_C, // Переодевает персонажа в золотой веспер.
	/*46*/CHANGE_VES_D, // Переодевает персонажа в белый веспер.
	/*47*/TIME_BOMB, // Зеленый круговой дождь в тумане над головой персонажа.
	/*48*/MP_SHIELD, // Критует клиент хD
	/*49*/AIRBIND, // Поднимает в верх и держит в красном шаре персонажа.
	/*50*/CHANGEBODY, // Переодевает персонажа в Д грейд.
	/*51*/KNOCKDOWN,
	/*52*/NAVIT_ADVENT, //unk
	/*53*/KNOCKBACK, //unk
	/*54*/CHANGE_7ANNIVERSARY, //unk
	/*55*/ON_SPOT_MOVEMENT, //unk
	/*56*/DEPORT, // Закрывает персонажа в черной туманной клетке.
	/*57*/AURA_BUFF, // С персонажа идет зеленый дым и сверкает живот.
	/*58*/AURA_BUFF_SELF, // С персонажа идет бело-желтый дым, вокруг живота идут вспышки кольцами градиентного цвета и вокруг живота летают белые кружочки. Также персонаж стоит на красном круге.
	/*59*/AURA_DEBUFF, // С персонажа мигает красный дым и сверкает живот красными полосами.
	/*60*/AURA_DEBUFF_SELF, // Персонажа окутывают красные спиральные полосы и мигает не сильно красный дым. (При активации происходит красная вспышка)
	/*61*/HURRICANE, // (При активации происходит бело-желтая вспышка)
	/*62*/HURRICANE_SELF, // Вокруг персонажа песчаная буря.
	/*63*/BLACK_MARK, // Над головой персонажа морда красного черепа.
	/*64*/BR_SOUL_AVATAR,
	/*65*/CHANGE_GRADE_B, // Переодевает персонажа в Б грейд.
	/*66*/BR_BEAM_SWORD_ONEHAND,
	/*67*/BR_BEAM_SWORD_DUAL,
	/*68*/D_NOCHAT,
	/*69*/D_HERB_POWER,
	/*70*/D_HERB_MAGIC,
	/*71*/D_TALI_DECO_P,
	/*72*/UNK_72,
	/*73*/D_TALI_DECO_C, // Рука светится желтым.
	/*74*/D_TALI_DECO_D, // Рука светится красным.
	/*75*/D_TALI_DECO_E, // Рука светится синим.
	/*76*/D_TALI_DECO_F, // Рука светится Фиолетовым.
	/*77*/D_TALI_DECO_G, // Переодевает в Топ S80, одевает плащ и диадему.
	/*78*/D_CHANGESHAPE_TRANSFORM_1, // Переодевает в NG.
	/*79*/D_CHANGESHAPE_TRANSFORM_2, // Переодевает в D.
	/*80*/D_CHANGESHAPE_TRANSFORM_3, // Переодевает в C.
	/*81*/D_CHANGESHAPE_TRANSFORM_4, // Переодевает в B.
	/*82*/D_CHANGESHAPE_TRANSFORM_5, // Переодевает в A.
	/*83*/UNK_83, // У артеас изчезает туловище, на остальных не проверялось.
	/*84*/UNK_84, // У артеас изчезает туловище, на остальных не проверялось.
	/*85*/SANTA_SUIT, // Переодевает в костюм деда мороза.
	/*86*/UNK_86, // Возле персонажа летает игральная карта.
	/*87*/UNK_87, // Переодевает в бейсбольную форму.
	/*88*/UNK_88, // Оружие персонажа превращается в свадебный букет.
	/*89*/UNK_89,	// Возле персонажа летает леденец.
	/*90*/UNK_90,	// Возле персонажа летает конфетка.
	/*91*/UNK_91,	// Возле персонажа летает печенька.
	/*92*/EMPTY_STARS,	// Над персонажом засвечивается 5 пустых звездочек.
	/*93*/ONE_STAR,	// Над персонажом засвечивается 1я звездочка.
	/*94*/TWO_STARS,	// Над персонажом засвечивается 2я звездочка.
	/*95*/THREE_STARS,	// Над персонажом засвечивается 3я звездочка.
	/*96*/FOUR_STARS,	// Над персонажом засвечивается 4я звездочка.
	/*97*/FIVE_STARS,	// Над персонажом засвечивается 5я звездочка.
	/*98*/FACEOFF,	// Песронаж стоит в бардовом круге и над головой мигают скрещенные 2 меча.
	/*99*/UNK_99,	// Под персонажем земля пытается замерзнуть и выростает перед ногами небольшая льдинка.
	/*100*/UNK_100,	// Переодевает персонажа в бронь робокопа.
	/*101*/UNK_101,	// Возле персонажа летает голова посоха Мастера Йоды.
	/*102*/UNK_102,	// Возле персонажа летает желтая нота.
	/*103*/UNK_103,	// Возле персонажа летает синяя нота.
	/*104*/UNK_104,	// Возле персонажа летает зеленая нота.
	/*105*/UNK_105,	// Возле персонажа летает лого Lineage II.
	/*106*/STOCKING_FAIRY,	// Возле персонажа летает картинка носка.
	/*107*/TREE_FAIRY,	// Возле персонажа летает картинка елки.
	/*108*/SNOWMAN_FAIRY,	// Возле персонажа летает картинка снеговика.
	/*109*/UNK_109,	// Над головой персонажа крутятся бардовые спиральки.
	/*110*/UNK_110,	// Вокруг персонажа желтый круг и персонаж стоит в красном круге.
	/*111*/UNK_111,	// Вокруг персонажа образовывается бардовая стена с синими бликами.
	/*112*/UNK_112,	// Вокруг персонажа крутятся зеленые круги в сверичном виде.
	/*113*/UNK_113,	// Над головой светится красное око.
	/*114*/STIGMA_STORM,	// Над головой светится зеленое око.
	/*115*/GREEN_SPEED_UP,	// Персонаж светиться зеленым и при беге подпрыгивает.
	/*116*/RED_SPEED_UP,	// Персонаж светиться красным и при беге подпрыгивает.
	/*117*/WIND_PROTECTION,	// Персонаж светиться в зеленый и стоит с транной агрессивной стойке.
	/*118*/LOVE,	// Начинает летать сердце над головой.
	/*119*/PERFECT_STORM,	// На уровне пояса синенький маленький круговорот воздуха.
	/*120*/UNK_120,	// Светиться синим и вокруг небольшой смерчь с листьями.
	/*121*/UNK_121,	// Темнеет персонаж с красным бликом.
	/*122*/UNK_122,
	/*123*/GREAT_GRAVITY,	// Темнеет персонаж с красной димной сверой в районе живота.
	/*124*/STEEL_MIND,	// Каждая нога окутывается зелеными полосами с звездочками и при беге подпрыгивает персонаж.
	/*125*/UNK_125,	// Вокруг персонажа ниже пояса летает черная и голубая цепь. Происходят синие вспышки.
	/*126*/OBLATE,	// Персонаж становится 2D. Сплюснутый))
	/*127*/SPALLATION,	// Персонаж оказывается в средине большого зеленого бликующего круга.
	/*128*/U_HE_ASPECT_AVE,	// С персонажа идет черный дым.
	/*129*/UNK_129,	// У артеас изчезает туловище, на остальных не проверялось.
	/*130*/UNK_130,	// У артеас изчезает туловище, на остальных не проверялось.
	/*131*/UNK_131,	// У артеас изчезает туловище, на остальных не проверялось.
	/*132*/UNK_132,	// Переодевает персонажа в бронь робокопа.
	/*133*/UNK_133,	// У артеас пропадает все тело, кроме головы, на остальных не проверялось.
	/*134*/UNK_134,	// У артеас пропадает все тело, кроме головы, на остальных не проверялось.
	/*135*/UNK_135,	// Оружие меняет на лазерное.
	/*136*/UNK_136,	// Оружие меняет на японское.
	/*137*/UNK_137,
	/*138*/UNK_138,
	/*139*/UNK_139,
	/*140*/UNK_140,
	/*141*/U_AVE_PALADIN_DEF,
	/*142*/U_AVE_GUARDIAN_DEF,
	/*143*/U_REALTAR2_AVE,
	/*144*/U_AVE_DIVINITY,
	/*145*/U_AVE_SHILPROTECTION,
	/*146*/U_EVENT_STAR_CA,
	/*147*/U_EVENT_STAR1_TA,
	/*148*/U_EVENT_STAR2_TA,
	/*149*/U_EVENT_STAR3_TA,
	/*150*/U_EVENT_STAR4_TA,
	/*151*/U_EVENT_STAR5_TA,
	/*152*/U_AVE_ABSORB_SHIELD,
	/*153*/U_KN_PHOENIX_AURA,
	/*154*/U_KN_REVENGE_AURA,
	/*155*/U_KN_EVAS_AURA,
	/*156*/U_KN_REMPLA_AURA,
	/*157*/U_AVE_LONGBOW,
	/*158*/U_AVE_WIDESWORD,
	/*159*/U_AVE_BIGFIST,
	/*160*/U_AVE_SHADOWSTEP,
	/*161*/U_TORNADO_AVE,
	/*162*/U_AVE_SNOW_SLOW,
	/*163*/U_AVE_SNOW_HOLD,
	/*164*/UNK_164,
	/*165*/U_AVE_TORNADO_SLOW,
	/*166*/U_AVE_ASTATINE_WATER,
	/*167*/U_BIGBD_CAT_NPC,
	/*168*/U_BIGBD_UNICORN_NPC,
	/*169*/U_BIGBD_DEMON_NPC,
	/*170*/U_BIGBD_CAT_PC,
	/*171*/U_BIGBD_UNICORN_PC,
	/*172*/U_BIGBD_DEMON_PC,
	/*173*/U_AVE_DRAGON_ULTIMATE(700),
	/*174*/UNK_174,
	/*175*/PIRATE_SUIT,
	/*176*/DARK_ASSASSIN_SUIT,
	/*177*/WHITE_ASSASSIN_SUIT,
	/*178*/UNK_178,
	/*179*/UNK_179,
	/*1180*/UNK_180,

	BR_POWER_OF_EVA(0),
	VP_KEEP(29);

	public static final AbnormalEffect[] VALUES = values();

	private final int _id;

	private AbnormalEffect()
	{
		_id = ordinal();
	}

	private AbnormalEffect(int id)
	{
		_id = id;
	}

	public final int getId()
	{
		return _id;
	}

	public final String getName()
	{
		return toString();
	}
}