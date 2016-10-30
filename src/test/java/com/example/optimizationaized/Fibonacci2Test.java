package com.example.optimizationaized;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.collect.Lists;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Fibonacci2Test {

    @Autowired
    Fibonacci2 fibo;

    @Test
    public void test0() {
        assertThat(fibo.fibonacci(0), is(ZERO));
    }

    @Test
    public void test1() {
        assertThat(fibo.fibonacci(1), is(ONE));
    }

    @Test
    public void test5() {
        assertThat(fibo.fibonacci(5), is(BigInteger.valueOf(5)));
    }

    @Test
    public void test100() {
        assertThat(fibo.fibonacci(100), is(new BigInteger("354224848179261915075")));
    }

    @Test
    public void test30000() throws Exception {
        List<String> l = Stream.of(fibo.fibonacci(30000).toString().split("")).collect(Collectors
                .toList());
        Lists.partition(l, 50).stream().forEach(list -> {
            list.stream().forEach(System.out::print);
            System.out.println();
        });
        ;
        assertThat(fibo.fibonacci(30000), is(new BigInteger(""
                + "19042435673462438748500976847175750289440229160233"
                + "35192733911840520448018633401564505514339826149631"
                + "37464626804144068885630838500556036577403106197181"
                + "98928947929714143392611469024656483449308262883553"
                + "19893324409531421115415499209179760207446352814083"
                + "98688209952783539056482888371523133730274288541852"
                + "40413783027711286633757969372040908765210791301308"
                + "58002971154876244908230100592455051073992175761904"
                + "65207585654967892214794886667550037433102336577854"
                + "68581172290594106719323822488426939495282624863879"
                + "80482343358036886510142139482007515297954968379237"
                + "45773937393225342531979064080528356666322945947462"
                + "31582662471400644413562679254958577024910666071579"
                + "52330345145094614625710474768049470953530387317094"
                + "13604410706082989735571615761791544525979791564231"
                + "04216263957464979391384795077776802220903280507441"
                + "17399638204333556371833974607999291086606491557533"
                + "51040248072457511184392614659387374354009064529212"
                + "21950182080802222425495979798360155543925506967015"
                + "19951808728532459338310676812538930452007481229091"
                + "77621618865888274982806108108224652705835631654618"
                + "70332006766892853289064108716831003373140279469873"
                + "51579193781881331173063159818228418508827156768814"
                + "59373523010452359757757730209430432193850558609774"
                + "83758405710290689324827232264711764535072320524460"
                + "79431018211812359686023687365231150586680533719398"
                + "87711901192490071469480182692668908396707634284398"
                + "03797619997277495037186709314163025002517931570189"
                + "74637153558333816731106971444211759424920533507105"
                + "61560219468751250798525270256923881492157388526784"
                + "14311054134673189054756417329343835627008097464090"
                + "77716159442523144762824453815523547982348428082821"
                + "12001233648009210548599128260379934163713312193208"
                + "02877870621652274274055589610283029854803174083544"
                + "72471853789924123609540419227902027244741868467937"
                + "02274025286479940250746228989799760200501884172400"
                + "22841627206728268332714031918425926456735992885333"
                + "23106171072874882634393265912024859862432809197711"
                + "18019129447664771514479467005605463310729390893001"
                + "11940726307703614437570659002484903687932986802608"
                + "47126496378768734653786799007617875410294757031160"
                + "34691556396562517413773705279395762047610627787872"
                + "04147618092117298450330734362424727526929866990579"
                + "10916083308828317290287940492455205334167687102056"
                + "44289656251977864757141787227909245022543090360998"
                + "46112536054591472032328610197564612082721780744990"
                + "52831596604984957372169379252242209258179596468656"
                + "54341315419861401742940297128699298628549773684247"
                + "16877840011451671913530003046545949819735541406974"
                + "64424054842422316851012907179467385435352326197830"
                + "31259290155129893655271487991702577847512813368752"
                + "23872113775025438350069062195274622603396899781365"
                + "54934886457149755147887811890461170246175043253108"
                + "82043767959380975673177274926359358292583654087983"
                + "22192087007729393423987582746351829830094251347938"
                + "73500322834095863442764669084016121037616693862925"
                + "69985263915582316337667226479966822531017127262124"
                + "12624235022052083580878207362495285609075370175950"
                + "93620920329639613315810085683040213179537668503473"
                + "95116832689445760107136540814214021392404331241763"
                + "38564116781672718660204243410578107448350922382911"
                + "42277639259660484361336324909697661528960556050488"
                + "85766796378949073212628193430640740722928528100087"
                + "35030166384995583608311575003838363929289695277384"
                + "46000952423364520750107290833929720754281770616849"
                + "51048637714304066297658482543321955286005976030968"
                + "20437009518170202336340203155532165253867793143379"
                + "77954013968615625394510221815287053630451891545050"
                + "59528166314746755476011502487747441326009682051775"
                + "69420521185408816770837936929397875845902556398904"
                + "55176479869345796699722241141079332257866924660493"
                + "01817169379971620339839705156808894916340154157067"
                + "20634017788159791039491983692312288346995656628327"
                + "28141772961662015085762349851056698949973296550183"
                + "10680772846362425663316486101542675221749699569756"
                + "25641432960977430447386352301805864334746626727999"
                + "00634749978180819945463173555453763450176633366497"
                + "55874465027863368151754962824865790006195662871485"
                + "30031086028832461183428326743067726448788524471794"
                + "73231192371991965756473366663573691416595551941427"
                + "78108151847393235436240183532300639063155468238991"
                + "71266301160317057659159557147266475106287152896374"
                + "74115282734060474997663744501943655088381712336637"
                + "17001518338235490852659746921711080155345457927795"
                + "99849353262389399495697200913516918439732000228694"
                + "57029143217159357398785252082089262964319399493071"
                + "71349220082594079093553686881433959608920728155807"
                + "80644503591827372210002964806675603957877251591707"
                + "45276348860323628273380656715975167679115662094441"
                + "10736807723932393404714106562911761174190456599929"
                + "67115355217979048501104941609800772173489683902945"
                + "09545570409907876483446124449640922771399366671259"
                + "20738271902097280442646213007400968800247071757369"
                + "23914461453529301910823646960139692371080693155736"
                + "43061466419960719337920576087970179589758704950716"
                + "69538215660519182352267182748664955758923371252361"
                + "23266169077819623329213543228128185812980249098463"
                + "78853908040668813134647570887201296439422237052094"
                + "07348890279806411293021285650246143136205562597658"
                + "50003643999654616285213969666661963897824720677971"
                + "84359679858860952071704162090496740955051010897109"
                + "95116035722625784281756648089404646506307276336983"
                + "90219249838077821870783835510366867666346108908471"
                + "26281739149377898146823292989630036420661419994380"
                + "40852852926088411154831459916879782478335187037234"
                + "81336017874956538836683802619774965676414243209558"
                + "09208966955784919642529873179074944764563947806439"
                + "26219675584551971130668497373771104297328252823720"
                + "09371684410696394419430299444714798285563099549184"
                + "01815310362293086756750653965762502199494296585230"
                + "27680054153789230319144564667429507895449704352702"
                + "10669919977594538071882240298234778483333580247903"
                + "13999007130965253972920421723387904542274468345315"
                + "99850745011939275745068233867551394685972855095171"
                + "03658214035572356053600904057349712293131866609240"
                + "72449077501828769610423387996639398055035336370739"
                + "08215976861289581036287788014438378143797673135789"
                + "53337902118272066424399802249542626249838547116977"
                + "10023946056404910517780908036329118014527497705465"
                + "66201976833843783851372376164467387704539821085375"
                + "29322001850886744496771495141510025656919128286989"
                + "62293508849424251841418989755513061478303262571281"
                + "49637401473862981964515934107227978070596801874656"
                + "89980167167579318510855948093963205440867193360151"
                + "45194967885808440864695192876846039732476947907308"
                + "21810443367097960000")));
    }
}
