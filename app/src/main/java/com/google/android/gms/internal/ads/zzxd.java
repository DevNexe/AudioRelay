package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxd extends zzqo {
    public static final int[] A1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean B1;
    public static boolean C1;
    public final Context V0;
    public final zzxo W0;
    public final zzxz X0;
    public final boolean Y0;
    public zzxc Z0;
    public boolean a1;
    public boolean b1;
    public Surface c1;
    public zzxg d1;
    public boolean e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public long j1;
    public long k1;
    public long l1;
    public int m1;
    public int n1;
    public int o1;
    public long p1;
    public long q1;
    public long r1;
    public int s1;
    public int t1;
    public int u1;
    public int v1;
    public float w1;
    public zzda x1;
    public int y1;
    public zzxh z1;

    public zzxd(Context context, zzqi zzqiVar, zzqq zzqqVar, long j, boolean z, Handler handler, zzya zzyaVar, int i, float f) {
        super(2, zzqiVar, zzqqVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.V0 = applicationContext;
        this.W0 = new zzxo(applicationContext);
        this.X0 = new zzxz(handler, zzyaVar);
        this.Y0 = "NVIDIA".equals(zzel.zzc);
        this.k1 = -9223372036854775807L;
        this.t1 = -1;
        this.u1 = -1;
        this.w1 = -1.0f;
        this.f1 = 1;
        this.y1 = 0;
        this.x1 = null;
    }

    public static int Q(zzql zzqlVar, zzaf zzafVar) {
        if (zzafVar.zzn == -1) {
            return zzT(zzqlVar, zzafVar);
        }
        int size = zzafVar.zzo.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) zzafVar.zzo.get(i)).length;
        }
        return zzafVar.zzn + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x015f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0167  */
    /* JADX WARN: Code duplicated, block: B:103:0x016b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0173  */
    /* JADX WARN: Code duplicated, block: B:106:0x0177  */
    /* JADX WARN: Code duplicated, block: B:108:0x017f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0183  */
    /* JADX WARN: Code duplicated, block: B:111:0x018b  */
    /* JADX WARN: Code duplicated, block: B:112:0x018f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0197  */
    /* JADX WARN: Code duplicated, block: B:115:0x019b  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:120:0x01af  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01df  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:141:0x0203  */
    /* JADX WARN: Code duplicated, block: B:142:0x0207  */
    /* JADX WARN: Code duplicated, block: B:144:0x020f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0213  */
    /* JADX WARN: Code duplicated, block: B:147:0x021b  */
    /* JADX WARN: Code duplicated, block: B:148:0x021f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:151:0x022b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0233  */
    /* JADX WARN: Code duplicated, block: B:154:0x0237  */
    /* JADX WARN: Code duplicated, block: B:156:0x023f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0243  */
    /* JADX WARN: Code duplicated, block: B:159:0x024b  */
    /* JADX WARN: Code duplicated, block: B:160:0x024f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0257  */
    /* JADX WARN: Code duplicated, block: B:163:0x025b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0263  */
    /* JADX WARN: Code duplicated, block: B:166:0x0267  */
    /* JADX WARN: Code duplicated, block: B:168:0x026f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0273  */
    /* JADX WARN: Code duplicated, block: B:171:0x027b  */
    /* JADX WARN: Code duplicated, block: B:172:0x027f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0287  */
    /* JADX WARN: Code duplicated, block: B:175:0x028b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0293  */
    /* JADX WARN: Code duplicated, block: B:178:0x0297  */
    /* JADX WARN: Code duplicated, block: B:180:0x029f  */
    /* JADX WARN: Code duplicated, block: B:181:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:184:0x02af  */
    /* JADX WARN: Code duplicated, block: B:186:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:187:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:189:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:190:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:192:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:195:0x02db  */
    /* JADX WARN: Code duplicated, block: B:196:0x02df  */
    /* JADX WARN: Code duplicated, block: B:198:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:199:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:201:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:202:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:205:0x0303  */
    /* JADX WARN: Code duplicated, block: B:207:0x030b  */
    /* JADX WARN: Code duplicated, block: B:208:0x030f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0317  */
    /* JADX WARN: Code duplicated, block: B:211:0x031b  */
    /* JADX WARN: Code duplicated, block: B:213:0x0323  */
    /* JADX WARN: Code duplicated, block: B:214:0x0327  */
    /* JADX WARN: Code duplicated, block: B:216:0x032f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0333  */
    /* JADX WARN: Code duplicated, block: B:219:0x033b  */
    /* JADX WARN: Code duplicated, block: B:220:0x033f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0347  */
    /* JADX WARN: Code duplicated, block: B:223:0x034a  */
    /* JADX WARN: Code duplicated, block: B:225:0x0352  */
    /* JADX WARN: Code duplicated, block: B:226:0x0356  */
    /* JADX WARN: Code duplicated, block: B:228:0x035e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0361  */
    /* JADX WARN: Code duplicated, block: B:231:0x0369  */
    /* JADX WARN: Code duplicated, block: B:232:0x036c  */
    /* JADX WARN: Code duplicated, block: B:234:0x0374  */
    /* JADX WARN: Code duplicated, block: B:235:0x0378  */
    /* JADX WARN: Code duplicated, block: B:237:0x0380  */
    /* JADX WARN: Code duplicated, block: B:238:0x0384  */
    /* JADX WARN: Code duplicated, block: B:240:0x038c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0390  */
    /* JADX WARN: Code duplicated, block: B:243:0x0398  */
    /* JADX WARN: Code duplicated, block: B:244:0x039c  */
    /* JADX WARN: Code duplicated, block: B:246:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:247:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:249:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:252:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:253:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:255:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:256:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:258:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:259:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:261:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:262:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:264:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:265:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:267:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:268:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:270:0x0404  */
    /* JADX WARN: Code duplicated, block: B:271:0x0408  */
    /* JADX WARN: Code duplicated, block: B:273:0x0410  */
    /* JADX WARN: Code duplicated, block: B:274:0x0414  */
    /* JADX WARN: Code duplicated, block: B:276:0x041c  */
    /* JADX WARN: Code duplicated, block: B:277:0x0420  */
    /* JADX WARN: Code duplicated, block: B:279:0x0428  */
    /* JADX WARN: Code duplicated, block: B:280:0x042b  */
    /* JADX WARN: Code duplicated, block: B:282:0x0433  */
    /* JADX WARN: Code duplicated, block: B:283:0x0436  */
    /* JADX WARN: Code duplicated, block: B:285:0x043e  */
    /* JADX WARN: Code duplicated, block: B:286:0x0441  */
    /* JADX WARN: Code duplicated, block: B:288:0x0449  */
    /* JADX WARN: Code duplicated, block: B:289:0x044d  */
    /* JADX WARN: Code duplicated, block: B:291:0x0455  */
    /* JADX WARN: Code duplicated, block: B:292:0x0459  */
    /* JADX WARN: Code duplicated, block: B:294:0x0461  */
    /* JADX WARN: Code duplicated, block: B:295:0x0465  */
    /* JADX WARN: Code duplicated, block: B:297:0x046d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0471  */
    /* JADX WARN: Code duplicated, block: B:300:0x0479  */
    /* JADX WARN: Code duplicated, block: B:301:0x047d  */
    /* JADX WARN: Code duplicated, block: B:303:0x0485  */
    /* JADX WARN: Code duplicated, block: B:304:0x0489  */
    /* JADX WARN: Code duplicated, block: B:306:0x0491  */
    /* JADX WARN: Code duplicated, block: B:307:0x0495  */
    /* JADX WARN: Code duplicated, block: B:309:0x049d  */
    /* JADX WARN: Code duplicated, block: B:310:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:312:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:313:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:315:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:316:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:318:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:319:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:321:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:322:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:324:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:325:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:327:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:328:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:330:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:331:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:333:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:334:0x0501  */
    /* JADX WARN: Code duplicated, block: B:336:0x0509  */
    /* JADX WARN: Code duplicated, block: B:337:0x050d  */
    /* JADX WARN: Code duplicated, block: B:339:0x0515  */
    /* JADX WARN: Code duplicated, block: B:340:0x0519  */
    /* JADX WARN: Code duplicated, block: B:342:0x0521  */
    /* JADX WARN: Code duplicated, block: B:343:0x0525  */
    /* JADX WARN: Code duplicated, block: B:345:0x052d  */
    /* JADX WARN: Code duplicated, block: B:346:0x0531  */
    /* JADX WARN: Code duplicated, block: B:348:0x0539  */
    /* JADX WARN: Code duplicated, block: B:349:0x053d  */
    /* JADX WARN: Code duplicated, block: B:351:0x0545  */
    /* JADX WARN: Code duplicated, block: B:352:0x0549  */
    /* JADX WARN: Code duplicated, block: B:354:0x0551  */
    /* JADX WARN: Code duplicated, block: B:355:0x0555  */
    /* JADX WARN: Code duplicated, block: B:357:0x055d  */
    /* JADX WARN: Code duplicated, block: B:358:0x0561  */
    /* JADX WARN: Code duplicated, block: B:360:0x0569  */
    /* JADX WARN: Code duplicated, block: B:361:0x056d  */
    /* JADX WARN: Code duplicated, block: B:363:0x0575  */
    /* JADX WARN: Code duplicated, block: B:364:0x0579  */
    /* JADX WARN: Code duplicated, block: B:366:0x0581  */
    /* JADX WARN: Code duplicated, block: B:367:0x0585  */
    /* JADX WARN: Code duplicated, block: B:369:0x058d  */
    /* JADX WARN: Code duplicated, block: B:370:0x0591  */
    /* JADX WARN: Code duplicated, block: B:372:0x0599  */
    /* JADX WARN: Code duplicated, block: B:373:0x059d  */
    /* JADX WARN: Code duplicated, block: B:375:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:376:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:378:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:379:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:381:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:382:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:384:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:385:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:387:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:388:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:390:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:391:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:393:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:394:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:397:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:399:0x0602  */
    /* JADX WARN: Code duplicated, block: B:400:0x0606  */
    /* JADX WARN: Code duplicated, block: B:402:0x060e  */
    /* JADX WARN: Code duplicated, block: B:403:0x0612  */
    /* JADX WARN: Code duplicated, block: B:405:0x061a  */
    /* JADX WARN: Code duplicated, block: B:406:0x061e  */
    /* JADX WARN: Code duplicated, block: B:408:0x0626  */
    /* JADX WARN: Code duplicated, block: B:409:0x062a  */
    /* JADX WARN: Code duplicated, block: B:411:0x0632  */
    /* JADX WARN: Code duplicated, block: B:412:0x0636  */
    /* JADX WARN: Code duplicated, block: B:414:0x063e  */
    /* JADX WARN: Code duplicated, block: B:415:0x0642  */
    /* JADX WARN: Code duplicated, block: B:417:0x064a  */
    /* JADX WARN: Code duplicated, block: B:418:0x064e  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:420:0x0656  */
    /* JADX WARN: Code duplicated, block: B:421:0x065a  */
    /* JADX WARN: Code duplicated, block: B:423:0x0662  */
    /* JADX WARN: Code duplicated, block: B:424:0x0666  */
    /* JADX WARN: Code duplicated, block: B:426:0x066e  */
    /* JADX WARN: Code duplicated, block: B:427:0x0672  */
    /* JADX WARN: Code duplicated, block: B:429:0x067a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:430:0x067e  */
    /* JADX WARN: Code duplicated, block: B:432:0x0686  */
    /* JADX WARN: Code duplicated, block: B:433:0x068a  */
    /* JADX WARN: Code duplicated, block: B:435:0x0692  */
    /* JADX WARN: Code duplicated, block: B:436:0x0696  */
    /* JADX WARN: Code duplicated, block: B:438:0x069e  */
    /* JADX WARN: Code duplicated, block: B:439:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:441:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:442:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:444:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:445:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:447:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:448:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:450:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:451:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:453:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:454:0x06db  */
    /* JADX WARN: Code duplicated, block: B:456:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:457:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:459:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:460:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:462:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:463:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:465:0x0704  */
    /* JADX WARN: Code duplicated, block: B:466:0x0707  */
    /* JADX WARN: Code duplicated, block: B:468:0x070f  */
    /* JADX WARN: Code duplicated, block: B:469:0x0712  */
    /* JADX WARN: Code duplicated, block: B:471:0x071a  */
    /* JADX WARN: Code duplicated, block: B:472:0x071d  */
    /* JADX WARN: Code duplicated, block: B:474:0x0721 A[Catch: all -> 0x0762, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001f, B:494:0x075a, B:44:0x0085, B:49:0x0094, B:474:0x0721, B:495:0x075e), top: B:501:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:477:0x072c  */
    /* JADX WARN: Code duplicated, block: B:479:0x0731  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:482:0x0737  */
    /* JADX WARN: Code duplicated, block: B:485:0x0741  */
    /* JADX WARN: Code duplicated, block: B:487:0x0749  */
    /* JADX WARN: Code duplicated, block: B:488:0x074b  */
    /* JADX WARN: Code duplicated, block: B:490:0x0753  */
    /* JADX WARN: Code duplicated, block: B:492:0x0756 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094 A[Catch: all -> 0x0762, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001f, B:494:0x075a, B:44:0x0085, B:49:0x0094, B:474:0x0721, B:495:0x075e), top: B:501:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0107  */
    /* JADX WARN: Code duplicated, block: B:79:0x010b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0113  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x012b  */
    /* JADX WARN: Code duplicated, block: B:88:0x012f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0137  */
    /* JADX WARN: Code duplicated, block: B:91:0x013b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0143  */
    /* JADX WARN: Code duplicated, block: B:94:0x0147  */
    /* JADX WARN: Code duplicated, block: B:96:0x014f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0153  */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean S(String str) {
        String str2;
        String str3;
        int iHashCode;
        byte b;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzxd.class) {
            if (!B1) {
                int i = zzel.zza;
                byte b2 = 5;
                byte b3 = -1;
                if (i <= 28) {
                    String str4 = zzel.zzb;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            if (!str4.equals("dangal")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case -1220081023:
                            if (!str4.equals("dangalFHD")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case -1220066608:
                            if (!str4.equals("dangalUHD")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -1012436106:
                            if (!str4.equals("oneday")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case -760312546:
                            if (!str4.equals("aquaman")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case -64886864:
                            if (!str4.equals("magnolia")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 3415681:
                            if (!str4.equals("once")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case 825323514:
                            if (!str4.equals("machuca")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (i <= 27 || !"HWEML".equals(zzel.zzb)) {
                                if (i <= 26) {
                                    str2 = zzel.zzb;
                                    switch (str2.hashCode()) {
                                        case -2144781245:
                                            if (!str2.equals("GIONEE_SWW1609")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 54;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str2.equals("GIONEE_SWW1627")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 55;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str2.equals("GIONEE_SWW1631")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 56;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str2.equals("K50a40")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 74;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str2.equals("CP8676_I02")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 22;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str2.equals("NX541J")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 89;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str2.equals("NX573J")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 90;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str2.equals("PGN528")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 101;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str2.equals("PGN610")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 102;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str2.equals("PGN611")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 103;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str2.equals("AquaPowerM")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 13;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str2.equals("RAIJIN")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 116;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str2.equals("XT1663")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 137;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str2.equals("ComioS1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 21;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str2.equals("Phantom6")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 104;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str2.equals("pacificrim")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 95;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str2.equals("vernee_M5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 130;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str2.equals("panell_dl")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 97;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str2.equals("panell_ds")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 98;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str2.equals("panell_dt")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 99;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str2.equals("GiONEE_GBL7319")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 52;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str2.equals("BRAVIA_ATV2")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 18;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str2.equals("iris60")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 70;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str2.equals("Slate_Pro")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 118;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str2.equals("namath")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 87;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str2.equals("A10-70F")) {
                                                b2 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str2.equals("A10-70L")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 6;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str2.equals("s905x018")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 120;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str2.equals("ELUGA_Ray_X")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 34;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str2.equals("tcl_eu")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 126;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str2.equals("nicklaus_f")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 88;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str2.equals("A7000-a")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 9;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str2.equals("SVP-DTV15")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 119;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str2.equals("watson")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 131;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str2.equals("whyred")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 132;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str2.equals("OnePlus5T")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 91;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str2.equals("GiONEE_CBL7513")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 51;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str2.equals("GIONEE_GBL7360")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 53;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str2.equals("Pixi4-7_3G")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 105;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str2.equals("taido_row")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 121;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str2.equals("BLACK-1X")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 17;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str2.equals("Z12_PRO")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 138;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str2.equals("ELUGA_A3_Pro")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 31;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str2.equals("woods_fn")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 134;
                                            }
                                            break;
                                        case 2126:
                                            if (!str2.equals("C1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 20;
                                            }
                                            break;
                                        case 2564:
                                            if (!str2.equals("Q5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 113;
                                            }
                                            break;
                                        case 2715:
                                            if (!str2.equals("V1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 127;
                                            }
                                            break;
                                        case 2719:
                                            if (!str2.equals("V5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 129;
                                            }
                                            break;
                                        case 3091:
                                            if (!str2.equals("b5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 16;
                                            }
                                            break;
                                        case 3483:
                                            if (!str2.equals("mh")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 84;
                                            }
                                            break;
                                        case 73405:
                                            if (!str2.equals("JGZ")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 73;
                                            }
                                            break;
                                        case 75537:
                                            if (!str2.equals("M04")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 79;
                                            }
                                            break;
                                        case 75739:
                                            if (!str2.equals("M5c")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 80;
                                            }
                                            break;
                                        case 76779:
                                            if (!str2.equals("MX6")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 86;
                                            }
                                            break;
                                        case 78669:
                                            if (!str2.equals("P85")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 94;
                                            }
                                            break;
                                        case 79305:
                                            if (!str2.equals("PLE")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 107;
                                            }
                                            break;
                                        case 80618:
                                            if (!str2.equals("QX1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 115;
                                            }
                                            break;
                                        case 88274:
                                            if (!str2.equals("Z80")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 139;
                                            }
                                            break;
                                        case 98846:
                                            if (!str2.equals("cv1")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 26;
                                            }
                                            break;
                                        case 98848:
                                            if (!str2.equals("cv3")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 27;
                                            }
                                            break;
                                        case 99329:
                                            if (!str2.equals("deb")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 28;
                                            }
                                            break;
                                        case 101481:
                                            if (!str2.equals("flo")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 49;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str2.equals("1601")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 0;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str2.equals("1713")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str2.equals("1714")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 2;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str2.equals("F01H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 36;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str2.equals("F01J")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 37;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str2.equals("F02H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 38;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str2.equals("F03H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 39;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str2.equals("F04H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 40;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str2.equals("F04J")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 41;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str2.equals("P681")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 93;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str2.equals("Q350")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 109;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str2.equals("Q427")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 111;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str2.equals("XE2X")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 136;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str2.equals("fugu")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 50;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str2.equals("kate")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 75;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str2.equals("mido")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 85;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str2.equals("p212")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 92;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str2.equals("MEIZU_M5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 83;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str2.equals("601LV")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 3;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str2.equals("602LV")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 4;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str2.equals("Aura_Note_2")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 15;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str2.equals("A1601")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 7;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str2.equals("E5643")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 30;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str2.equals("F3111")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 42;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str2.equals("F3113")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 43;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str2.equals("F3116")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 44;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str2.equals("F3211")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 45;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str2.equals("F3213")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 46;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str2.equals("F3215")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 47;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str2.equals("F3311")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 48;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str2.equals("PRO7S")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 108;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str2.equals("Q4260")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 110;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str2.equals("Q4310")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 112;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str2.equals("V23GB")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 128;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str2.equals("X3_HK")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 135;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str2.equals("i9031")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 67;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str2.equals("l5460")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 76;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str2.equals("le_x6")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 77;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str2.equals("A2016a40")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 8;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str2.equals("CPY83_I00")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 25;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str2.equals("marino_f")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 82;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str2.equals("griffin")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 60;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str2.equals("A7010a48")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 11;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str2.equals("A7020a48")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 12;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str2.equals("TB3-730F")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 122;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str2.equals("TB3-730X")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 123;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str2.equals("TB3-850F")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 124;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str2.equals("TB3-850M")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 125;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str2.equals("Pixi5-10_4G")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 106;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str2.equals("QM16XE_U")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 114;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str2.equals("GIONEE_WBL5708")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 57;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str2.equals("GIONEE_WBL7365")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 58;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str2.equals("GIONEE_WBL7519")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 59;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str2.equals("manning")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 81;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str2.equals("A7000plus")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 10;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str2.equals("j2xlteins")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 72;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str2.equals("panell_d")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 96;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str2.equals("LS-5017")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 78;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str2.equals("itel_S41")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 71;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str2.equals("hwALE-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 62;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str2.equals("EverStar_S")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 35;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str2.equals("htc_e56ml_dtul")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 61;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str2.equals("woods_f")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 133;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str2.equals("CPH1609")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 23;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str2.equals("CPH1715")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 24;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str2.equals("iball8735_9806")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 68;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str2.equals("santoni")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 117;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str2.equals("PB2-670M")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 100;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str2.equals("Infinix-X572")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 69;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str2.equals("BRAVIA_ATV3_4K")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 19;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str2.equals("DM-01K")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 29;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str2.equals("HWBLN-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 63;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str2.equals("HWCAM-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 64;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str2.equals("ASUS_X00AD_2")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 14;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str2.equals("ELUGA_Note")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 32;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str2.equals("ELUGA_Prim")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 33;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str2.equals("HWVNS-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 65;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str2.equals("HWWAS-H")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 66;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    switch (b2) {
                                        default:
                                            str3 = zzel.zzd;
                                            iHashCode = str3.hashCode();
                                            if (iHashCode != -594534941) {
                                                if (iHashCode != 2006354) {
                                                    if (iHashCode == 2006367 && str3.equals("AFTN")) {
                                                        b3 = 1;
                                                    }
                                                } else if (str3.equals("AFTA")) {
                                                    b3 = 0;
                                                }
                                            } else if (str3.equals("JSN-L21")) {
                                                b3 = 2;
                                            }
                                            if (b3 != 0 || b3 == 1 || b3 == 2) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                } else if (i <= 27) {
                    if (i <= 26) {
                        str2 = zzel.zzb;
                        switch (str2.hashCode()) {
                            case -2144781245:
                                if (!str2.equals("GIONEE_SWW1609")) {
                                    b2 = -1;
                                } else {
                                    b2 = 54;
                                }
                                break;
                            case -2144781185:
                                if (!str2.equals("GIONEE_SWW1627")) {
                                    b2 = -1;
                                } else {
                                    b2 = 55;
                                }
                                break;
                            case -2144781160:
                                if (!str2.equals("GIONEE_SWW1631")) {
                                    b2 = -1;
                                } else {
                                    b2 = 56;
                                }
                                break;
                            case -2097309513:
                                if (!str2.equals("K50a40")) {
                                    b2 = -1;
                                } else {
                                    b2 = 74;
                                }
                                break;
                            case -2022874474:
                                if (!str2.equals("CP8676_I02")) {
                                    b2 = -1;
                                } else {
                                    b2 = 22;
                                }
                                break;
                            case -1978993182:
                                if (!str2.equals("NX541J")) {
                                    b2 = -1;
                                } else {
                                    b2 = 89;
                                }
                                break;
                            case -1978990237:
                                if (!str2.equals("NX573J")) {
                                    b2 = -1;
                                } else {
                                    b2 = 90;
                                }
                                break;
                            case -1936688988:
                                if (!str2.equals("PGN528")) {
                                    b2 = -1;
                                } else {
                                    b2 = 101;
                                }
                                break;
                            case -1936688066:
                                if (!str2.equals("PGN610")) {
                                    b2 = -1;
                                } else {
                                    b2 = 102;
                                }
                                break;
                            case -1936688065:
                                if (!str2.equals("PGN611")) {
                                    b2 = -1;
                                } else {
                                    b2 = 103;
                                }
                                break;
                            case -1931988508:
                                if (!str2.equals("AquaPowerM")) {
                                    b2 = -1;
                                } else {
                                    b2 = 13;
                                }
                                break;
                            case -1885099851:
                                if (!str2.equals("RAIJIN")) {
                                    b2 = -1;
                                } else {
                                    b2 = 116;
                                }
                                break;
                            case -1696512866:
                                if (!str2.equals("XT1663")) {
                                    b2 = -1;
                                } else {
                                    b2 = 137;
                                }
                                break;
                            case -1680025915:
                                if (!str2.equals("ComioS1")) {
                                    b2 = -1;
                                } else {
                                    b2 = 21;
                                }
                                break;
                            case -1615810839:
                                if (!str2.equals("Phantom6")) {
                                    b2 = -1;
                                } else {
                                    b2 = 104;
                                }
                                break;
                            case -1600724499:
                                if (!str2.equals("pacificrim")) {
                                    b2 = -1;
                                } else {
                                    b2 = 95;
                                }
                                break;
                            case -1554255044:
                                if (!str2.equals("vernee_M5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 130;
                                }
                                break;
                            case -1481772737:
                                if (!str2.equals("panell_dl")) {
                                    b2 = -1;
                                } else {
                                    b2 = 97;
                                }
                                break;
                            case -1481772730:
                                if (!str2.equals("panell_ds")) {
                                    b2 = -1;
                                } else {
                                    b2 = 98;
                                }
                                break;
                            case -1481772729:
                                if (!str2.equals("panell_dt")) {
                                    b2 = -1;
                                } else {
                                    b2 = 99;
                                }
                                break;
                            case -1320080169:
                                if (!str2.equals("GiONEE_GBL7319")) {
                                    b2 = -1;
                                } else {
                                    b2 = 52;
                                }
                                break;
                            case -1217592143:
                                if (!str2.equals("BRAVIA_ATV2")) {
                                    b2 = -1;
                                } else {
                                    b2 = 18;
                                }
                                break;
                            case -1180384755:
                                if (!str2.equals("iris60")) {
                                    b2 = -1;
                                } else {
                                    b2 = 70;
                                }
                                break;
                            case -1139198265:
                                if (!str2.equals("Slate_Pro")) {
                                    b2 = -1;
                                } else {
                                    b2 = 118;
                                }
                                break;
                            case -1052835013:
                                if (!str2.equals("namath")) {
                                    b2 = -1;
                                } else {
                                    b2 = 87;
                                }
                                break;
                            case -993250464:
                                if (!str2.equals("A10-70F")) {
                                    b2 = -1;
                                }
                                break;
                            case -993250458:
                                if (!str2.equals("A10-70L")) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case -965403638:
                                if (!str2.equals("s905x018")) {
                                    b2 = -1;
                                } else {
                                    b2 = 120;
                                }
                                break;
                            case -958336948:
                                if (!str2.equals("ELUGA_Ray_X")) {
                                    b2 = -1;
                                } else {
                                    b2 = 34;
                                }
                                break;
                            case -879245230:
                                if (!str2.equals("tcl_eu")) {
                                    b2 = -1;
                                } else {
                                    b2 = 126;
                                }
                                break;
                            case -842500323:
                                if (!str2.equals("nicklaus_f")) {
                                    b2 = -1;
                                } else {
                                    b2 = 88;
                                }
                                break;
                            case -821392978:
                                if (!str2.equals("A7000-a")) {
                                    b2 = -1;
                                } else {
                                    b2 = 9;
                                }
                                break;
                            case -797483286:
                                if (!str2.equals("SVP-DTV15")) {
                                    b2 = -1;
                                } else {
                                    b2 = 119;
                                }
                                break;
                            case -794946968:
                                if (!str2.equals("watson")) {
                                    b2 = -1;
                                } else {
                                    b2 = 131;
                                }
                                break;
                            case -788334647:
                                if (!str2.equals("whyred")) {
                                    b2 = -1;
                                } else {
                                    b2 = 132;
                                }
                                break;
                            case -782144577:
                                if (!str2.equals("OnePlus5T")) {
                                    b2 = -1;
                                } else {
                                    b2 = 91;
                                }
                                break;
                            case -575125681:
                                if (!str2.equals("GiONEE_CBL7513")) {
                                    b2 = -1;
                                } else {
                                    b2 = 51;
                                }
                                break;
                            case -521118391:
                                if (!str2.equals("GIONEE_GBL7360")) {
                                    b2 = -1;
                                } else {
                                    b2 = 53;
                                }
                                break;
                            case -430914369:
                                if (!str2.equals("Pixi4-7_3G")) {
                                    b2 = -1;
                                } else {
                                    b2 = 105;
                                }
                                break;
                            case -290434366:
                                if (!str2.equals("taido_row")) {
                                    b2 = -1;
                                } else {
                                    b2 = 121;
                                }
                                break;
                            case -282781963:
                                if (!str2.equals("BLACK-1X")) {
                                    b2 = -1;
                                } else {
                                    b2 = 17;
                                }
                                break;
                            case -277133239:
                                if (!str2.equals("Z12_PRO")) {
                                    b2 = -1;
                                } else {
                                    b2 = 138;
                                }
                                break;
                            case -173639913:
                                if (!str2.equals("ELUGA_A3_Pro")) {
                                    b2 = -1;
                                } else {
                                    b2 = 31;
                                }
                                break;
                            case -56598463:
                                if (!str2.equals("woods_fn")) {
                                    b2 = -1;
                                } else {
                                    b2 = 134;
                                }
                                break;
                            case 2126:
                                if (!str2.equals("C1")) {
                                    b2 = -1;
                                } else {
                                    b2 = 20;
                                }
                                break;
                            case 2564:
                                if (!str2.equals("Q5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 113;
                                }
                                break;
                            case 2715:
                                if (!str2.equals("V1")) {
                                    b2 = -1;
                                } else {
                                    b2 = 127;
                                }
                                break;
                            case 2719:
                                if (!str2.equals("V5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 129;
                                }
                                break;
                            case 3091:
                                if (!str2.equals("b5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 16;
                                }
                                break;
                            case 3483:
                                if (!str2.equals("mh")) {
                                    b2 = -1;
                                } else {
                                    b2 = 84;
                                }
                                break;
                            case 73405:
                                if (!str2.equals("JGZ")) {
                                    b2 = -1;
                                } else {
                                    b2 = 73;
                                }
                                break;
                            case 75537:
                                if (!str2.equals("M04")) {
                                    b2 = -1;
                                } else {
                                    b2 = 79;
                                }
                                break;
                            case 75739:
                                if (!str2.equals("M5c")) {
                                    b2 = -1;
                                } else {
                                    b2 = 80;
                                }
                                break;
                            case 76779:
                                if (!str2.equals("MX6")) {
                                    b2 = -1;
                                } else {
                                    b2 = 86;
                                }
                                break;
                            case 78669:
                                if (!str2.equals("P85")) {
                                    b2 = -1;
                                } else {
                                    b2 = 94;
                                }
                                break;
                            case 79305:
                                if (!str2.equals("PLE")) {
                                    b2 = -1;
                                } else {
                                    b2 = 107;
                                }
                                break;
                            case 80618:
                                if (!str2.equals("QX1")) {
                                    b2 = -1;
                                } else {
                                    b2 = 115;
                                }
                                break;
                            case 88274:
                                if (!str2.equals("Z80")) {
                                    b2 = -1;
                                } else {
                                    b2 = 139;
                                }
                                break;
                            case 98846:
                                if (!str2.equals("cv1")) {
                                    b2 = -1;
                                } else {
                                    b2 = 26;
                                }
                                break;
                            case 98848:
                                if (!str2.equals("cv3")) {
                                    b2 = -1;
                                } else {
                                    b2 = 27;
                                }
                                break;
                            case 99329:
                                if (!str2.equals("deb")) {
                                    b2 = -1;
                                } else {
                                    b2 = 28;
                                }
                                break;
                            case 101481:
                                if (!str2.equals("flo")) {
                                    b2 = -1;
                                } else {
                                    b2 = 49;
                                }
                                break;
                            case 1513190:
                                if (!str2.equals("1601")) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case 1514184:
                                if (!str2.equals("1713")) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case 1514185:
                                if (!str2.equals("1714")) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case 2133089:
                                if (!str2.equals("F01H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 36;
                                }
                                break;
                            case 2133091:
                                if (!str2.equals("F01J")) {
                                    b2 = -1;
                                } else {
                                    b2 = 37;
                                }
                                break;
                            case 2133120:
                                if (!str2.equals("F02H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 38;
                                }
                                break;
                            case 2133151:
                                if (!str2.equals("F03H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 39;
                                }
                                break;
                            case 2133182:
                                if (!str2.equals("F04H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 40;
                                }
                                break;
                            case 2133184:
                                if (!str2.equals("F04J")) {
                                    b2 = -1;
                                } else {
                                    b2 = 41;
                                }
                                break;
                            case 2436959:
                                if (!str2.equals("P681")) {
                                    b2 = -1;
                                } else {
                                    b2 = 93;
                                }
                                break;
                            case 2463773:
                                if (!str2.equals("Q350")) {
                                    b2 = -1;
                                } else {
                                    b2 = 109;
                                }
                                break;
                            case 2464648:
                                if (!str2.equals("Q427")) {
                                    b2 = -1;
                                } else {
                                    b2 = 111;
                                }
                                break;
                            case 2689555:
                                if (!str2.equals("XE2X")) {
                                    b2 = -1;
                                } else {
                                    b2 = 136;
                                }
                                break;
                            case 3154429:
                                if (!str2.equals("fugu")) {
                                    b2 = -1;
                                } else {
                                    b2 = 50;
                                }
                                break;
                            case 3284551:
                                if (!str2.equals("kate")) {
                                    b2 = -1;
                                } else {
                                    b2 = 75;
                                }
                                break;
                            case 3351335:
                                if (!str2.equals("mido")) {
                                    b2 = -1;
                                } else {
                                    b2 = 85;
                                }
                                break;
                            case 3386211:
                                if (!str2.equals("p212")) {
                                    b2 = -1;
                                } else {
                                    b2 = 92;
                                }
                                break;
                            case 41325051:
                                if (!str2.equals("MEIZU_M5")) {
                                    b2 = -1;
                                } else {
                                    b2 = 83;
                                }
                                break;
                            case 51349633:
                                if (!str2.equals("601LV")) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case 51350594:
                                if (!str2.equals("602LV")) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case 55178625:
                                if (!str2.equals("Aura_Note_2")) {
                                    b2 = -1;
                                } else {
                                    b2 = 15;
                                }
                                break;
                            case 61542055:
                                if (!str2.equals("A1601")) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case 65355429:
                                if (!str2.equals("E5643")) {
                                    b2 = -1;
                                } else {
                                    b2 = 30;
                                }
                                break;
                            case 66214468:
                                if (!str2.equals("F3111")) {
                                    b2 = -1;
                                } else {
                                    b2 = 42;
                                }
                                break;
                            case 66214470:
                                if (!str2.equals("F3113")) {
                                    b2 = -1;
                                } else {
                                    b2 = 43;
                                }
                                break;
                            case 66214473:
                                if (!str2.equals("F3116")) {
                                    b2 = -1;
                                } else {
                                    b2 = 44;
                                }
                                break;
                            case 66215429:
                                if (!str2.equals("F3211")) {
                                    b2 = -1;
                                } else {
                                    b2 = 45;
                                }
                                break;
                            case 66215431:
                                if (!str2.equals("F3213")) {
                                    b2 = -1;
                                } else {
                                    b2 = 46;
                                }
                                break;
                            case 66215433:
                                if (!str2.equals("F3215")) {
                                    b2 = -1;
                                } else {
                                    b2 = 47;
                                }
                                break;
                            case 66216390:
                                if (!str2.equals("F3311")) {
                                    b2 = -1;
                                } else {
                                    b2 = 48;
                                }
                                break;
                            case 76402249:
                                if (!str2.equals("PRO7S")) {
                                    b2 = -1;
                                } else {
                                    b2 = 108;
                                }
                                break;
                            case 76404105:
                                if (!str2.equals("Q4260")) {
                                    b2 = -1;
                                } else {
                                    b2 = 110;
                                }
                                break;
                            case 76404911:
                                if (!str2.equals("Q4310")) {
                                    b2 = -1;
                                } else {
                                    b2 = 112;
                                }
                                break;
                            case 80963634:
                                if (!str2.equals("V23GB")) {
                                    b2 = -1;
                                } else {
                                    b2 = 128;
                                }
                                break;
                            case 82882791:
                                if (!str2.equals("X3_HK")) {
                                    b2 = -1;
                                } else {
                                    b2 = 135;
                                }
                                break;
                            case 98715550:
                                if (!str2.equals("i9031")) {
                                    b2 = -1;
                                } else {
                                    b2 = 67;
                                }
                                break;
                            case 101370885:
                                if (!str2.equals("l5460")) {
                                    b2 = -1;
                                } else {
                                    b2 = 76;
                                }
                                break;
                            case 102844228:
                                if (!str2.equals("le_x6")) {
                                    b2 = -1;
                                } else {
                                    b2 = 77;
                                }
                                break;
                            case 165221241:
                                if (!str2.equals("A2016a40")) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            case 182191441:
                                if (!str2.equals("CPY83_I00")) {
                                    b2 = -1;
                                } else {
                                    b2 = 25;
                                }
                                break;
                            case 245388979:
                                if (!str2.equals("marino_f")) {
                                    b2 = -1;
                                } else {
                                    b2 = 82;
                                }
                                break;
                            case 287431619:
                                if (!str2.equals("griffin")) {
                                    b2 = -1;
                                } else {
                                    b2 = 60;
                                }
                                break;
                            case 307593612:
                                if (!str2.equals("A7010a48")) {
                                    b2 = -1;
                                } else {
                                    b2 = 11;
                                }
                                break;
                            case 308517133:
                                if (!str2.equals("A7020a48")) {
                                    b2 = -1;
                                } else {
                                    b2 = 12;
                                }
                                break;
                            case 316215098:
                                if (!str2.equals("TB3-730F")) {
                                    b2 = -1;
                                } else {
                                    b2 = 122;
                                }
                                break;
                            case 316215116:
                                if (!str2.equals("TB3-730X")) {
                                    b2 = -1;
                                } else {
                                    b2 = 123;
                                }
                                break;
                            case 316246811:
                                if (!str2.equals("TB3-850F")) {
                                    b2 = -1;
                                } else {
                                    b2 = 124;
                                }
                                break;
                            case 316246818:
                                if (!str2.equals("TB3-850M")) {
                                    b2 = -1;
                                } else {
                                    b2 = 125;
                                }
                                break;
                            case 407160593:
                                if (!str2.equals("Pixi5-10_4G")) {
                                    b2 = -1;
                                } else {
                                    b2 = 106;
                                }
                                break;
                            case 507412548:
                                if (!str2.equals("QM16XE_U")) {
                                    b2 = -1;
                                } else {
                                    b2 = 114;
                                }
                                break;
                            case 793982701:
                                if (!str2.equals("GIONEE_WBL5708")) {
                                    b2 = -1;
                                } else {
                                    b2 = 57;
                                }
                                break;
                            case 794038622:
                                if (!str2.equals("GIONEE_WBL7365")) {
                                    b2 = -1;
                                } else {
                                    b2 = 58;
                                }
                                break;
                            case 794040393:
                                if (!str2.equals("GIONEE_WBL7519")) {
                                    b2 = -1;
                                } else {
                                    b2 = 59;
                                }
                                break;
                            case 835649806:
                                if (!str2.equals("manning")) {
                                    b2 = -1;
                                } else {
                                    b2 = 81;
                                }
                                break;
                            case 917340916:
                                if (!str2.equals("A7000plus")) {
                                    b2 = -1;
                                } else {
                                    b2 = 10;
                                }
                                break;
                            case 958008161:
                                if (!str2.equals("j2xlteins")) {
                                    b2 = -1;
                                } else {
                                    b2 = 72;
                                }
                                break;
                            case 1060579533:
                                if (!str2.equals("panell_d")) {
                                    b2 = -1;
                                } else {
                                    b2 = 96;
                                }
                                break;
                            case 1150207623:
                                if (!str2.equals("LS-5017")) {
                                    b2 = -1;
                                } else {
                                    b2 = 78;
                                }
                                break;
                            case 1176899427:
                                if (!str2.equals("itel_S41")) {
                                    b2 = -1;
                                } else {
                                    b2 = 71;
                                }
                                break;
                            case 1280332038:
                                if (!str2.equals("hwALE-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 62;
                                }
                                break;
                            case 1306947716:
                                if (!str2.equals("EverStar_S")) {
                                    b2 = -1;
                                } else {
                                    b2 = 35;
                                }
                                break;
                            case 1349174697:
                                if (!str2.equals("htc_e56ml_dtul")) {
                                    b2 = -1;
                                } else {
                                    b2 = 61;
                                }
                                break;
                            case 1522194893:
                                if (!str2.equals("woods_f")) {
                                    b2 = -1;
                                } else {
                                    b2 = 133;
                                }
                                break;
                            case 1691543273:
                                if (!str2.equals("CPH1609")) {
                                    b2 = -1;
                                } else {
                                    b2 = 23;
                                }
                                break;
                            case 1691544261:
                                if (!str2.equals("CPH1715")) {
                                    b2 = -1;
                                } else {
                                    b2 = 24;
                                }
                                break;
                            case 1709443163:
                                if (!str2.equals("iball8735_9806")) {
                                    b2 = -1;
                                } else {
                                    b2 = 68;
                                }
                                break;
                            case 1865889110:
                                if (!str2.equals("santoni")) {
                                    b2 = -1;
                                } else {
                                    b2 = 117;
                                }
                                break;
                            case 1906253259:
                                if (!str2.equals("PB2-670M")) {
                                    b2 = -1;
                                } else {
                                    b2 = 100;
                                }
                                break;
                            case 1977196784:
                                if (!str2.equals("Infinix-X572")) {
                                    b2 = -1;
                                } else {
                                    b2 = 69;
                                }
                                break;
                            case 2006372676:
                                if (!str2.equals("BRAVIA_ATV3_4K")) {
                                    b2 = -1;
                                } else {
                                    b2 = 19;
                                }
                                break;
                            case 2019281702:
                                if (!str2.equals("DM-01K")) {
                                    b2 = -1;
                                } else {
                                    b2 = 29;
                                }
                                break;
                            case 2029784656:
                                if (!str2.equals("HWBLN-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 63;
                                }
                                break;
                            case 2030379515:
                                if (!str2.equals("HWCAM-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 64;
                                }
                                break;
                            case 2033393791:
                                if (!str2.equals("ASUS_X00AD_2")) {
                                    b2 = -1;
                                } else {
                                    b2 = 14;
                                }
                                break;
                            case 2047190025:
                                if (!str2.equals("ELUGA_Note")) {
                                    b2 = -1;
                                } else {
                                    b2 = 32;
                                }
                                break;
                            case 2047252157:
                                if (!str2.equals("ELUGA_Prim")) {
                                    b2 = -1;
                                } else {
                                    b2 = 33;
                                }
                                break;
                            case 2048319463:
                                if (!str2.equals("HWVNS-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 65;
                                }
                                break;
                            case 2048855701:
                                if (!str2.equals("HWWAS-H")) {
                                    b2 = -1;
                                } else {
                                    b2 = 66;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                str3 = zzel.zzd;
                                iHashCode = str3.hashCode();
                                if (iHashCode != -594534941) {
                                    if (iHashCode != 2006354) {
                                        if (iHashCode == 2006367) {
                                            b3 = 1;
                                        }
                                    } else if (str3.equals("AFTA")) {
                                        b3 = 0;
                                    }
                                } else if (str3.equals("JSN-L21")) {
                                    b3 = 2;
                                }
                                if (b3 != 0) {
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case 123:
                            case 124:
                            case 125:
                            case 126:
                            case 127:
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                            case 136:
                            case 137:
                            case 138:
                            case 139:
                                z = true;
                                break;
                        }
                    }
                } else if (i <= 26) {
                    str2 = zzel.zzb;
                    switch (str2.hashCode()) {
                        case -2144781245:
                            if (!str2.equals("GIONEE_SWW1609")) {
                                b2 = -1;
                            } else {
                                b2 = 54;
                            }
                            break;
                        case -2144781185:
                            if (!str2.equals("GIONEE_SWW1627")) {
                                b2 = -1;
                            } else {
                                b2 = 55;
                            }
                            break;
                        case -2144781160:
                            if (!str2.equals("GIONEE_SWW1631")) {
                                b2 = -1;
                            } else {
                                b2 = 56;
                            }
                            break;
                        case -2097309513:
                            if (!str2.equals("K50a40")) {
                                b2 = -1;
                            } else {
                                b2 = 74;
                            }
                            break;
                        case -2022874474:
                            if (!str2.equals("CP8676_I02")) {
                                b2 = -1;
                            } else {
                                b2 = 22;
                            }
                            break;
                        case -1978993182:
                            if (!str2.equals("NX541J")) {
                                b2 = -1;
                            } else {
                                b2 = 89;
                            }
                            break;
                        case -1978990237:
                            if (!str2.equals("NX573J")) {
                                b2 = -1;
                            } else {
                                b2 = 90;
                            }
                            break;
                        case -1936688988:
                            if (!str2.equals("PGN528")) {
                                b2 = -1;
                            } else {
                                b2 = 101;
                            }
                            break;
                        case -1936688066:
                            if (!str2.equals("PGN610")) {
                                b2 = -1;
                            } else {
                                b2 = 102;
                            }
                            break;
                        case -1936688065:
                            if (!str2.equals("PGN611")) {
                                b2 = -1;
                            } else {
                                b2 = 103;
                            }
                            break;
                        case -1931988508:
                            if (!str2.equals("AquaPowerM")) {
                                b2 = -1;
                            } else {
                                b2 = 13;
                            }
                            break;
                        case -1885099851:
                            if (!str2.equals("RAIJIN")) {
                                b2 = -1;
                            } else {
                                b2 = 116;
                            }
                            break;
                        case -1696512866:
                            if (!str2.equals("XT1663")) {
                                b2 = -1;
                            } else {
                                b2 = 137;
                            }
                            break;
                        case -1680025915:
                            if (!str2.equals("ComioS1")) {
                                b2 = -1;
                            } else {
                                b2 = 21;
                            }
                            break;
                        case -1615810839:
                            if (!str2.equals("Phantom6")) {
                                b2 = -1;
                            } else {
                                b2 = 104;
                            }
                            break;
                        case -1600724499:
                            if (!str2.equals("pacificrim")) {
                                b2 = -1;
                            } else {
                                b2 = 95;
                            }
                            break;
                        case -1554255044:
                            if (!str2.equals("vernee_M5")) {
                                b2 = -1;
                            } else {
                                b2 = 130;
                            }
                            break;
                        case -1481772737:
                            if (!str2.equals("panell_dl")) {
                                b2 = -1;
                            } else {
                                b2 = 97;
                            }
                            break;
                        case -1481772730:
                            if (!str2.equals("panell_ds")) {
                                b2 = -1;
                            } else {
                                b2 = 98;
                            }
                            break;
                        case -1481772729:
                            if (!str2.equals("panell_dt")) {
                                b2 = -1;
                            } else {
                                b2 = 99;
                            }
                            break;
                        case -1320080169:
                            if (!str2.equals("GiONEE_GBL7319")) {
                                b2 = -1;
                            } else {
                                b2 = 52;
                            }
                            break;
                        case -1217592143:
                            if (!str2.equals("BRAVIA_ATV2")) {
                                b2 = -1;
                            } else {
                                b2 = 18;
                            }
                            break;
                        case -1180384755:
                            if (!str2.equals("iris60")) {
                                b2 = -1;
                            } else {
                                b2 = 70;
                            }
                            break;
                        case -1139198265:
                            if (!str2.equals("Slate_Pro")) {
                                b2 = -1;
                            } else {
                                b2 = 118;
                            }
                            break;
                        case -1052835013:
                            if (!str2.equals("namath")) {
                                b2 = -1;
                            } else {
                                b2 = 87;
                            }
                            break;
                        case -993250464:
                            if (!str2.equals("A10-70F")) {
                                b2 = -1;
                            }
                            break;
                        case -993250458:
                            if (!str2.equals("A10-70L")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case -965403638:
                            if (!str2.equals("s905x018")) {
                                b2 = -1;
                            } else {
                                b2 = 120;
                            }
                            break;
                        case -958336948:
                            if (!str2.equals("ELUGA_Ray_X")) {
                                b2 = -1;
                            } else {
                                b2 = 34;
                            }
                            break;
                        case -879245230:
                            if (!str2.equals("tcl_eu")) {
                                b2 = -1;
                            } else {
                                b2 = 126;
                            }
                            break;
                        case -842500323:
                            if (!str2.equals("nicklaus_f")) {
                                b2 = -1;
                            } else {
                                b2 = 88;
                            }
                            break;
                        case -821392978:
                            if (!str2.equals("A7000-a")) {
                                b2 = -1;
                            } else {
                                b2 = 9;
                            }
                            break;
                        case -797483286:
                            if (!str2.equals("SVP-DTV15")) {
                                b2 = -1;
                            } else {
                                b2 = 119;
                            }
                            break;
                        case -794946968:
                            if (!str2.equals("watson")) {
                                b2 = -1;
                            } else {
                                b2 = 131;
                            }
                            break;
                        case -788334647:
                            if (!str2.equals("whyred")) {
                                b2 = -1;
                            } else {
                                b2 = 132;
                            }
                            break;
                        case -782144577:
                            if (!str2.equals("OnePlus5T")) {
                                b2 = -1;
                            } else {
                                b2 = 91;
                            }
                            break;
                        case -575125681:
                            if (!str2.equals("GiONEE_CBL7513")) {
                                b2 = -1;
                            } else {
                                b2 = 51;
                            }
                            break;
                        case -521118391:
                            if (!str2.equals("GIONEE_GBL7360")) {
                                b2 = -1;
                            } else {
                                b2 = 53;
                            }
                            break;
                        case -430914369:
                            if (!str2.equals("Pixi4-7_3G")) {
                                b2 = -1;
                            } else {
                                b2 = 105;
                            }
                            break;
                        case -290434366:
                            if (!str2.equals("taido_row")) {
                                b2 = -1;
                            } else {
                                b2 = 121;
                            }
                            break;
                        case -282781963:
                            if (!str2.equals("BLACK-1X")) {
                                b2 = -1;
                            } else {
                                b2 = 17;
                            }
                            break;
                        case -277133239:
                            if (!str2.equals("Z12_PRO")) {
                                b2 = -1;
                            } else {
                                b2 = 138;
                            }
                            break;
                        case -173639913:
                            if (!str2.equals("ELUGA_A3_Pro")) {
                                b2 = -1;
                            } else {
                                b2 = 31;
                            }
                            break;
                        case -56598463:
                            if (!str2.equals("woods_fn")) {
                                b2 = -1;
                            } else {
                                b2 = 134;
                            }
                            break;
                        case 2126:
                            if (!str2.equals("C1")) {
                                b2 = -1;
                            } else {
                                b2 = 20;
                            }
                            break;
                        case 2564:
                            if (!str2.equals("Q5")) {
                                b2 = -1;
                            } else {
                                b2 = 113;
                            }
                            break;
                        case 2715:
                            if (!str2.equals("V1")) {
                                b2 = -1;
                            } else {
                                b2 = 127;
                            }
                            break;
                        case 2719:
                            if (!str2.equals("V5")) {
                                b2 = -1;
                            } else {
                                b2 = 129;
                            }
                            break;
                        case 3091:
                            if (!str2.equals("b5")) {
                                b2 = -1;
                            } else {
                                b2 = 16;
                            }
                            break;
                        case 3483:
                            if (!str2.equals("mh")) {
                                b2 = -1;
                            } else {
                                b2 = 84;
                            }
                            break;
                        case 73405:
                            if (!str2.equals("JGZ")) {
                                b2 = -1;
                            } else {
                                b2 = 73;
                            }
                            break;
                        case 75537:
                            if (!str2.equals("M04")) {
                                b2 = -1;
                            } else {
                                b2 = 79;
                            }
                            break;
                        case 75739:
                            if (!str2.equals("M5c")) {
                                b2 = -1;
                            } else {
                                b2 = 80;
                            }
                            break;
                        case 76779:
                            if (!str2.equals("MX6")) {
                                b2 = -1;
                            } else {
                                b2 = 86;
                            }
                            break;
                        case 78669:
                            if (!str2.equals("P85")) {
                                b2 = -1;
                            } else {
                                b2 = 94;
                            }
                            break;
                        case 79305:
                            if (!str2.equals("PLE")) {
                                b2 = -1;
                            } else {
                                b2 = 107;
                            }
                            break;
                        case 80618:
                            if (!str2.equals("QX1")) {
                                b2 = -1;
                            } else {
                                b2 = 115;
                            }
                            break;
                        case 88274:
                            if (!str2.equals("Z80")) {
                                b2 = -1;
                            } else {
                                b2 = 139;
                            }
                            break;
                        case 98846:
                            if (!str2.equals("cv1")) {
                                b2 = -1;
                            } else {
                                b2 = 26;
                            }
                            break;
                        case 98848:
                            if (!str2.equals("cv3")) {
                                b2 = -1;
                            } else {
                                b2 = 27;
                            }
                            break;
                        case 99329:
                            if (!str2.equals("deb")) {
                                b2 = -1;
                            } else {
                                b2 = 28;
                            }
                            break;
                        case 101481:
                            if (!str2.equals("flo")) {
                                b2 = -1;
                            } else {
                                b2 = 49;
                            }
                            break;
                        case 1513190:
                            if (!str2.equals("1601")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 1514184:
                            if (!str2.equals("1713")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 1514185:
                            if (!str2.equals("1714")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 2133089:
                            if (!str2.equals("F01H")) {
                                b2 = -1;
                            } else {
                                b2 = 36;
                            }
                            break;
                        case 2133091:
                            if (!str2.equals("F01J")) {
                                b2 = -1;
                            } else {
                                b2 = 37;
                            }
                            break;
                        case 2133120:
                            if (!str2.equals("F02H")) {
                                b2 = -1;
                            } else {
                                b2 = 38;
                            }
                            break;
                        case 2133151:
                            if (!str2.equals("F03H")) {
                                b2 = -1;
                            } else {
                                b2 = 39;
                            }
                            break;
                        case 2133182:
                            if (!str2.equals("F04H")) {
                                b2 = -1;
                            } else {
                                b2 = 40;
                            }
                            break;
                        case 2133184:
                            if (!str2.equals("F04J")) {
                                b2 = -1;
                            } else {
                                b2 = 41;
                            }
                            break;
                        case 2436959:
                            if (!str2.equals("P681")) {
                                b2 = -1;
                            } else {
                                b2 = 93;
                            }
                            break;
                        case 2463773:
                            if (!str2.equals("Q350")) {
                                b2 = -1;
                            } else {
                                b2 = 109;
                            }
                            break;
                        case 2464648:
                            if (!str2.equals("Q427")) {
                                b2 = -1;
                            } else {
                                b2 = 111;
                            }
                            break;
                        case 2689555:
                            if (!str2.equals("XE2X")) {
                                b2 = -1;
                            } else {
                                b2 = 136;
                            }
                            break;
                        case 3154429:
                            if (!str2.equals("fugu")) {
                                b2 = -1;
                            } else {
                                b2 = 50;
                            }
                            break;
                        case 3284551:
                            if (!str2.equals("kate")) {
                                b2 = -1;
                            } else {
                                b2 = 75;
                            }
                            break;
                        case 3351335:
                            if (!str2.equals("mido")) {
                                b2 = -1;
                            } else {
                                b2 = 85;
                            }
                            break;
                        case 3386211:
                            if (!str2.equals("p212")) {
                                b2 = -1;
                            } else {
                                b2 = 92;
                            }
                            break;
                        case 41325051:
                            if (!str2.equals("MEIZU_M5")) {
                                b2 = -1;
                            } else {
                                b2 = 83;
                            }
                            break;
                        case 51349633:
                            if (!str2.equals("601LV")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case 51350594:
                            if (!str2.equals("602LV")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 55178625:
                            if (!str2.equals("Aura_Note_2")) {
                                b2 = -1;
                            } else {
                                b2 = 15;
                            }
                            break;
                        case 61542055:
                            if (!str2.equals("A1601")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case 65355429:
                            if (!str2.equals("E5643")) {
                                b2 = -1;
                            } else {
                                b2 = 30;
                            }
                            break;
                        case 66214468:
                            if (!str2.equals("F3111")) {
                                b2 = -1;
                            } else {
                                b2 = 42;
                            }
                            break;
                        case 66214470:
                            if (!str2.equals("F3113")) {
                                b2 = -1;
                            } else {
                                b2 = 43;
                            }
                            break;
                        case 66214473:
                            if (!str2.equals("F3116")) {
                                b2 = -1;
                            } else {
                                b2 = 44;
                            }
                            break;
                        case 66215429:
                            if (!str2.equals("F3211")) {
                                b2 = -1;
                            } else {
                                b2 = 45;
                            }
                            break;
                        case 66215431:
                            if (!str2.equals("F3213")) {
                                b2 = -1;
                            } else {
                                b2 = 46;
                            }
                            break;
                        case 66215433:
                            if (!str2.equals("F3215")) {
                                b2 = -1;
                            } else {
                                b2 = 47;
                            }
                            break;
                        case 66216390:
                            if (!str2.equals("F3311")) {
                                b2 = -1;
                            } else {
                                b2 = 48;
                            }
                            break;
                        case 76402249:
                            if (!str2.equals("PRO7S")) {
                                b2 = -1;
                            } else {
                                b2 = 108;
                            }
                            break;
                        case 76404105:
                            if (!str2.equals("Q4260")) {
                                b2 = -1;
                            } else {
                                b2 = 110;
                            }
                            break;
                        case 76404911:
                            if (!str2.equals("Q4310")) {
                                b2 = -1;
                            } else {
                                b2 = 112;
                            }
                            break;
                        case 80963634:
                            if (!str2.equals("V23GB")) {
                                b2 = -1;
                            } else {
                                b2 = 128;
                            }
                            break;
                        case 82882791:
                            if (!str2.equals("X3_HK")) {
                                b2 = -1;
                            } else {
                                b2 = 135;
                            }
                            break;
                        case 98715550:
                            if (!str2.equals("i9031")) {
                                b2 = -1;
                            } else {
                                b2 = 67;
                            }
                            break;
                        case 101370885:
                            if (!str2.equals("l5460")) {
                                b2 = -1;
                            } else {
                                b2 = 76;
                            }
                            break;
                        case 102844228:
                            if (!str2.equals("le_x6")) {
                                b2 = -1;
                            } else {
                                b2 = 77;
                            }
                            break;
                        case 165221241:
                            if (!str2.equals("A2016a40")) {
                                b2 = -1;
                            } else {
                                b2 = 8;
                            }
                            break;
                        case 182191441:
                            if (!str2.equals("CPY83_I00")) {
                                b2 = -1;
                            } else {
                                b2 = 25;
                            }
                            break;
                        case 245388979:
                            if (!str2.equals("marino_f")) {
                                b2 = -1;
                            } else {
                                b2 = 82;
                            }
                            break;
                        case 287431619:
                            if (!str2.equals("griffin")) {
                                b2 = -1;
                            } else {
                                b2 = 60;
                            }
                            break;
                        case 307593612:
                            if (!str2.equals("A7010a48")) {
                                b2 = -1;
                            } else {
                                b2 = 11;
                            }
                            break;
                        case 308517133:
                            if (!str2.equals("A7020a48")) {
                                b2 = -1;
                            } else {
                                b2 = 12;
                            }
                            break;
                        case 316215098:
                            if (!str2.equals("TB3-730F")) {
                                b2 = -1;
                            } else {
                                b2 = 122;
                            }
                            break;
                        case 316215116:
                            if (!str2.equals("TB3-730X")) {
                                b2 = -1;
                            } else {
                                b2 = 123;
                            }
                            break;
                        case 316246811:
                            if (!str2.equals("TB3-850F")) {
                                b2 = -1;
                            } else {
                                b2 = 124;
                            }
                            break;
                        case 316246818:
                            if (!str2.equals("TB3-850M")) {
                                b2 = -1;
                            } else {
                                b2 = 125;
                            }
                            break;
                        case 407160593:
                            if (!str2.equals("Pixi5-10_4G")) {
                                b2 = -1;
                            } else {
                                b2 = 106;
                            }
                            break;
                        case 507412548:
                            if (!str2.equals("QM16XE_U")) {
                                b2 = -1;
                            } else {
                                b2 = 114;
                            }
                            break;
                        case 793982701:
                            if (!str2.equals("GIONEE_WBL5708")) {
                                b2 = -1;
                            } else {
                                b2 = 57;
                            }
                            break;
                        case 794038622:
                            if (!str2.equals("GIONEE_WBL7365")) {
                                b2 = -1;
                            } else {
                                b2 = 58;
                            }
                            break;
                        case 794040393:
                            if (!str2.equals("GIONEE_WBL7519")) {
                                b2 = -1;
                            } else {
                                b2 = 59;
                            }
                            break;
                        case 835649806:
                            if (!str2.equals("manning")) {
                                b2 = -1;
                            } else {
                                b2 = 81;
                            }
                            break;
                        case 917340916:
                            if (!str2.equals("A7000plus")) {
                                b2 = -1;
                            } else {
                                b2 = 10;
                            }
                            break;
                        case 958008161:
                            if (!str2.equals("j2xlteins")) {
                                b2 = -1;
                            } else {
                                b2 = 72;
                            }
                            break;
                        case 1060579533:
                            if (!str2.equals("panell_d")) {
                                b2 = -1;
                            } else {
                                b2 = 96;
                            }
                            break;
                        case 1150207623:
                            if (!str2.equals("LS-5017")) {
                                b2 = -1;
                            } else {
                                b2 = 78;
                            }
                            break;
                        case 1176899427:
                            if (!str2.equals("itel_S41")) {
                                b2 = -1;
                            } else {
                                b2 = 71;
                            }
                            break;
                        case 1280332038:
                            if (!str2.equals("hwALE-H")) {
                                b2 = -1;
                            } else {
                                b2 = 62;
                            }
                            break;
                        case 1306947716:
                            if (!str2.equals("EverStar_S")) {
                                b2 = -1;
                            } else {
                                b2 = 35;
                            }
                            break;
                        case 1349174697:
                            if (!str2.equals("htc_e56ml_dtul")) {
                                b2 = -1;
                            } else {
                                b2 = 61;
                            }
                            break;
                        case 1522194893:
                            if (!str2.equals("woods_f")) {
                                b2 = -1;
                            } else {
                                b2 = 133;
                            }
                            break;
                        case 1691543273:
                            if (!str2.equals("CPH1609")) {
                                b2 = -1;
                            } else {
                                b2 = 23;
                            }
                            break;
                        case 1691544261:
                            if (!str2.equals("CPH1715")) {
                                b2 = -1;
                            } else {
                                b2 = 24;
                            }
                            break;
                        case 1709443163:
                            if (!str2.equals("iball8735_9806")) {
                                b2 = -1;
                            } else {
                                b2 = 68;
                            }
                            break;
                        case 1865889110:
                            if (!str2.equals("santoni")) {
                                b2 = -1;
                            } else {
                                b2 = 117;
                            }
                            break;
                        case 1906253259:
                            if (!str2.equals("PB2-670M")) {
                                b2 = -1;
                            } else {
                                b2 = 100;
                            }
                            break;
                        case 1977196784:
                            if (!str2.equals("Infinix-X572")) {
                                b2 = -1;
                            } else {
                                b2 = 69;
                            }
                            break;
                        case 2006372676:
                            if (!str2.equals("BRAVIA_ATV3_4K")) {
                                b2 = -1;
                            } else {
                                b2 = 19;
                            }
                            break;
                        case 2019281702:
                            if (!str2.equals("DM-01K")) {
                                b2 = -1;
                            } else {
                                b2 = 29;
                            }
                            break;
                        case 2029784656:
                            if (!str2.equals("HWBLN-H")) {
                                b2 = -1;
                            } else {
                                b2 = 63;
                            }
                            break;
                        case 2030379515:
                            if (!str2.equals("HWCAM-H")) {
                                b2 = -1;
                            } else {
                                b2 = 64;
                            }
                            break;
                        case 2033393791:
                            if (!str2.equals("ASUS_X00AD_2")) {
                                b2 = -1;
                            } else {
                                b2 = 14;
                            }
                            break;
                        case 2047190025:
                            if (!str2.equals("ELUGA_Note")) {
                                b2 = -1;
                            } else {
                                b2 = 32;
                            }
                            break;
                        case 2047252157:
                            if (!str2.equals("ELUGA_Prim")) {
                                b2 = -1;
                            } else {
                                b2 = 33;
                            }
                            break;
                        case 2048319463:
                            if (!str2.equals("HWVNS-H")) {
                                b2 = -1;
                            } else {
                                b2 = 65;
                            }
                            break;
                        case 2048855701:
                            if (!str2.equals("HWWAS-H")) {
                                b2 = -1;
                            } else {
                                b2 = 66;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            str3 = zzel.zzd;
                            iHashCode = str3.hashCode();
                            if (iHashCode != -594534941) {
                                if (iHashCode != 2006354) {
                                    if (iHashCode == 2006367) {
                                        b3 = 1;
                                    }
                                } else if (str3.equals("AFTA")) {
                                    b3 = 0;
                                }
                            } else if (str3.equals("JSN-L21")) {
                                b3 = 2;
                            }
                            if (b3 != 0) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            z = true;
                            break;
                    }
                }
                C1 = z;
                B1 = true;
            }
        }
        return C1;
    }

    public static zzfuv T(zzaf zzafVar, boolean z, boolean z2) {
        String str = zzafVar.zzm;
        if (str == null) {
            return zzfuv.zzo();
        }
        List listZzf = zzrd.zzf(str, z, z2);
        String strZze = zzrd.zze(zzafVar);
        if (strZze == null) {
            return zzfuv.zzm(listZzf);
        }
        List listZzf2 = zzrd.zzf(strZze, z, z2);
        zzfus zzfusVarZzi = zzfuv.zzi();
        zzfusVarZzi.zzf(listZzf);
        zzfusVarZzi.zzf(listZzf2);
        return zzfusVarZzi.zzg();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    public static int zzT(zzql zzqlVar, zzaf zzafVar) {
        int iZze;
        int iIntValue;
        int i = zzafVar.zzr;
        int i2 = zzafVar.zzs;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = zzafVar.zzm;
        byte b = 1;
        int i3 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair pairZzb = zzrd.zzb(zzafVar);
            str = (pairZzb == null || !((iIntValue = ((Integer) pairZzb.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (!str.equals("video/3gpp")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1662735862:
                if (!str.equals("video/av01")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1662541442:
                if (!str.equals("video/hevc")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1187890754:
                if (!str.equals("video/mp4v-es")) {
                    b = -1;
                }
                break;
            case 1331836730:
                if (!str.equals("video/avc")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1599127256:
                if (!str.equals("video/x-vnd.on2.vp8")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1599127257:
                if (!str.equals("video/x-vnd.on2.vp9")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 3:
            case 4:
                iZze = i * i2;
                break;
            case 2:
                String str2 = zzel.zzd;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(zzel.zzc) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && zzqlVar.zzf)))) {
                    return -1;
                }
                iZze = zzel.zze(i2, 16) * zzel.zze(i, 16) * 256;
                break;
            case 5:
            case 6:
                iZze = i * i2;
                i3 = 4;
                break;
            default:
                return -1;
        }
        return (iZze * 3) / (i3 + i3);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void A() {
        this.g1 = false;
        int i = zzel.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void B(zzgg zzggVar) {
        this.o1++;
        int i = zzel.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a1, code lost:
    
        if (r15 > 100000) goto L52;
     */
    @Override // com.google.android.gms.internal.ads.zzqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(long r25, long r27, com.google.android.gms.internal.ads.zzqj r29, java.nio.ByteBuffer r30, int r31, int r32, int r33, long r34, boolean r36, boolean r37, com.google.android.gms.internal.ads.zzaf r38) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxd.D(long, long, com.google.android.gms.internal.ads.zzqj, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.gms.internal.ads.zzaf):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzqk F(IllegalStateException illegalStateException, zzql zzqlVar) {
        return new zzxb(illegalStateException, zzqlVar, this.c1);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    @TargetApi(29)
    public final void G(zzgg zzggVar) {
        if (this.b1) {
            ByteBuffer byteBuffer = zzggVar.zze;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzqj zzqjVar = this.a0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzqjVar.zzp(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void I(long j) {
        super.I(j);
        this.o1--;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void K() {
        super.K();
        this.o1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean N(zzql zzqlVar) {
        return this.c1 != null || V(zzqlVar);
    }

    public final void R(long j) {
        zzgq zzgqVar = this.O0;
        zzgqVar.zzk += j;
        zzgqVar.zzl++;
        this.r1 += j;
        this.s1++;
    }

    public final void U() {
        int i = this.t1;
        if (i == -1) {
            if (this.u1 == -1) {
                return;
            } else {
                i = -1;
            }
        }
        zzda zzdaVar = this.x1;
        if (zzdaVar != null && zzdaVar.zzc == i && zzdaVar.zzd == this.u1 && zzdaVar.zze == this.v1 && zzdaVar.zzf == this.w1) {
            return;
        }
        zzda zzdaVar2 = new zzda(i, this.u1, this.v1, this.w1);
        this.x1 = zzdaVar2;
        this.X0.zzt(zzdaVar2);
    }

    public final boolean V(zzql zzqlVar) {
        if (zzel.zza < 23 || S(zzqlVar.zza)) {
            return false;
        }
        return !zzqlVar.zzf || zzxg.zzb(this.V0);
    }

    public final void W(zzqj zzqjVar, int i) {
        U();
        int i2 = zzel.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqjVar.zzn(i, true);
        Trace.endSection();
        this.q1 = SystemClock.elapsedRealtime() * 1000;
        this.O0.zze++;
        this.n1 = 0;
        this.i1 = true;
        if (this.g1) {
            return;
        }
        this.g1 = true;
        this.X0.zzq(this.c1);
        this.e1 = true;
    }

    public final void X(zzqj zzqjVar, int i, long j) {
        U();
        int i2 = zzel.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqjVar.zzm(i, j);
        Trace.endSection();
        this.q1 = SystemClock.elapsedRealtime() * 1000;
        this.O0.zze++;
        this.n1 = 0;
        this.i1 = true;
        if (this.g1) {
            return;
        }
        this.g1 = true;
        this.X0.zzq(this.c1);
        this.e1 = true;
    }

    public final void Y(zzqj zzqjVar, int i) {
        int i2 = zzel.zza;
        Trace.beginSection("skipVideoBuffer");
        zzqjVar.zzn(i, false);
        Trace.endSection();
        this.O0.zzf++;
    }

    public final void Z(int i, int i2) {
        zzgq zzgqVar = this.O0;
        zzgqVar.zzh += i;
        int i3 = i + i2;
        zzgqVar.zzg += i3;
        this.m1 += i3;
        int i4 = this.n1 + i3;
        this.n1 = i4;
        zzgqVar.zzi = Math.max(i4, zzgqVar.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzgp
    public final void c() {
        zzxz zzxzVar = this.X0;
        this.x1 = null;
        this.g1 = false;
        int i = zzel.zza;
        this.e1 = false;
        try {
            super.c();
        } finally {
            zzxzVar.zzc(this.O0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzgp
    public final void d(boolean z, boolean z2) {
        super.d(z, z2);
        this.y.getClass();
        this.X0.zze(this.O0);
        this.h1 = z2;
        this.i1 = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzgp
    public final void e(long j, boolean z) {
        super.e(j, z);
        this.g1 = false;
        int i = zzel.zza;
        this.W0.zzf();
        this.p1 = -9223372036854775807L;
        this.j1 = -9223372036854775807L;
        this.n1 = 0;
        this.k1 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzgp
    @TargetApi(17)
    public final void f() {
        zzxg zzxgVar;
        try {
            super.f();
            zzxgVar = this.d1;
            if (zzxgVar != null) {
                if (this.c1 == zzxgVar) {
                    this.c1 = null;
                }
            }
        } finally {
            if (this.d1 != null) {
                Surface surface = this.c1;
                zzxgVar = this.d1;
                if (surface == zzxgVar) {
                    this.c1 = null;
                }
                zzxgVar.release();
                this.d1 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public final void g() {
        this.m1 = 0;
        this.l1 = SystemClock.elapsedRealtime();
        this.q1 = SystemClock.elapsedRealtime() * 1000;
        this.r1 = 0L;
        this.s1 = 0;
        this.W0.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public final void h() {
        this.k1 = -9223372036854775807L;
        int i = this.m1;
        zzxz zzxzVar = this.X0;
        if (i > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzxzVar.zzd(this.m1, jElapsedRealtime - this.l1);
            this.m1 = 0;
            this.l1 = jElapsedRealtime;
        }
        int i2 = this.s1;
        if (i2 != 0) {
            zzxzVar.zzr(this.r1, i2);
            this.r1 = 0L;
            this.s1 = 0;
        }
        this.W0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final float j(float f, zzaf[] zzafVarArr) {
        float fMax = -1.0f;
        for (zzaf zzafVar : zzafVarArr) {
            float f2 = zzafVar.zzt;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final int k(zzqq zzqqVar, zzaf zzafVar) {
        boolean z;
        if (!zzbt.zzh(zzafVar.zzm)) {
            return 128;
        }
        int i = 0;
        boolean z2 = zzafVar.zzp != null;
        zzfuv zzfuvVarT = T(zzafVar, z2, false);
        if (z2 && zzfuvVarT.isEmpty()) {
            zzfuvVarT = T(zzafVar, false, false);
        }
        if (zzfuvVarT.isEmpty()) {
            return 129;
        }
        if (!(zzafVar.zzF == 0)) {
            return 130;
        }
        zzql zzqlVar = (zzql) zzfuvVarT.get(0);
        boolean zZzd = zzqlVar.zzd(zzafVar);
        if (!zZzd) {
            int i2 = 1;
            while (true) {
                if (i2 >= zzfuvVarT.size()) {
                    z = true;
                    break;
                }
                zzql zzqlVar2 = (zzql) zzfuvVarT.get(i2);
                if (zzqlVar2.zzd(zzafVar)) {
                    zzqlVar = zzqlVar2;
                    z = false;
                    zZzd = true;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = true != zZzd ? 3 : 4;
        int i4 = true != zzqlVar.zze(zzafVar) ? 8 : 16;
        int i5 = true != zzqlVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (zZzd) {
            zzfuv zzfuvVarT2 = T(zzafVar, z2, true);
            if (!zzfuvVarT2.isEmpty()) {
                zzql zzqlVar3 = (zzql) zzrd.zzg(zzfuvVarT2, zzafVar).get(0);
                if (zzqlVar3.zzd(zzafVar) && zzqlVar3.zze(zzafVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzgr l(zzql zzqlVar, zzaf zzafVar, zzaf zzafVar2) {
        int i;
        int i2;
        zzgr zzgrVarZzb = zzqlVar.zzb(zzafVar, zzafVar2);
        int i3 = zzgrVarZzb.zze;
        int i4 = zzafVar2.zzr;
        zzxc zzxcVar = this.Z0;
        if (i4 > zzxcVar.zza || zzafVar2.zzs > zzxcVar.zzb) {
            i3 |= 256;
        }
        if (Q(zzqlVar, zzafVar2) > this.Z0.zzc) {
            i3 |= 64;
        }
        String str = zzqlVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzgrVarZzb.zzd;
            i2 = 0;
        }
        return new zzgr(str, zzafVar, zzafVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzgr m(zzje zzjeVar) {
        zzgr zzgrVarM = super.m(zzjeVar);
        this.X0.zzf(zzjeVar.zza, zzgrVarM);
        return zzgrVarM;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0141  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0141, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzqo
    @TargetApi(17)
    public final zzqh p(zzql zzqlVar, zzaf zzafVar, float f) {
        String str;
        zzxc zzxcVar;
        int i;
        String str2;
        Point point;
        Pair pairZzb;
        int iZzT;
        zzxg zzxgVar = this.d1;
        if (zzxgVar != null && zzxgVar.zza != zzqlVar.zzf) {
            if (this.c1 == zzxgVar) {
                this.c1 = null;
            }
            zzxgVar.release();
            this.d1 = null;
        }
        String str3 = zzqlVar.zzc;
        zzaf[] zzafVarArr = this.D;
        zzafVarArr.getClass();
        int iMax = zzafVar.zzr;
        int iMax2 = zzafVar.zzs;
        int iQ = Q(zzqlVar, zzafVar);
        int length = zzafVarArr.length;
        if (length == 1) {
            if (iQ != -1 && (iZzT = zzT(zzqlVar, zzafVar)) != -1) {
                iQ = Math.min((int) (iQ * 1.5f), iZzT);
            }
            zzxcVar = new zzxc(iMax, iMax2, iQ);
            str = str3;
        } else {
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                zzaf zzafVarZzY = zzafVarArr[i2];
                if (zzafVar.zzy != null && zzafVarZzY.zzy == null) {
                    zzad zzadVarZzb = zzafVarZzY.zzb();
                    zzadVarZzb.zzy(zzafVar.zzy);
                    zzafVarZzY = zzadVarZzb.zzY();
                }
                if (zzqlVar.zzb(zzafVar, zzafVarZzY).zzd != 0) {
                    int i3 = zzafVarZzY.zzr;
                    z |= i3 == -1 || zzafVarZzY.zzs == -1;
                    iMax = Math.max(iMax, i3);
                    iMax2 = Math.max(iMax2, zzafVarZzY.zzs);
                    iQ = Math.max(iQ, Q(zzqlVar, zzafVarZzY));
                }
            }
            if (z) {
                String str4 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i4 = zzafVar.zzs;
                int i5 = zzafVar.zzr;
                int i6 = i4 > i5 ? i4 : i5;
                int i7 = i4 <= i5 ? i4 : i5;
                float f2 = i7 / i6;
                int[] iArr = A1;
                str = str3;
                int i8 = 0;
                while (true) {
                    if (i8 < 9) {
                        int i9 = iArr[i8];
                        int[] iArr2 = iArr;
                        int i10 = (int) (i9 * f2);
                        if (i9 > i6 && i10 > i7) {
                            int i11 = i6;
                            int i12 = i7;
                            if (zzel.zza >= 21) {
                                int i13 = i4 <= i5 ? i9 : i10;
                                if (i4 <= i5) {
                                    i9 = i10;
                                }
                                point = zzqlVar.zza(i13, i9);
                                i = iQ;
                                str2 = str4;
                                if (!zzqlVar.zzf(point.x, point.y, zzafVar.zzt)) {
                                    i8++;
                                    iArr = iArr2;
                                    i6 = i11;
                                    i7 = i12;
                                    iQ = i;
                                    str4 = str2;
                                }
                            } else {
                                i = iQ;
                                str2 = str4;
                                try {
                                    int iZze = zzel.zze(i9, 16) * 16;
                                    int iZze2 = zzel.zze(i10, 16) * 16;
                                    if (iZze * iZze2 <= zzrd.zza()) {
                                        int i14 = i4 <= i5 ? iZze : iZze2;
                                        if (i4 <= i5) {
                                            iZze = iZze2;
                                        }
                                        point = new Point(i14, iZze);
                                    } else {
                                        i8++;
                                        iArr = iArr2;
                                        i6 = i11;
                                        i7 = i12;
                                        iQ = i;
                                        str4 = str2;
                                    }
                                } catch (zzqx unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            zzad zzadVarZzb2 = zzafVar.zzb();
                            zzadVarZzb2.zzX(iMax);
                            zzadVarZzb2.zzF(iMax2);
                            iQ = Math.max(i, zzT(zzqlVar, zzadVarZzb2.zzY()));
                            Log.w(str2, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        } else {
                            iQ = i;
                        }
                    }
                    i = iQ;
                    str2 = str4;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        zzad zzadVarZzb3 = zzafVar.zzb();
                        zzadVarZzb3.zzX(iMax);
                        zzadVarZzb3.zzF(iMax2);
                        iQ = Math.max(i, zzT(zzqlVar, zzadVarZzb3.zzY()));
                        Log.w(str2, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    } else {
                        iQ = i;
                    }
                }
            } else {
                str = str3;
            }
            zzxcVar = new zzxc(iMax, iMax2, iQ);
        }
        this.Z0 = zzxcVar;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzafVar.zzr);
        mediaFormat.setInteger("height", zzafVar.zzs);
        zzdw.zzb(mediaFormat, zzafVar.zzo);
        float f3 = zzafVar.zzt;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        zzdw.zza(mediaFormat, "rotation-degrees", zzafVar.zzu);
        zzq zzqVar = zzafVar.zzy;
        if (zzqVar != null) {
            zzdw.zza(mediaFormat, "color-transfer", zzqVar.zzd);
            zzdw.zza(mediaFormat, "color-standard", zzqVar.zzb);
            zzdw.zza(mediaFormat, "color-range", zzqVar.zzc);
            byte[] bArr = zzqVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzafVar.zzm) && (pairZzb = zzrd.zzb(zzafVar)) != null) {
            zzdw.zza(mediaFormat, "profile", ((Integer) pairZzb.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzxcVar.zza);
        mediaFormat.setInteger("max-height", zzxcVar.zzb);
        zzdw.zza(mediaFormat, "max-input-size", zzxcVar.zzc);
        if (zzel.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.Y0) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.c1 == null) {
            if (!V(zzqlVar)) {
                throw new IllegalStateException();
            }
            if (this.d1 == null) {
                this.d1 = zzxg.zza(this.V0, zzqlVar.zzf);
            }
            this.c1 = this.d1;
        }
        return zzqh.zzb(zzqlVar, mediaFormat, zzafVar, this.c1, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final List q(zzqq zzqqVar, zzaf zzafVar) {
        return zzrd.zzg(T(zzafVar, false, false), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void r(Exception exc) {
        zzdu.zza("MediaCodecVideoRenderer", "Video codec error", exc);
        this.X0.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void s(String str, long j, long j2) {
        this.X0.zza(str, j, j2);
        this.a1 = S(str);
        zzql zzqlVar = this.h0;
        zzqlVar.getClass();
        boolean z = false;
        if (zzel.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzqlVar.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzqlVar.zzg()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.b1 = z;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void t(String str) {
        this.X0.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void y(zzaf zzafVar, MediaFormat mediaFormat) {
        zzqj zzqjVar = this.a0;
        if (zzqjVar != null) {
            zzqjVar.zzq(this.f1);
        }
        mediaFormat.getClass();
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.t1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.u1 = integer;
        float f = zzafVar.zzv;
        this.w1 = f;
        if (zzel.zza >= 21) {
            int i = zzafVar.zzu;
            if (i == 90 || i == 270) {
                int i2 = this.t1;
                this.t1 = integer;
                this.u1 = i2;
                this.w1 = 1.0f / f;
            }
        } else {
            this.v1 = zzafVar.zzu;
        }
        this.W0.zzc(zzafVar.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzjy
    public final void zzD(float f, float f2) {
        super.zzD(f, f2);
        this.W0.zze(f);
    }

    @Override // com.google.android.gms.internal.ads.zzjy, com.google.android.gms.internal.ads.zzjz
    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzjy
    public final boolean zzN() {
        zzxg zzxgVar;
        if (super.zzN() && (this.g1 || (((zzxgVar = this.d1) != null && this.c1 == zzxgVar) || this.a0 == null))) {
            this.k1 = -9223372036854775807L;
            return true;
        }
        if (this.k1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.k1) {
            return true;
        }
        this.k1 = -9223372036854775807L;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzxo] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzqj] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.google.android.gms.internal.ads.zzxg] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzju
    public final void zzp(int i, Object obj) {
        ?? Zza;
        Surface surface;
        ?? r1 = this.W0;
        if (i != 1) {
            if (i == 7) {
                this.z1 = (zzxh) obj;
                return;
            }
            if (i == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.y1 != iIntValue) {
                    this.y1 = iIntValue;
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                r1.zzj(((Integer) obj).intValue());
                return;
            } else {
                int iIntValue2 = ((Integer) obj).intValue();
                this.f1 = iIntValue2;
                zzqj zzqjVar = this.a0;
                if (zzqjVar != null) {
                    zzqjVar.zzq(iIntValue2);
                    return;
                }
                return;
            }
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            Zza = 0;
        }
        if (Zza == 0) {
            zzxg zzxgVar = this.d1;
            if (zzxgVar != null) {
                Zza = surface;
                Zza = zzxgVar;
            } else {
                zzql zzqlVar = this.h0;
                if (zzqlVar != null && V(zzqlVar)) {
                    Zza = surface;
                    Zza = zzxg.zza(this.V0, zzqlVar.zzf);
                    this.d1 = Zza;
                }
            }
        }
        Zza = surface;
        Zza = surface;
        Zza = surface;
        Surface surface2 = this.c1;
        zzxz zzxzVar = this.X0;
        if (surface2 == Zza) {
            if (Zza == 0 || Zza == this.d1) {
                return;
            }
            zzda zzdaVar = this.x1;
            if (zzdaVar != null) {
                zzxzVar.zzt(zzdaVar);
            }
            if (this.e1) {
                zzxzVar.zzq(this.c1);
                return;
            }
            return;
        }
        this.c1 = Zza;
        r1.zzi(Zza);
        this.e1 = false;
        int iZzbe = zzbe();
        ?? r3 = this.a0;
        if (r3 != 0) {
            if (zzel.zza < 23 || Zza == 0 || this.a1) {
                J();
                H();
            } else {
                r3.zzo(Zza);
            }
        }
        if (Zza == 0 || Zza == this.d1) {
            this.x1 = null;
            this.g1 = false;
            int i2 = zzel.zza;
            return;
        }
        zzda zzdaVar2 = this.x1;
        if (zzdaVar2 != null) {
            zzxzVar.zzt(zzdaVar2);
        }
        this.g1 = false;
        int i3 = zzel.zza;
        if (iZzbe == 2) {
            this.k1 = -9223372036854775807L;
        }
    }
}
