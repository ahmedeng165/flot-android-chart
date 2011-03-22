package com.flotandroidchart;

import java.util.Vector;

import com.flotandroidchart.flot.FlotChartContainer;
import com.flotandroidchart.flot.FlotDraw;
import com.flotandroidchart.flot.IPlugin;
import com.flotandroidchart.flot.Options;
import com.flotandroidchart.flot.data.PointData;
import com.flotandroidchart.flot.data.SeriesData;
import com.flotandroidchart.flot.data.TickData;
import com.flotandroidchart.flot.plugins.CrossHairPlugin;

import android.app.Activity;
import android.os.Bundle;

public class Demo5 extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vector<SeriesData> sds = new Vector<SeriesData>();
		SeriesData sd = new SeriesData();
		Vector<PointData> pds = new Vector<PointData>();
		for(double i=0; i < Math.PI * 2; i+=0.25) {
			pds.add(new PointData(i, Math.sin(i)));
		}
		sd.setData(pds);
		sd.label = "中文";
		sds.add(sd);		 
		

		SeriesData sd1 = new SeriesData();
		Vector<PointData> pds1 = new Vector<PointData>();
		for(double i=0; i < Math.PI * 2; i+=0.25) {
			pds1.add(new PointData(i, Math.cos(i)));
		}
		sd1.setData(pds1);
		sd1.label = "cos(x)";
		sds.add(sd1);
		
		SeriesData sd2 = new SeriesData();
		Vector<PointData> pds2 = new Vector<PointData>();
		for(double i=0; i < Math.PI * 2; i+=0.1) {
			pds2.add(new PointData(i, Math.tan(i)));
		}
		sd2.setData(pds2);
		sd2.label = "tan(x)";
		sds.add(sd2);		
		
		
		SeriesData sd3 = new SeriesData();
		sd3.setData(new double[][]{{-373597200000.0, 315.71}, {-370918800000.0, 317.45}, {-368326800000.0, 317.50}, {-363056400000.0, 315.86}, {-360378000000.0, 314.93}, {-357699600000.0, 313.19}, {-352429200000.0, 313.34}, {-349837200000.0, 314.67}, {-347158800000.0, 315.58}, {-344480400000.0, 316.47}, {-342061200000.0, 316.65}, {-339382800000.0, 317.71}, {-336790800000.0, 318.29}, {-334112400000.0, 318.16}, {-331520400000.0, 316.55}, {-328842000000.0, 314.80}, {-326163600000.0, 313.84}, {-323571600000.0, 313.34}, {-320893200000.0, 314.81}, {-318301200000.0, 315.59}, {-315622800000.0, 316.43}, {-312944400000.0, 316.97}, {-310438800000.0, 317.58}, {-307760400000.0, 319.03}, {-305168400000.0, 320.03}, {-302490000000.0, 319.59}, {-299898000000.0, 318.18}, {-297219600000.0, 315.91}, {-294541200000.0, 314.16}, {-291949200000.0, 313.83}, {-289270800000.0, 315.00}, {-286678800000.0, 316.19}, {-284000400000.0, 316.89}, {-281322000000.0, 317.70}, {-278902800000.0, 318.54}, {-276224400000.0, 319.48}, {-273632400000.0, 320.58}, {-270954000000.0, 319.78}, {-268362000000.0, 318.58}, {-265683600000.0, 316.79}, {-263005200000.0, 314.99}, {-260413200000.0, 315.31}, {-257734800000.0, 316.10}, {-255142800000.0, 317.01}, {-252464400000.0, 317.94}, {-249786000000.0, 318.56}, {-247366800000.0, 319.69}, {-244688400000.0, 320.58}, {-242096400000.0, 321.01}, {-239418000000.0, 320.61}, {-236826000000.0, 319.61}, {-234147600000.0, 317.40}, {-231469200000.0, 316.26}, {-228877200000.0, 315.42}, {-226198800000.0, 316.69}, {-223606800000.0, 317.69}, {-220928400000.0, 318.74}, {-218250000000.0, 319.08}, {-215830800000.0, 319.86}, {-213152400000.0, 321.39}, {-210560400000.0, 322.24}, {-207882000000.0, 321.47}, {-205290000000.0, 319.74}, {-202611600000.0, 317.77}, {-199933200000.0, 316.21}, {-197341200000.0, 315.99}, {-194662800000.0, 317.07}, {-192070800000.0, 318.36}, {-189392400000.0, 319.57}, {-178938000000.0, 322.23}, {-176259600000.0, 321.89}, {-173667600000.0, 320.44}, {-170989200000.0, 318.70}, {-168310800000.0, 316.70}, {-165718800000.0, 316.87}, {-163040400000.0, 317.68}, {-160448400000.0, 318.71}, {-157770000000.0, 319.44}, {-155091600000.0, 320.44}, {-152672400000.0, 320.89}, {-149994000000.0, 322.13}, {-147402000000.0, 322.16}, {-144723600000.0, 321.87}, {-142131600000.0, 321.21}, {-139453200000.0, 318.87}, {-136774800000.0, 317.81}, {-134182800000.0, 317.30}, {-131504400000.0, 318.87}, {-128912400000.0, 319.42}, {-126234000000.0, 320.62}, {-123555600000.0, 321.59}, {-121136400000.0, 322.39}, {-118458000000.0, 323.70}, {-115866000000.0, 324.07}, {-113187600000.0, 323.75}, {-110595600000.0, 322.40}, {-107917200000.0, 320.37}, {-105238800000.0, 318.64}, {-102646800000.0, 318.10}, {-99968400000.0, 319.79}, {-97376400000.0, 321.03}, {-94698000000.0, 322.33}, {-92019600000.0, 322.50}, {-89600400000.0, 323.04}, {-86922000000.0, 324.42}, {-84330000000.0, 325.00}, {-81651600000.0, 324.09}, {-79059600000.0, 322.55}, {-76381200000.0, 320.92}, {-73702800000.0, 319.26}, {-71110800000.0, 319.39}, {-68432400000.0, 320.72}, {-65840400000.0, 321.96}, {-63162000000.0, 322.57}, {-60483600000.0, 323.15}, {-57978000000.0, 323.89}, {-55299600000.0, 325.02}, {-52707600000.0, 325.57}, {-50029200000.0, 325.36}, {-47437200000.0, 324.14}, {-44758800000.0, 322.11}, {-42080400000.0, 320.33}, {-39488400000.0, 320.25}, {-36810000000.0, 321.32}, {-34218000000.0, 322.90}, {-31539600000.0, 324.00}, {-28861200000.0, 324.42}, {-26442000000.0, 325.64}, {-23763600000.0, 326.66}, {-21171600000.0, 327.38}, {-18493200000.0, 326.70}, {-15901200000.0, 325.89}, {-13222800000.0, 323.67}, {-10544400000.0, 322.38}, {-7952400000.0, 321.78}, {-5274000000.0, 322.85}, {-2682000000.0, 324.12}, {-3600000.0, 325.06}, {2674800000.0, 325.98}, {5094000000.0, 326.93}, {7772400000.0, 328.13}, {10364400000.0, 328.07}, {13042800000.0, 327.66}, {15634800000.0, 326.35}, {18313200000.0, 324.69}, {20991600000.0, 323.10}, {23583600000.0, 323.07}, {26262000000.0, 324.01}, {28854000000.0, 325.13}, {31532400000.0, 326.17}, {34210800000.0, 326.68}, {36630000000.0, 327.18}, {39308400000.0, 327.78}, {41900400000.0, 328.92}, {44578800000.0, 328.57}, {47170800000.0, 327.37}, {49849200000.0, 325.43}, {52527600000.0, 323.36}, {55119600000.0, 323.56}, {57798000000.0, 324.80}, {60390000000.0, 326.01}, {63068400000.0, 326.77}, {65746800000.0, 327.63}, {68252400000.0, 327.75}, {70930800000.0, 329.72}, {73522800000.0, 330.07}, {76201200000.0, 329.09}, {78793200000.0, 328.05}, {81471600000.0, 326.32}, {84150000000.0, 324.84}, {86742000000.0, 325.20}, {89420400000.0, 326.50}, {92012400000.0, 327.55}, {94690800000.0, 328.54}, {97369200000.0, 329.56}, {99788400000.0, 330.30}, {102466800000.0, 331.50}, {105058800000.0, 332.48}, {107737200000.0, 332.07}, {110329200000.0, 330.87}, {113007600000.0, 329.31}, {115686000000.0, 327.51}, {118278000000.0, 327.18}, {120956400000.0, 328.16}, {123548400000.0, 328.64}, {126226800000.0, 329.35}, {128905200000.0, 330.71}, {131324400000.0, 331.48}, {134002800000.0, 332.65}, {136594800000.0, 333.16}, {139273200000.0, 332.06}, {141865200000.0, 330.99}, {144543600000.0, 329.17}, {147222000000.0, 327.41}, {149814000000.0, 327.20}, {152492400000.0, 328.33}, {155084400000.0, 329.50}, {157762800000.0, 330.68}, {160441200000.0, 331.41}, {162860400000.0, 331.85}, {165538800000.0, 333.29}, {168130800000.0, 333.91}, {170809200000.0, 333.40}, {173401200000.0, 331.78}, {176079600000.0, 329.88}, {178758000000.0, 328.57}, {181350000000.0, 328.46}, {184028400000.0, 329.26}, {189298800000.0, 331.71}, {191977200000.0, 332.76}, {194482800000.0, 333.48}, {197161200000.0, 334.78}, {199753200000.0, 334.78}, {202431600000.0, 334.17}, {205023600000.0, 332.78}, {207702000000.0, 330.64}, {210380400000.0, 328.95}, {212972400000.0, 328.77}, {215650800000.0, 330.23}, {218242800000.0, 331.69}, {220921200000.0, 332.70}, {223599600000.0, 333.24}, {226018800000.0, 334.96}, {228697200000.0, 336.04}, {231289200000.0, 336.82}, {233967600000.0, 336.13}, {236559600000.0, 334.73}, {239238000000.0, 332.52}, {241916400000.0, 331.19}, {244508400000.0, 331.19}, {247186800000.0, 332.35}, {249778800000.0, 333.47}, {252457200000.0, 335.11}, {255135600000.0, 335.26}, {257554800000.0, 336.60}, {260233200000.0, 337.77}, {262825200000.0, 338.00}, {265503600000.0, 337.99}, {268095600000.0, 336.48}, {270774000000.0, 334.37}, {273452400000.0, 332.27}, {276044400000.0, 332.41}, {278722800000.0, 333.76}, {281314800000.0, 334.83}, {283993200000.0, 336.21}, {286671600000.0, 336.64}, {289090800000.0, 338.12}, {291769200000.0, 339.02}, {294361200000.0, 339.02}, {297039600000.0, 339.20}, {299631600000.0, 337.58}, {302310000000.0, 335.55}, {304988400000.0, 333.89}, {307580400000.0, 334.14}, {310258800000.0, 335.26}, {312850800000.0, 336.71}, {315529200000.0, 337.81}, {318207600000.0, 338.29}, {320713200000.0, 340.04}, {323391600000.0, 340.86}, {325980000000.0, 341.47}, {328658400000.0, 341.26}, {331250400000.0, 339.29}, {333928800000.0, 337.60}, {336607200000.0, 336.12}, {339202800000.0, 336.08}, {341881200000.0, 337.22}, {344473200000.0, 338.34}, {347151600000.0, 339.36}, {349830000000.0, 340.51}, {352249200000.0, 341.57}, {354924000000.0, 342.56}, {357516000000.0, 343.01}, {360194400000.0, 342.47}, {362786400000.0, 340.71}, {365464800000.0, 338.52}, {368143200000.0, 336.96}, {370738800000.0, 337.13}, {373417200000.0, 338.58}, {376009200000.0, 339.89}, {378687600000.0, 340.93}, {381366000000.0, 341.69}, {383785200000.0, 342.69}, {389052000000.0, 344.30}, {391730400000.0, 343.43}, {394322400000.0, 341.88}, {397000800000.0, 339.89}, {399679200000.0, 337.95}, {402274800000.0, 338.10}, {404953200000.0, 339.27}, {407545200000.0, 340.67}, {410223600000.0, 341.42}, {412902000000.0, 342.68}, {415321200000.0, 343.46}, {417996000000.0, 345.10}, {420588000000.0, 345.76}, {423266400000.0, 345.36}, {425858400000.0, 343.91}, {428536800000.0, 342.05}, {431215200000.0, 340.00}, {433810800000.0, 340.12}, {436489200000.0, 341.33}, {439081200000.0, 342.94}, {441759600000.0, 343.87}, {444438000000.0, 344.60}, {446943600000.0, 345.20}, {452210400000.0, 347.36}, {454888800000.0, 346.74}, {457480800000.0, 345.41}, {460159200000.0, 343.01}, {462837600000.0, 341.23}, {465433200000.0, 341.52}, {468111600000.0, 342.86}, {470703600000.0, 344.41}, {473382000000.0, 345.09}, {476060400000.0, 345.89}, {478479600000.0, 347.49}, {481154400000.0, 348.00}, {483746400000.0, 348.75}, {486424800000.0, 348.19}, {489016800000.0, 346.54}, {491695200000.0, 344.63}, {494373600000.0, 343.03}, {496969200000.0, 342.92}, {499647600000.0, 344.24}, {502239600000.0, 345.62}, {504918000000.0, 346.43}, {507596400000.0, 346.94}, {510015600000.0, 347.88}, {512690400000.0, 349.57}, {515282400000.0, 350.35}, {517960800000.0, 349.72}, {520552800000.0, 347.78}, {523231200000.0, 345.86}, {525909600000.0, 344.84}, {528505200000.0, 344.32}, {531183600000.0, 345.67}, {533775600000.0, 346.88}, {536454000000.0, 348.19}, {539132400000.0, 348.55}, {541551600000.0, 349.52}, {544226400000.0, 351.12}, {546818400000.0, 351.84}, {549496800000.0, 351.49}, {552088800000.0, 349.82}, {554767200000.0, 347.63}, {557445600000.0, 346.38}, {560041200000.0, 346.49}, {562719600000.0, 347.75}, {565311600000.0, 349.03}, {567990000000.0, 350.20}, {570668400000.0, 351.61}, {573174000000.0, 352.22}, {575848800000.0, 353.53}, {578440800000.0, 354.14}, {581119200000.0, 353.62}, {583711200000.0, 352.53}, {586389600000.0, 350.41}, {589068000000.0, 348.84}, {591663600000.0, 348.94}, {594342000000.0, 350.04}, {596934000000.0, 351.29}, {599612400000.0, 352.72}, {602290800000.0, 353.10}, {604710000000.0, 353.65}, {607384800000.0, 355.43}, {609976800000.0, 355.70}, {612655200000.0, 355.11}, {615247200000.0, 353.79}, {617925600000.0, 351.42}, {620604000000.0, 349.81}, {623199600000.0, 350.11}, {625878000000.0, 351.26}, {628470000000.0, 352.63}, {631148400000.0, 353.64}, {633826800000.0, 354.72}, {636246000000.0, 355.49}, {638920800000.0, 356.09}, {641512800000.0, 357.08}, {644191200000.0, 356.11}, {646783200000.0, 354.70}, {649461600000.0, 352.68}, {652140000000.0, 351.05}, {654735600000.0, 351.36}, {657414000000.0, 352.81}, {660006000000.0, 354.22}, {662684400000.0, 354.85}, {665362800000.0, 355.66}, {667782000000.0, 357.04}, {670456800000.0, 358.40}, {673048800000.0, 359.00}, {675727200000.0, 357.99}, {678319200000.0, 356.00}, {680997600000.0, 353.78}, {683676000000.0, 352.20}, {686271600000.0, 352.22}, {688950000000.0, 353.70}, {691542000000.0, 354.98}, {694220400000.0, 356.09}, {696898800000.0, 356.85}, {699404400000.0, 357.73}, {702079200000.0, 358.91}, {704671200000.0, 359.45}, {707349600000.0, 359.19}, {709941600000.0, 356.72}, {712620000000.0, 354.79}, {715298400000.0, 352.79}, {717894000000.0, 353.20}, {720572400000.0, 354.15}, {723164400000.0, 355.39}, {725842800000.0, 356.77}, {728521200000.0, 357.17}, {730940400000.0, 358.26}, {733615200000.0, 359.16}, {736207200000.0, 360.07}, {738885600000.0, 359.41}, {741477600000.0, 357.44}, {744156000000.0, 355.30}, {746834400000.0, 353.87}, {749430000000.0, 354.04}, {752108400000.0, 355.27}, {754700400000.0, 356.70}, {757378800000.0, 358.00}, {760057200000.0, 358.81}, {762476400000.0, 359.68}, {765151200000.0, 361.13}, {767743200000.0, 361.48}, {770421600000.0, 360.60}, {773013600000.0, 359.20}, {775692000000.0, 357.23}, {778370400000.0, 355.42}, {780966000000.0, 355.89}, {783644400000.0, 357.41}, {786236400000.0, 358.74}, {788914800000.0, 359.73}, {791593200000.0, 360.61}, {794012400000.0, 361.58}, {796687200000.0, 363.05}, {799279200000.0, 363.62}, {801957600000.0, 363.03}, {804549600000.0, 361.55}, {807228000000.0, 358.94}, {809906400000.0, 357.93}, {812502000000.0, 357.80}, {815180400000.0, 359.22}, {817772400000.0, 360.44}, {820450800000.0, 361.83}, {823129200000.0, 362.95}, {825634800000.0, 363.91}, {828309600000.0, 364.28}, {830901600000.0, 364.94}, {833580000000.0, 364.70}, {836172000000.0, 363.31}, {838850400000.0, 361.15}, {841528800000.0, 359.40}, {844120800000.0, 359.34}, {846802800000.0, 360.62}, {849394800000.0, 361.96}, {852073200000.0, 362.81}, {854751600000.0, 363.87}, {857170800000.0, 364.25}, {859845600000.0, 366.02}, {862437600000.0, 366.46}, {865116000000.0, 365.32}, {867708000000.0, 364.07}, {870386400000.0, 361.95}, {873064800000.0, 360.06}, {875656800000.0, 360.49}, {878338800000.0, 362.19}, {880930800000.0, 364.12}, {883609200000.0, 364.99}, {886287600000.0, 365.82}, {888706800000.0, 366.95}, {891381600000.0, 368.42}, {893973600000.0, 369.33}, {896652000000.0, 368.78}, {899244000000.0, 367.59}, {901922400000.0, 365.84}, {904600800000.0, 363.83}, {907192800000.0, 364.18}, {909874800000.0, 365.34}, {912466800000.0, 366.93}, {915145200000.0, 367.94}, {917823600000.0, 368.82}, {920242800000.0, 369.46}, {922917600000.0, 370.77}, {925509600000.0, 370.66}, {928188000000.0, 370.10}, {930780000000.0, 369.08}, {933458400000.0, 366.66}, {936136800000.0, 364.60}, {938728800000.0, 365.17}, {941410800000.0, 366.51}, {944002800000.0, 367.89}, {946681200000.0, 369.04}, {949359600000.0, 369.35}, {951865200000.0, 370.38}, {954540000000.0, 371.63}, {957132000000.0, 371.32}, {959810400000.0, 371.53}, {962402400000.0, 369.75}, {965080800000.0, 368.23}, {967759200000.0, 366.87}, {970351200000.0, 366.94}, {973033200000.0, 368.27}, {975625200000.0, 369.64}, {978303600000.0, 370.46}, {980982000000.0, 371.44}, {983401200000.0, 372.37}, {986076000000.0, 373.33}, {988668000000.0, 373.77}, {991346400000.0, 373.09}, {993938400000.0, 371.51}, {996616800000.0, 369.55}, {999295200000.0, 368.12}, {1001887200000.0, 368.38}, {1004569200000.0, 369.66}, {1007161200000.0, 371.11}, {1009839600000.0, 372.36}, {1012518000000.0, 373.09}, {1014937200000.0, 373.81}, {1017612000000.0, 374.93}, {1020204000000.0, 375.58}, {1022882400000.0, 375.44}, {1025474400000.0, 373.86}, {1028152800000.0, 371.77}, {1030831200000.0, 370.73}, {1033423200000.0, 370.50}, {1036105200000.0, 372.18}, {1038697200000.0, 373.70}, {1041375600000.0, 374.92}, {1044054000000.0, 375.62}, {1046473200000.0, 376.51}, {1049148000000.0, 377.75}, {1051740000000.0, 378.54}, {1054418400000.0, 378.20}, {1057010400000.0, 376.68}, {1059688800000.0, 374.43}, {1062367200000.0, 373.11}, {1064959200000.0, 373.10}, {1067641200000.0, 374.77}, {1070233200000.0, 375.97}, {1072911600000.0, 377.03}, {1075590000000.0, 377.87}, {1078095600000.0, 378.88}, {1080770400000.0, 380.42}, {1083362400000.0, 380.62}, {1086040800000.0, 379.70}, {1088632800000.0, 377.43}, {1091311200000.0, 376.32}, {1093989600000.0, 374.19}, {1096581600000.0, 374.47}, {1099263600000.0, 376.15}, {1101855600000.0, 377.51}, {1104534000000.0, 378.43}, {1107212400000.0, 379.70}, {1109631600000.0, 380.92}, {1112306400000.0, 382.18}, {1114898400000.0, 382.45}, {1117576800000.0, 382.14}, {1120168800000.0, 380.60}, {1122847200000.0, 378.64}, {1125525600000.0, 376.73}, {1128117600000.0, 376.84}, {1130799600000.0, 378.29}, {1133391600000.0, 380.06}, {1136070000000.0, 381.40}, {1138748400000.0, 382.20}, {1141167600000.0, 382.66}, {1143842400000.0, 384.69}, {1146434400000.0, 384.94}, {1149112800000.0, 384.01}, {1151704800000.0, 382.14}, {1154383200000.0, 380.31}, {1157061600000.0, 378.81}, {1159653600000.0, 379.03}, {1162335600000.0, 380.17}, {1164927600000.0, 381.85}, {1167606000000.0, 382.94}, {1170284400000.0, 383.86}, {1172703600000.0, 384.49}, {1175378400000.0, 386.37}, {1177970400000.0, 386.54}, {1180648800000.0, 385.98}, {1183240800000.0, 384.36}, {1185919200000.0, 381.85}, {1188597600000.0, 380.74}, {1191189600000.0, 381.15}, {1193871600000.0, 382.38}, {1196463600000.0, 383.94}, {1199142000000.0, 385.44}});
		//sds.add(sd3);
		
		
		Options opt = new Options();
		
		Vector<TickData> ticks = new Vector<TickData>();
		ticks.add(new TickData(0.0, ""));
		ticks.add(new TickData(Math.PI/2, "\u03c0/2"));
		ticks.add(new TickData(Math.PI, "\u03c0"));
		ticks.add(new TickData(Math.PI * 3/2, "3\u03c0/2"));
		ticks.add(new TickData(Math.PI * 2, "2\u03c0"));
		opt.xaxis.ticks = ticks;
		opt.grid.backgroundColor = new int[]{0xffffff, 0xeeeeee};
		//opt.grid.hoverable = true;
		
		opt.yaxis.ticks = new Integer(10);
		opt.yaxis.max = 2;
		opt.yaxis.min = -2;

		//opt.series.bars.show = true;
		opt.series.points.show = true;
		opt.series.lines.setShow(true);
		opt.canvas.fill = true;
		opt.canvas.fillColor = new int[]{0xff0000, 0xee};
		IPlugin[] plugins = new IPlugin[1];
		plugins[0] = new CrossHairPlugin("xy", 0xCCAA0000, 2);

		FlotDraw fd = new FlotDraw(sds, opt, plugins);


        //FlotChartContainer tv = new FlotChartContainer(this, fd);
        setContentView(R.layout.main);
        FlotChartContainer tv = (FlotChartContainer)this.findViewById(R.id.flotdraw);
        if(tv != null) {
            tv.setDrawData(fd);
        }
        
    }
}
