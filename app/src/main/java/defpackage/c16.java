package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzasd;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzauq;
import com.google.android.gms.internal.ads.zzaur;
import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzauw;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzave;
import com.google.android.gms.internal.ads.zzavn;
import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbau;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class c16 {
    public final byte[] a = new byte[8];
    public final Stack b = new Stack();
    public final f16 c = new f16();
    public int d;
    public int e;
    public long f;
    public sd6 g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:155:0x02da  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:166:0x0305  */
    /* JADX WARN: Code duplicated, block: B:167:0x0309  */
    /* JADX WARN: Code duplicated, block: B:169:0x0311  */
    /* JADX WARN: Code duplicated, block: B:170:0x0314  */
    /* JADX WARN: Code duplicated, block: B:172:0x031c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0320  */
    /* JADX WARN: Code duplicated, block: B:175:0x0328  */
    /* JADX WARN: Code duplicated, block: B:176:0x032c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0332  */
    /* JADX WARN: Code duplicated, block: B:179:0x0336  */
    /* JADX WARN: Code duplicated, block: B:181:0x033c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0340  */
    /* JADX WARN: Code duplicated, block: B:184:0x0346  */
    /* JADX WARN: Code duplicated, block: B:185:0x0349  */
    /* JADX WARN: Code duplicated, block: B:187:0x0351  */
    /* JADX WARN: Code duplicated, block: B:188:0x0354  */
    /* JADX WARN: Code duplicated, block: B:190:0x035a  */
    /* JADX WARN: Code duplicated, block: B:191:0x035e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0364  */
    /* JADX WARN: Code duplicated, block: B:194:0x0368  */
    /* JADX WARN: Code duplicated, block: B:196:0x036e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0372  */
    /* JADX WARN: Code duplicated, block: B:199:0x0378  */
    /* JADX WARN: Code duplicated, block: B:200:0x037c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0382  */
    /* JADX WARN: Code duplicated, block: B:203:0x0386  */
    /* JADX WARN: Code duplicated, block: B:205:0x038c  */
    /* JADX WARN: Code duplicated, block: B:206:0x038f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0395  */
    /* JADX WARN: Code duplicated, block: B:209:0x0398  */
    /* JADX WARN: Code duplicated, block: B:211:0x039e  */
    /* JADX WARN: Code duplicated, block: B:212:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:214:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:215:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:217:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:220:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:221:0x03be  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:224:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:227:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:230:0x03df  */
    /* JADX WARN: Code duplicated, block: B:232:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:233:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:235:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:236:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:239:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:241:0x0405  */
    /* JADX WARN: Code duplicated, block: B:242:0x0426  */
    /* JADX WARN: Code duplicated, block: B:243:0x042a  */
    /* JADX WARN: Code duplicated, block: B:244:0x0434  */
    /* JADX WARN: Code duplicated, block: B:245:0x0438  */
    /* JADX WARN: Code duplicated, block: B:247:0x0440  */
    /* JADX WARN: Code duplicated, block: B:248:0x0457  */
    /* JADX WARN: Code duplicated, block: B:249:0x045a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0468  */
    /* JADX WARN: Code duplicated, block: B:253:0x0469  */
    /* JADX WARN: Code duplicated, block: B:255:0x046e A[Catch: ArrayIndexOutOfBoundsException -> 0x04bf, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x04bf, blocks: (B:250:0x0461, B:255:0x046e, B:257:0x0481), top: B:605:0x0461 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x0481 A[Catch: ArrayIndexOutOfBoundsException -> 0x04bf, TRY_LEAVE, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x04bf, blocks: (B:250:0x0461, B:255:0x046e, B:257:0x0481), top: B:605:0x0461 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0492  */
    /* JADX WARN: Code duplicated, block: B:265:0x049a  */
    /* JADX WARN: Code duplicated, block: B:266:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:268:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:272:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:273:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:274:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:275:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:276:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:277:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:278:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:279:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:281:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:282:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:284:0x0542  */
    /* JADX WARN: Code duplicated, block: B:287:0x054c  */
    /* JADX WARN: Code duplicated, block: B:290:0x0553 A[Catch: ArrayIndexOutOfBoundsException -> 0x05b9, LOOP:7: B:288:0x054e->B:290:0x0553, LOOP_END, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x05b9, blocks: (B:285:0x0547, B:288:0x054e, B:290:0x0553, B:291:0x0558, B:292:0x055c, B:294:0x0561, B:295:0x0566, B:297:0x056d, B:299:0x0579, B:301:0x057f, B:304:0x05a1, B:305:0x05a6, B:306:0x05a7, B:307:0x05ac, B:308:0x05ad, B:309:0x05b2, B:310:0x05b3, B:311:0x05b8), top: B:604:0x0547 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x0561 A[Catch: ArrayIndexOutOfBoundsException -> 0x05b9, LOOP:8: B:292:0x055c->B:294:0x0561, LOOP_END, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x05b9, blocks: (B:285:0x0547, B:288:0x054e, B:290:0x0553, B:291:0x0558, B:292:0x055c, B:294:0x0561, B:295:0x0566, B:297:0x056d, B:299:0x0579, B:301:0x057f, B:304:0x05a1, B:305:0x05a6, B:306:0x05a7, B:307:0x05ac, B:308:0x05ad, B:309:0x05b2, B:310:0x05b3, B:311:0x05b8), top: B:604:0x0547 }] */
    /* JADX WARN: Code duplicated, block: B:297:0x056d A[Catch: ArrayIndexOutOfBoundsException -> 0x05b9, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x05b9, blocks: (B:285:0x0547, B:288:0x054e, B:290:0x0553, B:291:0x0558, B:292:0x055c, B:294:0x0561, B:295:0x0566, B:297:0x056d, B:299:0x0579, B:301:0x057f, B:304:0x05a1, B:305:0x05a6, B:306:0x05a7, B:307:0x05ac, B:308:0x05ad, B:309:0x05b2, B:310:0x05b3, B:311:0x05b8), top: B:604:0x0547 }] */
    /* JADX WARN: Code duplicated, block: B:299:0x0579 A[Catch: ArrayIndexOutOfBoundsException -> 0x05b9, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x05b9, blocks: (B:285:0x0547, B:288:0x054e, B:290:0x0553, B:291:0x0558, B:292:0x055c, B:294:0x0561, B:295:0x0566, B:297:0x056d, B:299:0x0579, B:301:0x057f, B:304:0x05a1, B:305:0x05a6, B:306:0x05a7, B:307:0x05ac, B:308:0x05ad, B:309:0x05b2, B:310:0x05b3, B:311:0x05b8), top: B:604:0x0547 }] */
    /* JADX WARN: Code duplicated, block: B:301:0x057f A[Catch: ArrayIndexOutOfBoundsException -> 0x05b9, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x05b9, blocks: (B:285:0x0547, B:288:0x054e, B:290:0x0553, B:291:0x0558, B:292:0x055c, B:294:0x0561, B:295:0x0566, B:297:0x056d, B:299:0x0579, B:301:0x057f, B:304:0x05a1, B:305:0x05a6, B:306:0x05a7, B:307:0x05ac, B:308:0x05ad, B:309:0x05b2, B:310:0x05b3, B:311:0x05b8), top: B:604:0x0547 }] */
    /* JADX WARN: Code duplicated, block: B:304:0x05a1 A[Catch: ArrayIndexOutOfBoundsException -> 0x05b9, TRY_ENTER, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x05b9, blocks: (B:285:0x0547, B:288:0x054e, B:290:0x0553, B:291:0x0558, B:292:0x055c, B:294:0x0561, B:295:0x0566, B:297:0x056d, B:299:0x0579, B:301:0x057f, B:304:0x05a1, B:305:0x05a6, B:306:0x05a7, B:307:0x05ac, B:308:0x05ad, B:309:0x05b2, B:310:0x05b3, B:311:0x05b8), top: B:604:0x0547 }] */
    /* JADX WARN: Code duplicated, block: B:306:0x05a7 A[Catch: ArrayIndexOutOfBoundsException -> 0x05b9, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x05b9, blocks: (B:285:0x0547, B:288:0x054e, B:290:0x0553, B:291:0x0558, B:292:0x055c, B:294:0x0561, B:295:0x0566, B:297:0x056d, B:299:0x0579, B:301:0x057f, B:304:0x05a1, B:305:0x05a6, B:306:0x05a7, B:307:0x05ac, B:308:0x05ad, B:309:0x05b2, B:310:0x05b3, B:311:0x05b8), top: B:604:0x0547 }] */
    /* JADX WARN: Code duplicated, block: B:308:0x05ad A[Catch: ArrayIndexOutOfBoundsException -> 0x05b9, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x05b9, blocks: (B:285:0x0547, B:288:0x054e, B:290:0x0553, B:291:0x0558, B:292:0x055c, B:294:0x0561, B:295:0x0566, B:297:0x056d, B:299:0x0579, B:301:0x057f, B:304:0x05a1, B:305:0x05a6, B:306:0x05a7, B:307:0x05ac, B:308:0x05ad, B:309:0x05b2, B:310:0x05b3, B:311:0x05b8), top: B:604:0x0547 }] */
    /* JADX WARN: Code duplicated, block: B:310:0x05b3 A[Catch: ArrayIndexOutOfBoundsException -> 0x05b9, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x05b9, blocks: (B:285:0x0547, B:288:0x054e, B:290:0x0553, B:291:0x0558, B:292:0x055c, B:294:0x0561, B:295:0x0566, B:297:0x056d, B:299:0x0579, B:301:0x057f, B:304:0x05a1, B:305:0x05a6, B:306:0x05a7, B:307:0x05ac, B:308:0x05ad, B:309:0x05b2, B:310:0x05b3, B:311:0x05b8), top: B:604:0x0547 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:317:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:318:0x05d8 A[Catch: ArrayIndexOutOfBoundsException -> 0x061c, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x061c, blocks: (B:315:0x05c8, B:318:0x05d8, B:319:0x05e0, B:321:0x05e5, B:323:0x05e9, B:325:0x05ef, B:327:0x05f6, B:329:0x05fe, B:334:0x0614, B:335:0x061b), top: B:607:0x05c8 }] */
    /* JADX WARN: Code duplicated, block: B:321:0x05e5 A[Catch: ArrayIndexOutOfBoundsException -> 0x061c, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x061c, blocks: (B:315:0x05c8, B:318:0x05d8, B:319:0x05e0, B:321:0x05e5, B:323:0x05e9, B:325:0x05ef, B:327:0x05f6, B:329:0x05fe, B:334:0x0614, B:335:0x061b), top: B:607:0x05c8 }] */
    /* JADX WARN: Code duplicated, block: B:323:0x05e9 A[Catch: ArrayIndexOutOfBoundsException -> 0x061c, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x061c, blocks: (B:315:0x05c8, B:318:0x05d8, B:319:0x05e0, B:321:0x05e5, B:323:0x05e9, B:325:0x05ef, B:327:0x05f6, B:329:0x05fe, B:334:0x0614, B:335:0x061b), top: B:607:0x05c8 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x0608  */
    /* JADX WARN: Code duplicated, block: B:332:0x060b  */
    /* JADX WARN: Code duplicated, block: B:338:0x0624  */
    /* JADX WARN: Code duplicated, block: B:339:0x0638  */
    /* JADX WARN: Code duplicated, block: B:341:0x064e  */
    /* JADX WARN: Code duplicated, block: B:343:0x0652  */
    /* JADX WARN: Code duplicated, block: B:344:0x0654  */
    /* JADX WARN: Code duplicated, block: B:347:0x065c  */
    /* JADX WARN: Code duplicated, block: B:348:0x065f  */
    /* JADX WARN: Code duplicated, block: B:349:0x0662  */
    /* JADX WARN: Code duplicated, block: B:350:0x0664 A[PHI: r1
  0x0664: PHI (r1v44 java.lang.String) = 
  (r1v43 java.lang.String)
  (r1v45 java.lang.String)
  (r1v46 java.lang.String)
  (r1v47 java.lang.String)
  (r1v71 java.lang.String)
  (r1v72 java.lang.String)
  (r1v73 java.lang.String)
  (r1v74 java.lang.String)
  (r1v75 java.lang.String)
  (r1v90 java.lang.String)
  (r1v92 java.lang.String)
 binds: [B:238:0x03fa, B:349:0x0662, B:348:0x065f, B:347:0x065c, B:277:0x04e1, B:276:0x04dd, B:275:0x04d9, B:274:0x04d5, B:273:0x04d1, B:244:0x0434, B:242:0x0426] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:356:0x0676  */
    /* JADX WARN: Code duplicated, block: B:357:0x0678  */
    /* JADX WARN: Code duplicated, block: B:360:0x0680  */
    /* JADX WARN: Code duplicated, block: B:361:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:363:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:365:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:367:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:370:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:372:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:375:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:378:0x06de  */
    /* JADX WARN: Code duplicated, block: B:381:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:383:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:403:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:405:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:407:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:409:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:410:0x080c  */
    /* JADX WARN: Code duplicated, block: B:412:0x0814  */
    /* JADX WARN: Code duplicated, block: B:472:0x0917  */
    /* JADX WARN: Code duplicated, block: B:473:0x0919  */
    /* JADX WARN: Code duplicated, block: B:474:0x091b  */
    /* JADX WARN: Code duplicated, block: B:475:0x091d  */
    /* JADX WARN: Code duplicated, block: B:476:0x091f  */
    /* JADX WARN: Code duplicated, block: B:477:0x0921  */
    /* JADX WARN: Code duplicated, block: B:481:0x0927  */
    /* JADX WARN: Code duplicated, block: B:483:0x092a  */
    /* JADX WARN: Code duplicated, block: B:485:0x092d  */
    /* JADX WARN: Code duplicated, block: B:487:0x0930  */
    /* JADX WARN: Code duplicated, block: B:496:0x095d A[LOOP:3: B:495:0x095b->B:496:0x095d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:499:0x096c  */
    /* JADX WARN: Code duplicated, block: B:500:0x0973  */
    /* JADX WARN: Code duplicated, block: B:503:0x097d  */
    /* JADX WARN: Code duplicated, block: B:505:0x0981  */
    /* JADX WARN: Code duplicated, block: B:507:0x0985  */
    /* JADX WARN: Code duplicated, block: B:508:0x098b  */
    /* JADX WARN: Code duplicated, block: B:509:0x0991  */
    /* JADX WARN: Code duplicated, block: B:510:0x0997  */
    /* JADX WARN: Code duplicated, block: B:511:0x099d  */
    /* JADX WARN: Code duplicated, block: B:512:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:513:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:514:0x09af  */
    /* JADX WARN: Code duplicated, block: B:515:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:516:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:517:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:518:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:519:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:522:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:524:0x09de  */
    /* JADX WARN: Code duplicated, block: B:526:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:528:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:529:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:548:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:554:0x0a5e A[LOOP:4: B:553:0x0a5c->B:554:0x0a5e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:559:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:561:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:563:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:565:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:567:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:569:0x0ab8  */
    /* JADX WARN: Code duplicated, block: B:571:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:573:0x0ac1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:574:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:584:0x0add  */
    /* JADX WARN: Code duplicated, block: B:585:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:586:0x0afe  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:595:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:596:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:598:0x0b2d  */
    /* JADX WARN: Code duplicated, block: B:599:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:600:0x0b3a  */
    /* JADX WARN: Code duplicated, block: B:603:0x0b41 A[LOOP:0: B:7:0x0011->B:603:0x0b41, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:610:0x0924 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x0611 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:247:0x0440, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:265:0x049a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:548:0x0a38, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:557:0x0a74, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v127, types: [int] */
    /* JADX WARN: Type inference failed for: r3v130 */
    /* JADX WARN: Type inference failed for: r3v133 */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r42v0, types: [com.google.android.gms.internal.ads.zzauu] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
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
    public final boolean a(zzauu zzauuVar) throws InterruptedException, zzasv, EOFException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        Object obj;
        zzavn zzavnVar;
        char c;
        long jZzd;
        int i2;
        long j;
        zzavn zzavnVar2;
        int i3;
        long j2;
        long j3;
        int i4;
        int i5;
        long j4;
        long j5;
        int i6;
        String str;
        zzavn zzavnVar3;
        long j6;
        int i7;
        int i8;
        long j7;
        double dLongBitsToDouble;
        zzavn zzavnVar4;
        long j8;
        String str2;
        Object obj2;
        String str3;
        String str4;
        Object obj3;
        String str5;
        Object obj4;
        d16 d16Var;
        zzauw zzauwVar;
        int i9;
        String str6;
        byte b;
        String str7;
        String str8;
        byte[] bArr;
        List listSingletonList;
        List list;
        zzbag zzbagVar;
        int iZzc;
        byte[] bArr2;
        int length;
        byte[] bArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr4;
        int i19;
        int i20;
        ArrayList arrayList;
        String str9;
        int i21;
        ArrayList arrayList2;
        String str10;
        String str11;
        List list2;
        int i22;
        int i23;
        zzbag zzbagVar2;
        int iZzf;
        boolean z5;
        long jZzl;
        UUID uuid;
        int iZzh;
        List list3;
        int i24;
        int i25;
        zzass zzassVarZzi;
        int i26;
        int i27;
        int i28;
        float f;
        zzbaq zzbaqVar;
        byte[] bArr5;
        int i29;
        int i30;
        int i31;
        zzavn zzavnVar5;
        zzavc zzavbVar;
        zzbab zzbabVar;
        zzbab zzbabVar2;
        ?? r3 = 0;
        int i32 = 1;
        zzazy.zze(this.g != null);
        c16 c16Var = this;
        while (true) {
            Stack stack = c16Var.b;
            if (stack.isEmpty()) {
                z = false;
                z2 = true;
                c16Var = this;
            } else {
                if (zzauuVar.zzd() >= ((b16) stack.peek()).b) {
                    sd6 sd6Var = c16Var.g;
                    int i33 = ((b16) stack.pop()).a;
                    zzavn zzavnVar6 = (zzavn) sd6Var.x;
                    SparseArray sparseArray = zzavnVar6.b;
                    if (i33 != 160) {
                        if (i33 == 174) {
                            String str12 = zzavnVar6.s.a;
                            if ("V_VP8".equals(str12) || "V_VP9".equals(str12) || "V_MPEG2".equals(str12) || "V_MPEG4/ISO/SP".equals(str12) || "V_MPEG4/ISO/ASP".equals(str12) || "V_MPEG4/ISO/AP".equals(str12) || "V_MPEG4/ISO/AVC".equals(str12) || "V_MPEGH/ISO/HEVC".equals(str12) || "V_MS/VFW/FOURCC".equals(str12) || "V_THEORA".equals(str12) || "A_OPUS".equals(str12) || "A_VORBIS".equals(str12) || "A_AAC".equals(str12) || "A_MPEG/L2".equals(str12) || "A_MPEG/L3".equals(str12) || "A_AC3".equals(str12) || "A_EAC3".equals(str12) || "A_TRUEHD".equals(str12) || "A_DTS".equals(str12) || "A_DTS/EXPRESS".equals(str12)) {
                                str2 = "A_DTS/LOSSLESS";
                            } else {
                                str2 = "A_DTS/LOSSLESS";
                                if (!str2.equals(str12)) {
                                    obj2 = "V_MPEG4/ISO/AP";
                                    if (!"A_FLAC".equals(str12)) {
                                        if ("A_MS/ACM".equals(str12)) {
                                            obj3 = "V_MPEG4/ISO/SP";
                                        } else {
                                            obj3 = "V_MPEG4/ISO/SP";
                                            if (!"A_PCM/INT/LIT".equals(str12) && !"S_TEXT/UTF8".equals(str12)) {
                                                str5 = "S_VOBSUB";
                                                if (!str5.equals(str12)) {
                                                    obj4 = "A_MS/ACM";
                                                    str3 = "S_HDMV/PGS";
                                                    if (!str3.equals(str12)) {
                                                        str4 = "S_DVBSUB";
                                                        if (!str4.equals(str12)) {
                                                            zzavnVar5 = zzavnVar6;
                                                        }
                                                        zzavnVar5.s = null;
                                                    }
                                                }
                                                str4 = "S_DVBSUB";
                                            }
                                            obj4 = "A_MS/ACM";
                                            str3 = "S_HDMV/PGS";
                                            str4 = "S_DVBSUB";
                                        }
                                        str5 = "S_VOBSUB";
                                        obj4 = "A_MS/ACM";
                                        str3 = "S_HDMV/PGS";
                                        str4 = "S_DVBSUB";
                                    }
                                    d16Var = zzavnVar6.s;
                                    zzauwVar = zzavnVar6.X;
                                    i9 = d16Var.b;
                                    str6 = d16Var.a;
                                    switch (str6.hashCode()) {
                                        case -2095576542:
                                            if (str6.equals(obj2)) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -2095575984:
                                            if (str6.equals(obj3)) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1985379776:
                                            if (str6.equals(obj4)) {
                                                b = 22;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1784763192:
                                            if (str6.equals("A_TRUEHD")) {
                                                b = 17;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1730367663:
                                            if (str6.equals("A_VORBIS")) {
                                                b = 10;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1482641358:
                                            if (str6.equals("A_MPEG/L2")) {
                                                b = 13;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1482641357:
                                            if (str6.equals("A_MPEG/L3")) {
                                                b = 14;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1373388978:
                                            if (str6.equals("V_MS/VFW/FOURCC")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -933872740:
                                            if (str6.equals(str4)) {
                                                b = 27;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -538363189:
                                            if (str6.equals("V_MPEG4/ISO/ASP")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -538363109:
                                            if (str6.equals("V_MPEG4/ISO/AVC")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -425012669:
                                            if (str6.equals(str5)) {
                                                b = 25;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -356037306:
                                            if (str6.equals(str2)) {
                                                b = 20;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 62923557:
                                            if (str6.equals("A_AAC")) {
                                                b = 12;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 62923603:
                                            if (str6.equals("A_AC3")) {
                                                b = 15;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 62927045:
                                            if (str6.equals("A_DTS")) {
                                                b = 18;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 82338133:
                                            if (str6.equals("V_VP8")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 82338134:
                                            if (str6.equals("V_VP9")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 99146302:
                                            if (str6.equals(str3)) {
                                                b = 26;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 444813526:
                                            if (str6.equals("V_THEORA")) {
                                                b = 9;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 542569478:
                                            if (str6.equals("A_DTS/EXPRESS")) {
                                                b = 19;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 725957860:
                                            if (str6.equals("A_PCM/INT/LIT")) {
                                                b = 23;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 855502857:
                                            if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1422270023:
                                            if (str6.equals("S_TEXT/UTF8")) {
                                                b = 24;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1809237540:
                                            if (str6.equals("V_MPEG2")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1950749482:
                                            if (str6.equals("A_EAC3")) {
                                                b = 16;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1950789798:
                                            if (str6.equals("A_FLAC")) {
                                                b = 21;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1951062397:
                                            if (str6.equals("A_OPUS")) {
                                                b = 11;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    str7 = "video/x-unknown";
                                    switch (b) {
                                        case 0:
                                            str7 = "video/x-vnd.on2.vp8";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z6 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z6 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27 || (i29 = d16Var.m) == i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (d16Var.k * i28) / (d16Var.j * i29);
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f || d16Var.x == -1.0f || d16Var.y == -1.0f || d16Var.z == -1.0f || d16Var.A == -1.0f || d16Var.B == -1.0f || d16Var.C == -1.0f || d16Var.D == -1.0f || d16Var.E == -1.0f || d16Var.F == -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = new byte[25];
                                                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr5);
                                                        byteBufferWrap.put((byte) 0);
                                                        byteBufferWrap.putShort((short) ((d16Var.w * 50000.0f) + 0.5f));
                                                        byteBufferWrap.putShort((short) ((d16Var.x * 50000.0f) + 0.5f));
                                                        byteBufferWrap.putShort((short) ((d16Var.y * 50000.0f) + 0.5f));
                                                        byteBufferWrap.putShort((short) ((d16Var.z * 50000.0f) + 0.5f));
                                                        byteBufferWrap.putShort((short) ((d16Var.A * 50000.0f) + 0.5f));
                                                        byteBufferWrap.putShort((short) ((d16Var.B * 50000.0f) + 0.5f));
                                                        byteBufferWrap.putShort((short) ((d16Var.C * 50000.0f) + 0.5f));
                                                        byteBufferWrap.putShort((short) ((d16Var.D * 50000.0f) + 0.5f));
                                                        byteBufferWrap.putShort((short) (d16Var.E + 0.5f));
                                                        byteBufferWrap.putShort((short) (d16Var.F + 0.5f));
                                                        byteBufferWrap.putShort((short) d16Var.u);
                                                        byteBufferWrap.putShort((short) d16Var.v);
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11) && !"application/pgs".equals(str11) && !"application/dvbsubs".equals(str11)) {
                                                        throw new zzasv("Unexpected MIME type.");
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi;
                                            zzaveVarZzbi.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var2 = zzavnVar5.s;
                                            sparseArray.put(d16Var2.b, d16Var2);
                                            zzavnVar5.s = null;
                                            break;
                                        case 1:
                                            str7 = "video/x-vnd.on2.vp9";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z7 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z7 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi2 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi2;
                                            zzaveVarZzbi2.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var3 = zzavnVar5.s;
                                            sparseArray.put(d16Var3.b, d16Var3);
                                            zzavnVar5.s = null;
                                            break;
                                        case 2:
                                            str7 = "video/mpeg2";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z8 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z8 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi3 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi3;
                                            zzaveVarZzbi3.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var4 = zzavnVar5.s;
                                            sparseArray.put(d16Var4.b, d16Var4);
                                            zzavnVar5.s = null;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                            bArr = d16Var.h;
                                            if (bArr == null) {
                                                listSingletonList = null;
                                            } else {
                                                listSingletonList = Collections.singletonList(bArr);
                                            }
                                            str7 = "video/mp4v-es";
                                            list3 = listSingletonList;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z9 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z9 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi4 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi4;
                                            zzaveVarZzbi4.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var5 = zzavnVar5.s;
                                            sparseArray.put(d16Var5.b, d16Var5);
                                            zzavnVar5.s = null;
                                            break;
                                        case 6:
                                            zzbao zzbaoVarZza = zzbao.zza(new zzbag(d16Var.h));
                                            list = zzbaoVarZza.zza;
                                            d16Var.P = zzbaoVarZza.zzb;
                                            str8 = "video/avc";
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z10 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z10 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi5 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi5;
                                            zzaveVarZzbi5.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var6 = zzavnVar5.s;
                                            sparseArray.put(d16Var6.b, d16Var6);
                                            zzavnVar5.s = null;
                                            break;
                                        case 7:
                                            zzbau zzbauVarZza = zzbau.zza(new zzbag(d16Var.h));
                                            list = zzbauVarZza.zza;
                                            d16Var.P = zzbauVarZza.zzb;
                                            str8 = "video/hevc";
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z11 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z11 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi6 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi6;
                                            zzaveVarZzbi6.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var7 = zzavnVar5.s;
                                            sparseArray.put(d16Var7.b, d16Var7);
                                            zzavnVar5.s = null;
                                            break;
                                        case 8:
                                            zzbagVar = new zzbag(d16Var.h);
                                            try {
                                                zzbagVar.zzw(16);
                                                if (zzbagVar.zzk() != 826496599) {
                                                    listSingletonList = null;
                                                } else {
                                                    iZzc = zzbagVar.zzc() + 20;
                                                    bArr2 = zzbagVar.zza;
                                                    while (true) {
                                                        length = bArr2.length;
                                                        if (iZzc >= length - 4) {
                                                            throw new zzasv("Failed to find FourCC VC1 initialization data");
                                                        }
                                                        if (bArr2[iZzc] != 0 && bArr2[iZzc + 1] == 0 && bArr2[iZzc + 2] == 1 && bArr2[iZzc + 3] == 15) {
                                                            listSingletonList = Collections.singletonList(Arrays.copyOfRange(bArr2, iZzc, length));
                                                        } else {
                                                            iZzc++;
                                                        }
                                                    }
                                                }
                                                if (listSingletonList != null) {
                                                    str7 = "video/wvc1";
                                                } else {
                                                    Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                                                }
                                                list3 = listSingletonList;
                                                iZzh = -1;
                                                i23 = iZzh;
                                                str11 = str7;
                                                list2 = list3;
                                                i22 = -1;
                                                boolean z12 = d16Var.M;
                                                if (true != d16Var.L) {
                                                    i24 = 0;
                                                } else {
                                                    i24 = 2;
                                                }
                                                i25 = (z12 ? 1 : 0) | i24;
                                                if (zzbad.zza(str11)) {
                                                    zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                    i26 = 1;
                                                } else if (zzbad.zzb(str11)) {
                                                    if (d16Var.n == 0) {
                                                        i30 = d16Var.l;
                                                        i27 = -1;
                                                        if (i30 == -1) {
                                                            i30 = d16Var.j;
                                                        }
                                                        d16Var.l = i30;
                                                        i31 = d16Var.m;
                                                        if (i31 == -1) {
                                                            i31 = d16Var.k;
                                                        }
                                                        d16Var.m = i31;
                                                    } else {
                                                        i27 = -1;
                                                    }
                                                    i28 = d16Var.l;
                                                    if (i28 != i27) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (d16Var.q) {
                                                        if (d16Var.w != -1.0f) {
                                                            bArr5 = null;
                                                        } else {
                                                            bArr5 = null;
                                                        }
                                                        zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                    } else {
                                                        zzbaqVar = null;
                                                    }
                                                    zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                    i26 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str11)) {
                                                        zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                    } else {
                                                        if ("application/vobsub".equals(str11)) {
                                                        }
                                                        zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                    }
                                                    i26 = 3;
                                                }
                                                zzave zzaveVarZzbi7 = zzauwVar.zzbi(d16Var.b, i26);
                                                d16Var.O = zzaveVarZzbi7;
                                                zzaveVarZzbi7.zza(zzassVarZzi);
                                                zzavnVar5 = zzavnVar6;
                                                d16 d16Var8 = zzavnVar5.s;
                                                sparseArray.put(d16Var8.b, d16Var8);
                                                zzavnVar5.s = null;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw new zzasv("Error parsing FourCC VC1 codec private");
                                            }
                                            break;
                                        case 9:
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z13 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z13 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi8 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi8;
                                            zzaveVarZzbi8.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var9 = zzavnVar5.s;
                                            sparseArray.put(d16Var9.b, d16Var9);
                                            zzavnVar5.s = null;
                                            break;
                                        case 10:
                                            bArr3 = d16Var.h;
                                            try {
                                                if (bArr3[0] != 2) {
                                                    throw new zzasv("Error parsing vorbis codec private");
                                                }
                                                i10 = 1;
                                                i11 = 0;
                                                while (true) {
                                                    i12 = bArr3[i10];
                                                    if (i12 != -1) {
                                                        i13 = i10 + 1;
                                                        i14 = i11 + i12;
                                                        i15 = 0;
                                                        while (true) {
                                                            i16 = bArr3[i13];
                                                            if (i16 != -1) {
                                                                i17 = i13 + 1;
                                                                i18 = i15 + i16;
                                                                if (bArr3[i17] != 1) {
                                                                    throw new zzasv("Error parsing vorbis codec private");
                                                                }
                                                                bArr4 = new byte[i14];
                                                                System.arraycopy(bArr3, i17, bArr4, 0, i14);
                                                                i19 = i17 + i14;
                                                                if (bArr3[i19] != 3) {
                                                                    throw new zzasv("Error parsing vorbis codec private");
                                                                }
                                                                i20 = i19 + i18;
                                                                if (bArr3[i20] != 5) {
                                                                    throw new zzasv("Error parsing vorbis codec private");
                                                                }
                                                                int length2 = bArr3.length - i20;
                                                                byte[] bArr6 = new byte[length2];
                                                                System.arraycopy(bArr3, i20, bArr6, 0, length2);
                                                                arrayList = new ArrayList(2);
                                                                arrayList.add(bArr4);
                                                                arrayList.add(bArr6);
                                                                str9 = "audio/vorbis";
                                                                i21 = 8192;
                                                                String str13 = str9;
                                                                arrayList2 = arrayList;
                                                                str10 = str13;
                                                                str11 = str10;
                                                                list2 = arrayList2;
                                                                i22 = i21;
                                                                i23 = -1;
                                                                boolean z14 = d16Var.M;
                                                                if (true != d16Var.L) {
                                                                    i24 = 0;
                                                                } else {
                                                                    i24 = 2;
                                                                }
                                                                i25 = (z14 ? 1 : 0) | i24;
                                                                if (zzbad.zza(str11)) {
                                                                    zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                                    i26 = 1;
                                                                } else if (zzbad.zzb(str11)) {
                                                                    if (d16Var.n == 0) {
                                                                        i30 = d16Var.l;
                                                                        i27 = -1;
                                                                        if (i30 == -1) {
                                                                            i30 = d16Var.j;
                                                                        }
                                                                        d16Var.l = i30;
                                                                        i31 = d16Var.m;
                                                                        if (i31 == -1) {
                                                                            i31 = d16Var.k;
                                                                        }
                                                                        d16Var.m = i31;
                                                                    } else {
                                                                        i27 = -1;
                                                                    }
                                                                    i28 = d16Var.l;
                                                                    if (i28 != i27) {
                                                                        f = -1.0f;
                                                                    } else {
                                                                        f = -1.0f;
                                                                    }
                                                                    if (d16Var.q) {
                                                                        if (d16Var.w != -1.0f) {
                                                                            bArr5 = null;
                                                                        } else {
                                                                            bArr5 = null;
                                                                        }
                                                                        zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                                    } else {
                                                                        zzbaqVar = null;
                                                                    }
                                                                    zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                                    i26 = 2;
                                                                } else {
                                                                    if ("application/x-subrip".equals(str11)) {
                                                                        zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                                    } else {
                                                                        if ("application/vobsub".equals(str11)) {
                                                                        }
                                                                        zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                                    }
                                                                    i26 = 3;
                                                                }
                                                                zzave zzaveVarZzbi9 = zzauwVar.zzbi(d16Var.b, i26);
                                                                d16Var.O = zzaveVarZzbi9;
                                                                zzaveVarZzbi9.zza(zzassVarZzi);
                                                                zzavnVar5 = zzavnVar6;
                                                                d16 d16Var10 = zzavnVar5.s;
                                                                sparseArray.put(d16Var10.b, d16Var10);
                                                                zzavnVar5.s = null;
                                                            } else {
                                                                i15 += 255;
                                                                i13++;
                                                            }
                                                        }
                                                    } else {
                                                        i11 += 255;
                                                        i10++;
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                throw new zzasv("Error parsing vorbis codec private");
                                            }
                                            break;
                                        case 11:
                                            arrayList = new ArrayList(3);
                                            arrayList.add(d16Var.h);
                                            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(d16Var.J).array());
                                            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(d16Var.K).array());
                                            str9 = "audio/opus";
                                            i21 = 5760;
                                            String str14 = str9;
                                            arrayList2 = arrayList;
                                            str10 = str14;
                                            str11 = str10;
                                            list2 = arrayList2;
                                            i22 = i21;
                                            i23 = -1;
                                            boolean z15 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z15 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi10 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi10;
                                            zzaveVarZzbi10.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var11 = zzavnVar5.s;
                                            sparseArray.put(d16Var11.b, d16Var11);
                                            zzavnVar5.s = null;
                                            break;
                                        case 12:
                                            listSingletonList = Collections.singletonList(d16Var.h);
                                            str7 = "audio/mp4a-latm";
                                            list3 = listSingletonList;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z16 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z16 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi11 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi11;
                                            zzaveVarZzbi11.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var12 = zzavnVar5.s;
                                            sparseArray.put(d16Var12.b, d16Var12);
                                            zzavnVar5.s = null;
                                            break;
                                        case 13:
                                            str10 = "audio/mpeg-L2";
                                            arrayList2 = null;
                                            i21 = 4096;
                                            str11 = str10;
                                            list2 = arrayList2;
                                            i22 = i21;
                                            i23 = -1;
                                            boolean z17 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z17 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi12 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi12;
                                            zzaveVarZzbi12.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var13 = zzavnVar5.s;
                                            sparseArray.put(d16Var13.b, d16Var13);
                                            zzavnVar5.s = null;
                                            break;
                                        case 14:
                                            str10 = "audio/mpeg";
                                            arrayList2 = null;
                                            i21 = 4096;
                                            str11 = str10;
                                            list2 = arrayList2;
                                            i22 = i21;
                                            i23 = -1;
                                            boolean z18 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z18 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi13 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi13;
                                            zzaveVarZzbi13.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var14 = zzavnVar5.s;
                                            sparseArray.put(d16Var14.b, d16Var14);
                                            zzavnVar5.s = null;
                                            break;
                                        case 15:
                                            str7 = "audio/ac3";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z19 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z19 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi14 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi14;
                                            zzaveVarZzbi14.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var15 = zzavnVar5.s;
                                            sparseArray.put(d16Var15.b, d16Var15);
                                            zzavnVar5.s = null;
                                            break;
                                        case 16:
                                            str7 = "audio/eac3";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z110 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z110 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi15 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi15;
                                            zzaveVarZzbi15.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var16 = zzavnVar5.s;
                                            sparseArray.put(d16Var16.b, d16Var16);
                                            zzavnVar5.s = null;
                                            break;
                                        case 17:
                                            str7 = "audio/true-hd";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z111 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z111 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi16 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi16;
                                            zzaveVarZzbi16.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var17 = zzavnVar5.s;
                                            sparseArray.put(d16Var17.b, d16Var17);
                                            zzavnVar5.s = null;
                                            break;
                                        case 18:
                                        case 19:
                                            str7 = "audio/vnd.dts";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z112 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z112 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi17 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi17;
                                            zzaveVarZzbi17.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var18 = zzavnVar5.s;
                                            sparseArray.put(d16Var18.b, d16Var18);
                                            zzavnVar5.s = null;
                                            break;
                                        case 20:
                                            str7 = "audio/vnd.dts.hd";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z113 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z113 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi18 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi18;
                                            zzaveVarZzbi18.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var19 = zzavnVar5.s;
                                            sparseArray.put(d16Var19.b, d16Var19);
                                            zzavnVar5.s = null;
                                            break;
                                        case 21:
                                            listSingletonList = Collections.singletonList(d16Var.h);
                                            str7 = "audio/x-flac";
                                            list3 = listSingletonList;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z114 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z114 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi19 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi19;
                                            zzaveVarZzbi19.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var110 = zzavnVar5.s;
                                            sparseArray.put(d16Var110.b, d16Var110);
                                            zzavnVar5.s = null;
                                            break;
                                        case 22:
                                            zzbagVar2 = new zzbag(d16Var.h);
                                            try {
                                                iZzf = zzbagVar2.zzf();
                                                if (iZzf != 1) {
                                                    if (iZzf == 65534) {
                                                        zzbagVar2.zzv(24);
                                                        jZzl = zzbagVar2.zzl();
                                                        uuid = zzavn.b0;
                                                        if (jZzl == uuid.getMostSignificantBits() || zzbagVar2.zzl() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        if (z5) {
                                                            iZzh = zzban.zzh(d16Var.H);
                                                            if (iZzh != 0) {
                                                                str7 = "audio/raw";
                                                                list3 = null;
                                                                i23 = iZzh;
                                                                str11 = str7;
                                                                list2 = list3;
                                                                i22 = -1;
                                                                boolean z115 = d16Var.M;
                                                                if (true != d16Var.L) {
                                                                    i24 = 0;
                                                                } else {
                                                                    i24 = 2;
                                                                }
                                                                i25 = (z115 ? 1 : 0) | i24;
                                                                if (zzbad.zza(str11)) {
                                                                    zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                                    i26 = 1;
                                                                } else if (zzbad.zzb(str11)) {
                                                                    if (d16Var.n == 0) {
                                                                        i30 = d16Var.l;
                                                                        i27 = -1;
                                                                        if (i30 == -1) {
                                                                            i30 = d16Var.j;
                                                                        }
                                                                        d16Var.l = i30;
                                                                        i31 = d16Var.m;
                                                                        if (i31 == -1) {
                                                                            i31 = d16Var.k;
                                                                        }
                                                                        d16Var.m = i31;
                                                                    } else {
                                                                        i27 = -1;
                                                                    }
                                                                    i28 = d16Var.l;
                                                                    if (i28 != i27) {
                                                                        f = -1.0f;
                                                                    } else {
                                                                        f = -1.0f;
                                                                    }
                                                                    if (d16Var.q) {
                                                                        if (d16Var.w != -1.0f) {
                                                                            bArr5 = null;
                                                                        } else {
                                                                            bArr5 = null;
                                                                        }
                                                                        zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                                    } else {
                                                                        zzbaqVar = null;
                                                                    }
                                                                    zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                                    i26 = 2;
                                                                } else {
                                                                    if ("application/x-subrip".equals(str11)) {
                                                                        zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                                    } else {
                                                                        if ("application/vobsub".equals(str11)) {
                                                                        }
                                                                        zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                                    }
                                                                    i26 = 3;
                                                                }
                                                                zzave zzaveVarZzbi110 = zzauwVar.zzbi(d16Var.b, i26);
                                                                d16Var.O = zzaveVarZzbi110;
                                                                zzaveVarZzbi110.zza(zzassVarZzi);
                                                                zzavnVar5 = zzavnVar6;
                                                                d16 d16Var111 = zzavnVar5.s;
                                                                sparseArray.put(d16Var111.b, d16Var111);
                                                                zzavnVar5.s = null;
                                                            } else {
                                                                Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                                            }
                                                        } else {
                                                            Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                        }
                                                        str8 = "audio/x-unknown";
                                                        list = null;
                                                        list3 = list;
                                                        str7 = str8;
                                                        iZzh = -1;
                                                        i23 = iZzh;
                                                        str11 = str7;
                                                        list2 = list3;
                                                        i22 = -1;
                                                        boolean z116 = d16Var.M;
                                                        if (true != d16Var.L) {
                                                            i24 = 0;
                                                        } else {
                                                            i24 = 2;
                                                        }
                                                        i25 = (z116 ? 1 : 0) | i24;
                                                        if (zzbad.zza(str11)) {
                                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                            i26 = 1;
                                                        } else if (zzbad.zzb(str11)) {
                                                            if (d16Var.n == 0) {
                                                                i30 = d16Var.l;
                                                                i27 = -1;
                                                                if (i30 == -1) {
                                                                    i30 = d16Var.j;
                                                                }
                                                                d16Var.l = i30;
                                                                i31 = d16Var.m;
                                                                if (i31 == -1) {
                                                                    i31 = d16Var.k;
                                                                }
                                                                d16Var.m = i31;
                                                            } else {
                                                                i27 = -1;
                                                            }
                                                            i28 = d16Var.l;
                                                            if (i28 != i27) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (d16Var.q) {
                                                                if (d16Var.w != -1.0f) {
                                                                    bArr5 = null;
                                                                } else {
                                                                    bArr5 = null;
                                                                }
                                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                            } else {
                                                                zzbaqVar = null;
                                                            }
                                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                            i26 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str11)) {
                                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                            } else {
                                                                if ("application/vobsub".equals(str11)) {
                                                                }
                                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                            }
                                                            i26 = 3;
                                                        }
                                                        zzave zzaveVarZzbi111 = zzauwVar.zzbi(d16Var.b, i26);
                                                        d16Var.O = zzaveVarZzbi111;
                                                        zzaveVarZzbi111.zza(zzassVarZzi);
                                                        zzavnVar5 = zzavnVar6;
                                                        d16 d16Var112 = zzavnVar5.s;
                                                        sparseArray.put(d16Var112.b, d16Var112);
                                                        zzavnVar5.s = null;
                                                    }
                                                    z5 = false;
                                                    if (z5) {
                                                        iZzh = zzban.zzh(d16Var.H);
                                                        if (iZzh != 0) {
                                                            str7 = "audio/raw";
                                                            list3 = null;
                                                            i23 = iZzh;
                                                            str11 = str7;
                                                            list2 = list3;
                                                            i22 = -1;
                                                            boolean z117 = d16Var.M;
                                                            if (true != d16Var.L) {
                                                                i24 = 0;
                                                            } else {
                                                                i24 = 2;
                                                            }
                                                            i25 = (z117 ? 1 : 0) | i24;
                                                            if (zzbad.zza(str11)) {
                                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                                i26 = 1;
                                                            } else if (zzbad.zzb(str11)) {
                                                                if (d16Var.n == 0) {
                                                                    i30 = d16Var.l;
                                                                    i27 = -1;
                                                                    if (i30 == -1) {
                                                                        i30 = d16Var.j;
                                                                    }
                                                                    d16Var.l = i30;
                                                                    i31 = d16Var.m;
                                                                    if (i31 == -1) {
                                                                        i31 = d16Var.k;
                                                                    }
                                                                    d16Var.m = i31;
                                                                } else {
                                                                    i27 = -1;
                                                                }
                                                                i28 = d16Var.l;
                                                                if (i28 != i27) {
                                                                    f = -1.0f;
                                                                } else {
                                                                    f = -1.0f;
                                                                }
                                                                if (d16Var.q) {
                                                                    if (d16Var.w != -1.0f) {
                                                                        bArr5 = null;
                                                                    } else {
                                                                        bArr5 = null;
                                                                    }
                                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                                } else {
                                                                    zzbaqVar = null;
                                                                }
                                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                                i26 = 2;
                                                            } else {
                                                                if ("application/x-subrip".equals(str11)) {
                                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                                } else {
                                                                    if ("application/vobsub".equals(str11)) {
                                                                    }
                                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                                }
                                                                i26 = 3;
                                                            }
                                                            zzave zzaveVarZzbi112 = zzauwVar.zzbi(d16Var.b, i26);
                                                            d16Var.O = zzaveVarZzbi112;
                                                            zzaveVarZzbi112.zza(zzassVarZzi);
                                                            zzavnVar5 = zzavnVar6;
                                                            d16 d16Var113 = zzavnVar5.s;
                                                            sparseArray.put(d16Var113.b, d16Var113);
                                                            zzavnVar5.s = null;
                                                        } else {
                                                            Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                                        }
                                                    } else {
                                                        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    }
                                                    str8 = "audio/x-unknown";
                                                    list = null;
                                                    list3 = list;
                                                    str7 = str8;
                                                    iZzh = -1;
                                                    i23 = iZzh;
                                                    str11 = str7;
                                                    list2 = list3;
                                                    i22 = -1;
                                                    boolean z118 = d16Var.M;
                                                    if (true != d16Var.L) {
                                                        i24 = 0;
                                                    } else {
                                                        i24 = 2;
                                                    }
                                                    i25 = (z118 ? 1 : 0) | i24;
                                                    if (zzbad.zza(str11)) {
                                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                        i26 = 1;
                                                    } else if (zzbad.zzb(str11)) {
                                                        if (d16Var.n == 0) {
                                                            i30 = d16Var.l;
                                                            i27 = -1;
                                                            if (i30 == -1) {
                                                                i30 = d16Var.j;
                                                            }
                                                            d16Var.l = i30;
                                                            i31 = d16Var.m;
                                                            if (i31 == -1) {
                                                                i31 = d16Var.k;
                                                            }
                                                            d16Var.m = i31;
                                                        } else {
                                                            i27 = -1;
                                                        }
                                                        i28 = d16Var.l;
                                                        if (i28 != i27) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (d16Var.q) {
                                                            if (d16Var.w != -1.0f) {
                                                                bArr5 = null;
                                                            } else {
                                                                bArr5 = null;
                                                            }
                                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                        } else {
                                                            zzbaqVar = null;
                                                        }
                                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                        i26 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str11)) {
                                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                        } else {
                                                            if ("application/vobsub".equals(str11)) {
                                                            }
                                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                        }
                                                        i26 = 3;
                                                    }
                                                    zzave zzaveVarZzbi113 = zzauwVar.zzbi(d16Var.b, i26);
                                                    d16Var.O = zzaveVarZzbi113;
                                                    zzaveVarZzbi113.zza(zzassVarZzi);
                                                    zzavnVar5 = zzavnVar6;
                                                    d16 d16Var114 = zzavnVar5.s;
                                                    sparseArray.put(d16Var114.b, d16Var114);
                                                    zzavnVar5.s = null;
                                                    break;
                                                }
                                                z5 = true;
                                                if (z5) {
                                                    iZzh = zzban.zzh(d16Var.H);
                                                    if (iZzh != 0) {
                                                        str7 = "audio/raw";
                                                        list3 = null;
                                                        i23 = iZzh;
                                                        str11 = str7;
                                                        list2 = list3;
                                                        i22 = -1;
                                                        boolean z119 = d16Var.M;
                                                        if (true != d16Var.L) {
                                                            i24 = 0;
                                                        } else {
                                                            i24 = 2;
                                                        }
                                                        i25 = (z119 ? 1 : 0) | i24;
                                                        if (zzbad.zza(str11)) {
                                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                            i26 = 1;
                                                        } else if (zzbad.zzb(str11)) {
                                                            if (d16Var.n == 0) {
                                                                i30 = d16Var.l;
                                                                i27 = -1;
                                                                if (i30 == -1) {
                                                                    i30 = d16Var.j;
                                                                }
                                                                d16Var.l = i30;
                                                                i31 = d16Var.m;
                                                                if (i31 == -1) {
                                                                    i31 = d16Var.k;
                                                                }
                                                                d16Var.m = i31;
                                                            } else {
                                                                i27 = -1;
                                                            }
                                                            i28 = d16Var.l;
                                                            if (i28 != i27) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (d16Var.q) {
                                                                if (d16Var.w != -1.0f) {
                                                                    bArr5 = null;
                                                                } else {
                                                                    bArr5 = null;
                                                                }
                                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                            } else {
                                                                zzbaqVar = null;
                                                            }
                                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                            i26 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str11)) {
                                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                            } else {
                                                                if ("application/vobsub".equals(str11)) {
                                                                }
                                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                            }
                                                            i26 = 3;
                                                        }
                                                        zzave zzaveVarZzbi114 = zzauwVar.zzbi(d16Var.b, i26);
                                                        d16Var.O = zzaveVarZzbi114;
                                                        zzaveVarZzbi114.zza(zzassVarZzi);
                                                        zzavnVar5 = zzavnVar6;
                                                        d16 d16Var115 = zzavnVar5.s;
                                                        sparseArray.put(d16Var115.b, d16Var115);
                                                        zzavnVar5.s = null;
                                                    } else {
                                                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                                    }
                                                } else {
                                                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                }
                                                str8 = "audio/x-unknown";
                                                list = null;
                                                list3 = list;
                                                str7 = str8;
                                                iZzh = -1;
                                                i23 = iZzh;
                                                str11 = str7;
                                                list2 = list3;
                                                i22 = -1;
                                                boolean z1110 = d16Var.M;
                                                if (true != d16Var.L) {
                                                    i24 = 0;
                                                } else {
                                                    i24 = 2;
                                                }
                                                i25 = (z1110 ? 1 : 0) | i24;
                                                if (zzbad.zza(str11)) {
                                                    zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                    i26 = 1;
                                                } else if (zzbad.zzb(str11)) {
                                                    if (d16Var.n == 0) {
                                                        i30 = d16Var.l;
                                                        i27 = -1;
                                                        if (i30 == -1) {
                                                            i30 = d16Var.j;
                                                        }
                                                        d16Var.l = i30;
                                                        i31 = d16Var.m;
                                                        if (i31 == -1) {
                                                            i31 = d16Var.k;
                                                        }
                                                        d16Var.m = i31;
                                                    } else {
                                                        i27 = -1;
                                                    }
                                                    i28 = d16Var.l;
                                                    if (i28 != i27) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (d16Var.q) {
                                                        if (d16Var.w != -1.0f) {
                                                            bArr5 = null;
                                                        } else {
                                                            bArr5 = null;
                                                        }
                                                        zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                    } else {
                                                        zzbaqVar = null;
                                                    }
                                                    zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                    i26 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str11)) {
                                                        zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                    } else {
                                                        if ("application/vobsub".equals(str11)) {
                                                        }
                                                        zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                    }
                                                    i26 = 3;
                                                }
                                                zzave zzaveVarZzbi115 = zzauwVar.zzbi(d16Var.b, i26);
                                                d16Var.O = zzaveVarZzbi115;
                                                zzaveVarZzbi115.zza(zzassVarZzi);
                                                zzavnVar5 = zzavnVar6;
                                                d16 d16Var116 = zzavnVar5.s;
                                                sparseArray.put(d16Var116.b, d16Var116);
                                                zzavnVar5.s = null;
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                throw new zzasv("Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 23:
                                            iZzh = zzban.zzh(d16Var.H);
                                            if (iZzh == 0) {
                                                Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                                str8 = "audio/x-unknown";
                                                list = null;
                                                list3 = list;
                                                str7 = str8;
                                                iZzh = -1;
                                                i23 = iZzh;
                                                str11 = str7;
                                                list2 = list3;
                                                i22 = -1;
                                                boolean z1111 = d16Var.M;
                                                if (true != d16Var.L) {
                                                    i24 = 0;
                                                } else {
                                                    i24 = 2;
                                                }
                                                i25 = (z1111 ? 1 : 0) | i24;
                                                if (zzbad.zza(str11)) {
                                                    zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                    i26 = 1;
                                                } else if (zzbad.zzb(str11)) {
                                                    if (d16Var.n == 0) {
                                                        i30 = d16Var.l;
                                                        i27 = -1;
                                                        if (i30 == -1) {
                                                            i30 = d16Var.j;
                                                        }
                                                        d16Var.l = i30;
                                                        i31 = d16Var.m;
                                                        if (i31 == -1) {
                                                            i31 = d16Var.k;
                                                        }
                                                        d16Var.m = i31;
                                                    } else {
                                                        i27 = -1;
                                                    }
                                                    i28 = d16Var.l;
                                                    if (i28 != i27) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (d16Var.q) {
                                                        if (d16Var.w != -1.0f) {
                                                            bArr5 = null;
                                                        } else {
                                                            bArr5 = null;
                                                        }
                                                        zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                    } else {
                                                        zzbaqVar = null;
                                                    }
                                                    zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                    i26 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str11)) {
                                                        zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                    } else {
                                                        if ("application/vobsub".equals(str11)) {
                                                        }
                                                        zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                    }
                                                    i26 = 3;
                                                }
                                                zzave zzaveVarZzbi116 = zzauwVar.zzbi(d16Var.b, i26);
                                                d16Var.O = zzaveVarZzbi116;
                                                zzaveVarZzbi116.zza(zzassVarZzi);
                                                zzavnVar5 = zzavnVar6;
                                                d16 d16Var117 = zzavnVar5.s;
                                                sparseArray.put(d16Var117.b, d16Var117);
                                                zzavnVar5.s = null;
                                            } else {
                                                str7 = "audio/raw";
                                                list3 = null;
                                                i23 = iZzh;
                                                str11 = str7;
                                                list2 = list3;
                                                i22 = -1;
                                                boolean z1112 = d16Var.M;
                                                if (true != d16Var.L) {
                                                    i24 = 0;
                                                } else {
                                                    i24 = 2;
                                                }
                                                i25 = (z1112 ? 1 : 0) | i24;
                                                if (zzbad.zza(str11)) {
                                                    zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                    i26 = 1;
                                                } else if (zzbad.zzb(str11)) {
                                                    if (d16Var.n == 0) {
                                                        i30 = d16Var.l;
                                                        i27 = -1;
                                                        if (i30 == -1) {
                                                            i30 = d16Var.j;
                                                        }
                                                        d16Var.l = i30;
                                                        i31 = d16Var.m;
                                                        if (i31 == -1) {
                                                            i31 = d16Var.k;
                                                        }
                                                        d16Var.m = i31;
                                                    } else {
                                                        i27 = -1;
                                                    }
                                                    i28 = d16Var.l;
                                                    if (i28 != i27) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (d16Var.q) {
                                                        if (d16Var.w != -1.0f) {
                                                            bArr5 = null;
                                                        } else {
                                                            bArr5 = null;
                                                        }
                                                        zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                    } else {
                                                        zzbaqVar = null;
                                                    }
                                                    zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                    i26 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str11)) {
                                                        zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                    } else {
                                                        if ("application/vobsub".equals(str11)) {
                                                        }
                                                        zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                    }
                                                    i26 = 3;
                                                }
                                                zzave zzaveVarZzbi117 = zzauwVar.zzbi(d16Var.b, i26);
                                                d16Var.O = zzaveVarZzbi117;
                                                zzaveVarZzbi117.zza(zzassVarZzi);
                                                zzavnVar5 = zzavnVar6;
                                                d16 d16Var118 = zzavnVar5.s;
                                                sparseArray.put(d16Var118.b, d16Var118);
                                                zzavnVar5.s = null;
                                            }
                                            break;
                                        case 24:
                                            str7 = "application/x-subrip";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z1113 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z1113 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi118 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi118;
                                            zzaveVarZzbi118.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var119 = zzavnVar5.s;
                                            sparseArray.put(d16Var119.b, d16Var119);
                                            zzavnVar5.s = null;
                                            break;
                                        case 25:
                                            listSingletonList = Collections.singletonList(d16Var.h);
                                            str7 = "application/vobsub";
                                            list3 = listSingletonList;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z1114 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z1114 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi119 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi119;
                                            zzaveVarZzbi119.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var1110 = zzavnVar5.s;
                                            sparseArray.put(d16Var1110.b, d16Var1110);
                                            zzavnVar5.s = null;
                                            break;
                                        case 26:
                                            str7 = "application/pgs";
                                            str8 = str7;
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z1115 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z1115 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi1110 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi1110;
                                            zzaveVarZzbi1110.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var1111 = zzavnVar5.s;
                                            sparseArray.put(d16Var1111.b, d16Var1111);
                                            zzavnVar5.s = null;
                                            break;
                                        case 27:
                                            byte[] bArr7 = d16Var.h;
                                            listSingletonList = Collections.singletonList(new byte[]{bArr7[0], bArr7[1], bArr7[2], bArr7[3]});
                                            str7 = "application/dvbsubs";
                                            list3 = listSingletonList;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z1116 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z1116 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi1111 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi1111;
                                            zzaveVarZzbi1111.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var1112 = zzavnVar5.s;
                                            sparseArray.put(d16Var1112.b, d16Var1112);
                                            zzavnVar5.s = null;
                                            break;
                                        default:
                                            throw new zzasv("Unrecognized codec identifier.");
                                    }
                                }
                                str3 = "S_HDMV/PGS";
                                str4 = "S_DVBSUB";
                                obj3 = "V_MPEG4/ISO/SP";
                                str5 = "S_VOBSUB";
                                obj4 = "A_MS/ACM";
                                d16Var = zzavnVar6.s;
                                zzauwVar = zzavnVar6.X;
                                i9 = d16Var.b;
                                str6 = d16Var.a;
                                switch (str6.hashCode()) {
                                    case -2095576542:
                                        if (str6.equals(obj2)) {
                                            b = 5;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -2095575984:
                                        if (str6.equals(obj3)) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -1985379776:
                                        if (str6.equals(obj4)) {
                                            b = 22;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -1784763192:
                                        if (str6.equals("A_TRUEHD")) {
                                            b = 17;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -1730367663:
                                        if (str6.equals("A_VORBIS")) {
                                            b = 10;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -1482641358:
                                        if (str6.equals("A_MPEG/L2")) {
                                            b = 13;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -1482641357:
                                        if (str6.equals("A_MPEG/L3")) {
                                            b = 14;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -1373388978:
                                        if (str6.equals("V_MS/VFW/FOURCC")) {
                                            b = 8;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -933872740:
                                        if (str6.equals(str4)) {
                                            b = 27;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -538363189:
                                        if (str6.equals("V_MPEG4/ISO/ASP")) {
                                            b = 4;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -538363109:
                                        if (str6.equals("V_MPEG4/ISO/AVC")) {
                                            b = 6;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -425012669:
                                        if (str6.equals(str5)) {
                                            b = 25;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -356037306:
                                        if (str6.equals(str2)) {
                                            b = 20;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 62923557:
                                        if (str6.equals("A_AAC")) {
                                            b = 12;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 62923603:
                                        if (str6.equals("A_AC3")) {
                                            b = 15;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 62927045:
                                        if (str6.equals("A_DTS")) {
                                            b = 18;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 82338133:
                                        if (str6.equals("V_VP8")) {
                                            b = 0;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 82338134:
                                        if (str6.equals("V_VP9")) {
                                            b = 1;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 99146302:
                                        if (str6.equals(str3)) {
                                            b = 26;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 444813526:
                                        if (str6.equals("V_THEORA")) {
                                            b = 9;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 542569478:
                                        if (str6.equals("A_DTS/EXPRESS")) {
                                            b = 19;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 725957860:
                                        if (str6.equals("A_PCM/INT/LIT")) {
                                            b = 23;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 855502857:
                                        if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                            b = 7;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1422270023:
                                        if (str6.equals("S_TEXT/UTF8")) {
                                            b = 24;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1809237540:
                                        if (str6.equals("V_MPEG2")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1950749482:
                                        if (str6.equals("A_EAC3")) {
                                            b = 16;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1950789798:
                                        if (str6.equals("A_FLAC")) {
                                            b = 21;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1951062397:
                                        if (str6.equals("A_OPUS")) {
                                            b = 11;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                str7 = "video/x-unknown";
                                switch (b) {
                                    case 0:
                                        str7 = "video/x-vnd.on2.vp8";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z1117 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z1117 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi1112 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi1112;
                                        zzaveVarZzbi1112.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var1113 = zzavnVar5.s;
                                        sparseArray.put(d16Var1113.b, d16Var1113);
                                        zzavnVar5.s = null;
                                        break;
                                    case 1:
                                        str7 = "video/x-vnd.on2.vp9";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z1118 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z1118 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi1113 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi1113;
                                        zzaveVarZzbi1113.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var1114 = zzavnVar5.s;
                                        sparseArray.put(d16Var1114.b, d16Var1114);
                                        zzavnVar5.s = null;
                                        break;
                                    case 2:
                                        str7 = "video/mpeg2";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z1119 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z1119 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi1114 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi1114;
                                        zzaveVarZzbi1114.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var1115 = zzavnVar5.s;
                                        sparseArray.put(d16Var1115.b, d16Var1115);
                                        zzavnVar5.s = null;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        bArr = d16Var.h;
                                        if (bArr == null) {
                                            listSingletonList = null;
                                        } else {
                                            listSingletonList = Collections.singletonList(bArr);
                                        }
                                        str7 = "video/mp4v-es";
                                        list3 = listSingletonList;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z11110 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z11110 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi1115 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi1115;
                                        zzaveVarZzbi1115.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var1116 = zzavnVar5.s;
                                        sparseArray.put(d16Var1116.b, d16Var1116);
                                        zzavnVar5.s = null;
                                        break;
                                    case 6:
                                        zzbao zzbaoVarZza2 = zzbao.zza(new zzbag(d16Var.h));
                                        list = zzbaoVarZza2.zza;
                                        d16Var.P = zzbaoVarZza2.zzb;
                                        str8 = "video/avc";
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z11111 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z11111 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi1116 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi1116;
                                        zzaveVarZzbi1116.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var1117 = zzavnVar5.s;
                                        sparseArray.put(d16Var1117.b, d16Var1117);
                                        zzavnVar5.s = null;
                                        break;
                                    case 7:
                                        zzbau zzbauVarZza2 = zzbau.zza(new zzbag(d16Var.h));
                                        list = zzbauVarZza2.zza;
                                        d16Var.P = zzbauVarZza2.zzb;
                                        str8 = "video/hevc";
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z11112 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z11112 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi1117 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi1117;
                                        zzaveVarZzbi1117.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var1118 = zzavnVar5.s;
                                        sparseArray.put(d16Var1118.b, d16Var1118);
                                        zzavnVar5.s = null;
                                        break;
                                    case 8:
                                        zzbagVar = new zzbag(d16Var.h);
                                        zzbagVar.zzw(16);
                                        if (zzbagVar.zzk() != 826496599) {
                                            listSingletonList = null;
                                        } else {
                                            iZzc = zzbagVar.zzc() + 20;
                                            bArr2 = zzbagVar.zza;
                                            while (true) {
                                                length = bArr2.length;
                                                if (iZzc >= length - 4) {
                                                    throw new zzasv("Failed to find FourCC VC1 initialization data");
                                                }
                                                if (bArr2[iZzc] != 0) {
                                                }
                                                iZzc++;
                                            }
                                        }
                                        if (listSingletonList != null) {
                                            str7 = "video/wvc1";
                                        } else {
                                            Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                                        }
                                        list3 = listSingletonList;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z11113 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z11113 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi1118 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi1118;
                                        zzaveVarZzbi1118.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var1119 = zzavnVar5.s;
                                        sparseArray.put(d16Var1119.b, d16Var1119);
                                        zzavnVar5.s = null;
                                        break;
                                    case 9:
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z11114 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z11114 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi1119 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi1119;
                                        zzaveVarZzbi1119.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var11110 = zzavnVar5.s;
                                        sparseArray.put(d16Var11110.b, d16Var11110);
                                        zzavnVar5.s = null;
                                        break;
                                    case 10:
                                        bArr3 = d16Var.h;
                                        if (bArr3[0] != 2) {
                                            throw new zzasv("Error parsing vorbis codec private");
                                        }
                                        i10 = 1;
                                        i11 = 0;
                                        while (true) {
                                            i12 = bArr3[i10];
                                            if (i12 != -1) {
                                                i13 = i10 + 1;
                                                i14 = i11 + i12;
                                                i15 = 0;
                                                while (true) {
                                                    i16 = bArr3[i13];
                                                    if (i16 != -1) {
                                                        i17 = i13 + 1;
                                                        i18 = i15 + i16;
                                                        if (bArr3[i17] != 1) {
                                                            throw new zzasv("Error parsing vorbis codec private");
                                                        }
                                                        bArr4 = new byte[i14];
                                                        System.arraycopy(bArr3, i17, bArr4, 0, i14);
                                                        i19 = i17 + i14;
                                                        if (bArr3[i19] != 3) {
                                                            throw new zzasv("Error parsing vorbis codec private");
                                                        }
                                                        i20 = i19 + i18;
                                                        if (bArr3[i20] != 5) {
                                                            throw new zzasv("Error parsing vorbis codec private");
                                                        }
                                                        int length3 = bArr3.length - i20;
                                                        byte[] bArr8 = new byte[length3];
                                                        System.arraycopy(bArr3, i20, bArr8, 0, length3);
                                                        arrayList = new ArrayList(2);
                                                        arrayList.add(bArr4);
                                                        arrayList.add(bArr8);
                                                        str9 = "audio/vorbis";
                                                        i21 = 8192;
                                                        String str15 = str9;
                                                        arrayList2 = arrayList;
                                                        str10 = str15;
                                                        str11 = str10;
                                                        list2 = arrayList2;
                                                        i22 = i21;
                                                        i23 = -1;
                                                        boolean z11115 = d16Var.M;
                                                        if (true != d16Var.L) {
                                                            i24 = 0;
                                                        } else {
                                                            i24 = 2;
                                                        }
                                                        i25 = (z11115 ? 1 : 0) | i24;
                                                        if (zzbad.zza(str11)) {
                                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                            i26 = 1;
                                                        } else if (zzbad.zzb(str11)) {
                                                            if (d16Var.n == 0) {
                                                                i30 = d16Var.l;
                                                                i27 = -1;
                                                                if (i30 == -1) {
                                                                    i30 = d16Var.j;
                                                                }
                                                                d16Var.l = i30;
                                                                i31 = d16Var.m;
                                                                if (i31 == -1) {
                                                                    i31 = d16Var.k;
                                                                }
                                                                d16Var.m = i31;
                                                            } else {
                                                                i27 = -1;
                                                            }
                                                            i28 = d16Var.l;
                                                            if (i28 != i27) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (d16Var.q) {
                                                                if (d16Var.w != -1.0f) {
                                                                    bArr5 = null;
                                                                } else {
                                                                    bArr5 = null;
                                                                }
                                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                            } else {
                                                                zzbaqVar = null;
                                                            }
                                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                            i26 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str11)) {
                                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                            } else {
                                                                if ("application/vobsub".equals(str11)) {
                                                                }
                                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                            }
                                                            i26 = 3;
                                                        }
                                                        zzave zzaveVarZzbi11110 = zzauwVar.zzbi(d16Var.b, i26);
                                                        d16Var.O = zzaveVarZzbi11110;
                                                        zzaveVarZzbi11110.zza(zzassVarZzi);
                                                        zzavnVar5 = zzavnVar6;
                                                        d16 d16Var11111 = zzavnVar5.s;
                                                        sparseArray.put(d16Var11111.b, d16Var11111);
                                                        zzavnVar5.s = null;
                                                    } else {
                                                        i15 += 255;
                                                        i13++;
                                                    }
                                                }
                                            } else {
                                                i11 += 255;
                                                i10++;
                                            }
                                            break;
                                        }
                                        break;
                                    case 11:
                                        arrayList = new ArrayList(3);
                                        arrayList.add(d16Var.h);
                                        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(d16Var.J).array());
                                        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(d16Var.K).array());
                                        str9 = "audio/opus";
                                        i21 = 5760;
                                        String str16 = str9;
                                        arrayList2 = arrayList;
                                        str10 = str16;
                                        str11 = str10;
                                        list2 = arrayList2;
                                        i22 = i21;
                                        i23 = -1;
                                        boolean z11116 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z11116 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi11111 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi11111;
                                        zzaveVarZzbi11111.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var11112 = zzavnVar5.s;
                                        sparseArray.put(d16Var11112.b, d16Var11112);
                                        zzavnVar5.s = null;
                                        break;
                                    case 12:
                                        listSingletonList = Collections.singletonList(d16Var.h);
                                        str7 = "audio/mp4a-latm";
                                        list3 = listSingletonList;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z11117 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z11117 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi11112 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi11112;
                                        zzaveVarZzbi11112.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var11113 = zzavnVar5.s;
                                        sparseArray.put(d16Var11113.b, d16Var11113);
                                        zzavnVar5.s = null;
                                        break;
                                    case 13:
                                        str10 = "audio/mpeg-L2";
                                        arrayList2 = null;
                                        i21 = 4096;
                                        str11 = str10;
                                        list2 = arrayList2;
                                        i22 = i21;
                                        i23 = -1;
                                        boolean z11118 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z11118 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi11113 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi11113;
                                        zzaveVarZzbi11113.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var11114 = zzavnVar5.s;
                                        sparseArray.put(d16Var11114.b, d16Var11114);
                                        zzavnVar5.s = null;
                                        break;
                                    case 14:
                                        str10 = "audio/mpeg";
                                        arrayList2 = null;
                                        i21 = 4096;
                                        str11 = str10;
                                        list2 = arrayList2;
                                        i22 = i21;
                                        i23 = -1;
                                        boolean z11119 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z11119 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi11114 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi11114;
                                        zzaveVarZzbi11114.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var11115 = zzavnVar5.s;
                                        sparseArray.put(d16Var11115.b, d16Var11115);
                                        zzavnVar5.s = null;
                                        break;
                                    case 15:
                                        str7 = "audio/ac3";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z111110 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z111110 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi11115 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi11115;
                                        zzaveVarZzbi11115.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var11116 = zzavnVar5.s;
                                        sparseArray.put(d16Var11116.b, d16Var11116);
                                        zzavnVar5.s = null;
                                        break;
                                    case 16:
                                        str7 = "audio/eac3";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z111111 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z111111 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi11116 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi11116;
                                        zzaveVarZzbi11116.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var11117 = zzavnVar5.s;
                                        sparseArray.put(d16Var11117.b, d16Var11117);
                                        zzavnVar5.s = null;
                                        break;
                                    case 17:
                                        str7 = "audio/true-hd";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z111112 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z111112 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi11117 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi11117;
                                        zzaveVarZzbi11117.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var11118 = zzavnVar5.s;
                                        sparseArray.put(d16Var11118.b, d16Var11118);
                                        zzavnVar5.s = null;
                                        break;
                                    case 18:
                                    case 19:
                                        str7 = "audio/vnd.dts";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z111113 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z111113 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi11118 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi11118;
                                        zzaveVarZzbi11118.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var11119 = zzavnVar5.s;
                                        sparseArray.put(d16Var11119.b, d16Var11119);
                                        zzavnVar5.s = null;
                                        break;
                                    case 20:
                                        str7 = "audio/vnd.dts.hd";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z111114 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z111114 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi11119 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi11119;
                                        zzaveVarZzbi11119.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var111110 = zzavnVar5.s;
                                        sparseArray.put(d16Var111110.b, d16Var111110);
                                        zzavnVar5.s = null;
                                        break;
                                    case 21:
                                        listSingletonList = Collections.singletonList(d16Var.h);
                                        str7 = "audio/x-flac";
                                        list3 = listSingletonList;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z111115 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z111115 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi111110 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi111110;
                                        zzaveVarZzbi111110.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var111111 = zzavnVar5.s;
                                        sparseArray.put(d16Var111111.b, d16Var111111);
                                        zzavnVar5.s = null;
                                        break;
                                    case 22:
                                        zzbagVar2 = new zzbag(d16Var.h);
                                        iZzf = zzbagVar2.zzf();
                                        if (iZzf != 1) {
                                            if (iZzf == 65534) {
                                                zzbagVar2.zzv(24);
                                                jZzl = zzbagVar2.zzl();
                                                uuid = zzavn.b0;
                                                if (jZzl == uuid.getMostSignificantBits()) {
                                                }
                                            }
                                            z5 = false;
                                            if (z5) {
                                                iZzh = zzban.zzh(d16Var.H);
                                                if (iZzh != 0) {
                                                    str7 = "audio/raw";
                                                    list3 = null;
                                                    i23 = iZzh;
                                                    str11 = str7;
                                                    list2 = list3;
                                                    i22 = -1;
                                                    boolean z111116 = d16Var.M;
                                                    if (true != d16Var.L) {
                                                        i24 = 0;
                                                    } else {
                                                        i24 = 2;
                                                    }
                                                    i25 = (z111116 ? 1 : 0) | i24;
                                                    if (zzbad.zza(str11)) {
                                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                        i26 = 1;
                                                    } else if (zzbad.zzb(str11)) {
                                                        if (d16Var.n == 0) {
                                                            i30 = d16Var.l;
                                                            i27 = -1;
                                                            if (i30 == -1) {
                                                                i30 = d16Var.j;
                                                            }
                                                            d16Var.l = i30;
                                                            i31 = d16Var.m;
                                                            if (i31 == -1) {
                                                                i31 = d16Var.k;
                                                            }
                                                            d16Var.m = i31;
                                                        } else {
                                                            i27 = -1;
                                                        }
                                                        i28 = d16Var.l;
                                                        if (i28 != i27) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (d16Var.q) {
                                                            if (d16Var.w != -1.0f) {
                                                                bArr5 = null;
                                                            } else {
                                                                bArr5 = null;
                                                            }
                                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                        } else {
                                                            zzbaqVar = null;
                                                        }
                                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                        i26 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str11)) {
                                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                        } else {
                                                            if ("application/vobsub".equals(str11)) {
                                                            }
                                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                        }
                                                        i26 = 3;
                                                    }
                                                    zzave zzaveVarZzbi111111 = zzauwVar.zzbi(d16Var.b, i26);
                                                    d16Var.O = zzaveVarZzbi111111;
                                                    zzaveVarZzbi111111.zza(zzassVarZzi);
                                                    zzavnVar5 = zzavnVar6;
                                                    d16 d16Var111112 = zzavnVar5.s;
                                                    sparseArray.put(d16Var111112.b, d16Var111112);
                                                    zzavnVar5.s = null;
                                                } else {
                                                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                                }
                                            } else {
                                                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                            }
                                            str8 = "audio/x-unknown";
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z111117 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z111117 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi111112 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi111112;
                                            zzaveVarZzbi111112.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var111113 = zzavnVar5.s;
                                            sparseArray.put(d16Var111113.b, d16Var111113);
                                            zzavnVar5.s = null;
                                            break;
                                        }
                                        z5 = true;
                                        if (z5) {
                                            iZzh = zzban.zzh(d16Var.H);
                                            if (iZzh != 0) {
                                                str7 = "audio/raw";
                                                list3 = null;
                                                i23 = iZzh;
                                                str11 = str7;
                                                list2 = list3;
                                                i22 = -1;
                                                boolean z111118 = d16Var.M;
                                                if (true != d16Var.L) {
                                                    i24 = 0;
                                                } else {
                                                    i24 = 2;
                                                }
                                                i25 = (z111118 ? 1 : 0) | i24;
                                                if (zzbad.zza(str11)) {
                                                    zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                    i26 = 1;
                                                } else if (zzbad.zzb(str11)) {
                                                    if (d16Var.n == 0) {
                                                        i30 = d16Var.l;
                                                        i27 = -1;
                                                        if (i30 == -1) {
                                                            i30 = d16Var.j;
                                                        }
                                                        d16Var.l = i30;
                                                        i31 = d16Var.m;
                                                        if (i31 == -1) {
                                                            i31 = d16Var.k;
                                                        }
                                                        d16Var.m = i31;
                                                    } else {
                                                        i27 = -1;
                                                    }
                                                    i28 = d16Var.l;
                                                    if (i28 != i27) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (d16Var.q) {
                                                        if (d16Var.w != -1.0f) {
                                                            bArr5 = null;
                                                        } else {
                                                            bArr5 = null;
                                                        }
                                                        zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                    } else {
                                                        zzbaqVar = null;
                                                    }
                                                    zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                    i26 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str11)) {
                                                        zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                    } else {
                                                        if ("application/vobsub".equals(str11)) {
                                                        }
                                                        zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                    }
                                                    i26 = 3;
                                                }
                                                zzave zzaveVarZzbi111113 = zzauwVar.zzbi(d16Var.b, i26);
                                                d16Var.O = zzaveVarZzbi111113;
                                                zzaveVarZzbi111113.zza(zzassVarZzi);
                                                zzavnVar5 = zzavnVar6;
                                                d16 d16Var111114 = zzavnVar5.s;
                                                sparseArray.put(d16Var111114.b, d16Var111114);
                                                zzavnVar5.s = null;
                                            } else {
                                                Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                            }
                                        } else {
                                            Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                        }
                                        str8 = "audio/x-unknown";
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z111119 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z111119 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi111114 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi111114;
                                        zzaveVarZzbi111114.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var111115 = zzavnVar5.s;
                                        sparseArray.put(d16Var111115.b, d16Var111115);
                                        zzavnVar5.s = null;
                                        break;
                                    case 23:
                                        iZzh = zzban.zzh(d16Var.H);
                                        if (iZzh == 0) {
                                            Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                            str8 = "audio/x-unknown";
                                            list = null;
                                            list3 = list;
                                            str7 = str8;
                                            iZzh = -1;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z1111110 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z1111110 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi111115 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi111115;
                                            zzaveVarZzbi111115.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var111116 = zzavnVar5.s;
                                            sparseArray.put(d16Var111116.b, d16Var111116);
                                            zzavnVar5.s = null;
                                        } else {
                                            str7 = "audio/raw";
                                            list3 = null;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z1111111 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z1111111 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi111116 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi111116;
                                            zzaveVarZzbi111116.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var111117 = zzavnVar5.s;
                                            sparseArray.put(d16Var111117.b, d16Var111117);
                                            zzavnVar5.s = null;
                                        }
                                        break;
                                    case 24:
                                        str7 = "application/x-subrip";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z1111112 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z1111112 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi111117 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi111117;
                                        zzaveVarZzbi111117.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var111118 = zzavnVar5.s;
                                        sparseArray.put(d16Var111118.b, d16Var111118);
                                        zzavnVar5.s = null;
                                        break;
                                    case 25:
                                        listSingletonList = Collections.singletonList(d16Var.h);
                                        str7 = "application/vobsub";
                                        list3 = listSingletonList;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z1111113 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z1111113 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi111118 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi111118;
                                        zzaveVarZzbi111118.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var111119 = zzavnVar5.s;
                                        sparseArray.put(d16Var111119.b, d16Var111119);
                                        zzavnVar5.s = null;
                                        break;
                                    case 26:
                                        str7 = "application/pgs";
                                        str8 = str7;
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z1111114 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z1111114 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi111119 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi111119;
                                        zzaveVarZzbi111119.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var1111110 = zzavnVar5.s;
                                        sparseArray.put(d16Var1111110.b, d16Var1111110);
                                        zzavnVar5.s = null;
                                        break;
                                    case 27:
                                        byte[] bArr9 = d16Var.h;
                                        listSingletonList = Collections.singletonList(new byte[]{bArr9[0], bArr9[1], bArr9[2], bArr9[3]});
                                        str7 = "application/dvbsubs";
                                        list3 = listSingletonList;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z1111115 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z1111115 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi1111110 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi1111110;
                                        zzaveVarZzbi1111110.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var1111111 = zzavnVar5.s;
                                        sparseArray.put(d16Var1111111.b, d16Var1111111);
                                        zzavnVar5.s = null;
                                        break;
                                    default:
                                        throw new zzasv("Unrecognized codec identifier.");
                                }
                            }
                            obj2 = "V_MPEG4/ISO/AP";
                            str3 = "S_HDMV/PGS";
                            str4 = "S_DVBSUB";
                            obj3 = "V_MPEG4/ISO/SP";
                            str5 = "S_VOBSUB";
                            obj4 = "A_MS/ACM";
                            d16Var = zzavnVar6.s;
                            zzauwVar = zzavnVar6.X;
                            i9 = d16Var.b;
                            str6 = d16Var.a;
                            switch (str6.hashCode()) {
                                case -2095576542:
                                    if (str6.equals(obj2)) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -2095575984:
                                    if (str6.equals(obj3)) {
                                        b = 3;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1985379776:
                                    if (str6.equals(obj4)) {
                                        b = 22;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1784763192:
                                    if (str6.equals("A_TRUEHD")) {
                                        b = 17;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1730367663:
                                    if (str6.equals("A_VORBIS")) {
                                        b = 10;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1482641358:
                                    if (str6.equals("A_MPEG/L2")) {
                                        b = 13;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1482641357:
                                    if (str6.equals("A_MPEG/L3")) {
                                        b = 14;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1373388978:
                                    if (str6.equals("V_MS/VFW/FOURCC")) {
                                        b = 8;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -933872740:
                                    if (str6.equals(str4)) {
                                        b = 27;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -538363189:
                                    if (str6.equals("V_MPEG4/ISO/ASP")) {
                                        b = 4;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -538363109:
                                    if (str6.equals("V_MPEG4/ISO/AVC")) {
                                        b = 6;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -425012669:
                                    if (str6.equals(str5)) {
                                        b = 25;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -356037306:
                                    if (str6.equals(str2)) {
                                        b = 20;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 62923557:
                                    if (str6.equals("A_AAC")) {
                                        b = 12;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 62923603:
                                    if (str6.equals("A_AC3")) {
                                        b = 15;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 62927045:
                                    if (str6.equals("A_DTS")) {
                                        b = 18;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 82338133:
                                    if (str6.equals("V_VP8")) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 82338134:
                                    if (str6.equals("V_VP9")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 99146302:
                                    if (str6.equals(str3)) {
                                        b = 26;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 444813526:
                                    if (str6.equals("V_THEORA")) {
                                        b = 9;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 542569478:
                                    if (str6.equals("A_DTS/EXPRESS")) {
                                        b = 19;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 725957860:
                                    if (str6.equals("A_PCM/INT/LIT")) {
                                        b = 23;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 855502857:
                                    if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                        b = 7;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1422270023:
                                    if (str6.equals("S_TEXT/UTF8")) {
                                        b = 24;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1809237540:
                                    if (str6.equals("V_MPEG2")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1950749482:
                                    if (str6.equals("A_EAC3")) {
                                        b = 16;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1950789798:
                                    if (str6.equals("A_FLAC")) {
                                        b = 21;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1951062397:
                                    if (str6.equals("A_OPUS")) {
                                        b = 11;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            str7 = "video/x-unknown";
                            switch (b) {
                                case 0:
                                    str7 = "video/x-vnd.on2.vp8";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z1111116 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z1111116 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi1111111 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi1111111;
                                    zzaveVarZzbi1111111.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var1111112 = zzavnVar5.s;
                                    sparseArray.put(d16Var1111112.b, d16Var1111112);
                                    zzavnVar5.s = null;
                                    break;
                                case 1:
                                    str7 = "video/x-vnd.on2.vp9";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z1111117 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z1111117 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi1111112 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi1111112;
                                    zzaveVarZzbi1111112.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var1111113 = zzavnVar5.s;
                                    sparseArray.put(d16Var1111113.b, d16Var1111113);
                                    zzavnVar5.s = null;
                                    break;
                                case 2:
                                    str7 = "video/mpeg2";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z1111118 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z1111118 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi1111113 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi1111113;
                                    zzaveVarZzbi1111113.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var1111114 = zzavnVar5.s;
                                    sparseArray.put(d16Var1111114.b, d16Var1111114);
                                    zzavnVar5.s = null;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    bArr = d16Var.h;
                                    if (bArr == null) {
                                        listSingletonList = null;
                                    } else {
                                        listSingletonList = Collections.singletonList(bArr);
                                    }
                                    str7 = "video/mp4v-es";
                                    list3 = listSingletonList;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z1111119 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z1111119 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi1111114 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi1111114;
                                    zzaveVarZzbi1111114.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var1111115 = zzavnVar5.s;
                                    sparseArray.put(d16Var1111115.b, d16Var1111115);
                                    zzavnVar5.s = null;
                                    break;
                                case 6:
                                    zzbao zzbaoVarZza3 = zzbao.zza(new zzbag(d16Var.h));
                                    list = zzbaoVarZza3.zza;
                                    d16Var.P = zzbaoVarZza3.zzb;
                                    str8 = "video/avc";
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z11111110 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z11111110 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi1111115 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi1111115;
                                    zzaveVarZzbi1111115.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var1111116 = zzavnVar5.s;
                                    sparseArray.put(d16Var1111116.b, d16Var1111116);
                                    zzavnVar5.s = null;
                                    break;
                                case 7:
                                    zzbau zzbauVarZza3 = zzbau.zza(new zzbag(d16Var.h));
                                    list = zzbauVarZza3.zza;
                                    d16Var.P = zzbauVarZza3.zzb;
                                    str8 = "video/hevc";
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z11111111 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z11111111 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi1111116 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi1111116;
                                    zzaveVarZzbi1111116.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var1111117 = zzavnVar5.s;
                                    sparseArray.put(d16Var1111117.b, d16Var1111117);
                                    zzavnVar5.s = null;
                                    break;
                                case 8:
                                    zzbagVar = new zzbag(d16Var.h);
                                    zzbagVar.zzw(16);
                                    if (zzbagVar.zzk() != 826496599) {
                                        listSingletonList = null;
                                    } else {
                                        iZzc = zzbagVar.zzc() + 20;
                                        bArr2 = zzbagVar.zza;
                                        while (true) {
                                            length = bArr2.length;
                                            if (iZzc >= length - 4) {
                                                throw new zzasv("Failed to find FourCC VC1 initialization data");
                                            }
                                            if (bArr2[iZzc] != 0) {
                                            }
                                            iZzc++;
                                        }
                                    }
                                    if (listSingletonList != null) {
                                        str7 = "video/wvc1";
                                    } else {
                                        Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                                    }
                                    list3 = listSingletonList;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z11111112 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z11111112 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi1111117 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi1111117;
                                    zzaveVarZzbi1111117.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var1111118 = zzavnVar5.s;
                                    sparseArray.put(d16Var1111118.b, d16Var1111118);
                                    zzavnVar5.s = null;
                                    break;
                                case 9:
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z11111113 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z11111113 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi1111118 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi1111118;
                                    zzaveVarZzbi1111118.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var1111119 = zzavnVar5.s;
                                    sparseArray.put(d16Var1111119.b, d16Var1111119);
                                    zzavnVar5.s = null;
                                    break;
                                case 10:
                                    bArr3 = d16Var.h;
                                    if (bArr3[0] != 2) {
                                        throw new zzasv("Error parsing vorbis codec private");
                                    }
                                    i10 = 1;
                                    i11 = 0;
                                    while (true) {
                                        i12 = bArr3[i10];
                                        if (i12 != -1) {
                                            i13 = i10 + 1;
                                            i14 = i11 + i12;
                                            i15 = 0;
                                            while (true) {
                                                i16 = bArr3[i13];
                                                if (i16 != -1) {
                                                    i17 = i13 + 1;
                                                    i18 = i15 + i16;
                                                    if (bArr3[i17] != 1) {
                                                        throw new zzasv("Error parsing vorbis codec private");
                                                    }
                                                    bArr4 = new byte[i14];
                                                    System.arraycopy(bArr3, i17, bArr4, 0, i14);
                                                    i19 = i17 + i14;
                                                    if (bArr3[i19] != 3) {
                                                        throw new zzasv("Error parsing vorbis codec private");
                                                    }
                                                    i20 = i19 + i18;
                                                    if (bArr3[i20] != 5) {
                                                        throw new zzasv("Error parsing vorbis codec private");
                                                    }
                                                    int length4 = bArr3.length - i20;
                                                    byte[] bArr10 = new byte[length4];
                                                    System.arraycopy(bArr3, i20, bArr10, 0, length4);
                                                    arrayList = new ArrayList(2);
                                                    arrayList.add(bArr4);
                                                    arrayList.add(bArr10);
                                                    str9 = "audio/vorbis";
                                                    i21 = 8192;
                                                    String str17 = str9;
                                                    arrayList2 = arrayList;
                                                    str10 = str17;
                                                    str11 = str10;
                                                    list2 = arrayList2;
                                                    i22 = i21;
                                                    i23 = -1;
                                                    boolean z11111114 = d16Var.M;
                                                    if (true != d16Var.L) {
                                                        i24 = 0;
                                                    } else {
                                                        i24 = 2;
                                                    }
                                                    i25 = (z11111114 ? 1 : 0) | i24;
                                                    if (zzbad.zza(str11)) {
                                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                        i26 = 1;
                                                    } else if (zzbad.zzb(str11)) {
                                                        if (d16Var.n == 0) {
                                                            i30 = d16Var.l;
                                                            i27 = -1;
                                                            if (i30 == -1) {
                                                                i30 = d16Var.j;
                                                            }
                                                            d16Var.l = i30;
                                                            i31 = d16Var.m;
                                                            if (i31 == -1) {
                                                                i31 = d16Var.k;
                                                            }
                                                            d16Var.m = i31;
                                                        } else {
                                                            i27 = -1;
                                                        }
                                                        i28 = d16Var.l;
                                                        if (i28 != i27) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (d16Var.q) {
                                                            if (d16Var.w != -1.0f) {
                                                                bArr5 = null;
                                                            } else {
                                                                bArr5 = null;
                                                            }
                                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                        } else {
                                                            zzbaqVar = null;
                                                        }
                                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                        i26 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str11)) {
                                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                        } else {
                                                            if ("application/vobsub".equals(str11)) {
                                                            }
                                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                        }
                                                        i26 = 3;
                                                    }
                                                    zzave zzaveVarZzbi1111119 = zzauwVar.zzbi(d16Var.b, i26);
                                                    d16Var.O = zzaveVarZzbi1111119;
                                                    zzaveVarZzbi1111119.zza(zzassVarZzi);
                                                    zzavnVar5 = zzavnVar6;
                                                    d16 d16Var11111110 = zzavnVar5.s;
                                                    sparseArray.put(d16Var11111110.b, d16Var11111110);
                                                    zzavnVar5.s = null;
                                                } else {
                                                    i15 += 255;
                                                    i13++;
                                                }
                                            }
                                        } else {
                                            i11 += 255;
                                            i10++;
                                        }
                                        break;
                                    }
                                    break;
                                case 11:
                                    arrayList = new ArrayList(3);
                                    arrayList.add(d16Var.h);
                                    arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(d16Var.J).array());
                                    arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(d16Var.K).array());
                                    str9 = "audio/opus";
                                    i21 = 5760;
                                    String str18 = str9;
                                    arrayList2 = arrayList;
                                    str10 = str18;
                                    str11 = str10;
                                    list2 = arrayList2;
                                    i22 = i21;
                                    i23 = -1;
                                    boolean z11111115 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z11111115 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111110 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111110;
                                    zzaveVarZzbi11111110.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var11111111 = zzavnVar5.s;
                                    sparseArray.put(d16Var11111111.b, d16Var11111111);
                                    zzavnVar5.s = null;
                                    break;
                                case 12:
                                    listSingletonList = Collections.singletonList(d16Var.h);
                                    str7 = "audio/mp4a-latm";
                                    list3 = listSingletonList;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z11111116 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z11111116 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111111 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111111;
                                    zzaveVarZzbi11111111.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var11111112 = zzavnVar5.s;
                                    sparseArray.put(d16Var11111112.b, d16Var11111112);
                                    zzavnVar5.s = null;
                                    break;
                                case 13:
                                    str10 = "audio/mpeg-L2";
                                    arrayList2 = null;
                                    i21 = 4096;
                                    str11 = str10;
                                    list2 = arrayList2;
                                    i22 = i21;
                                    i23 = -1;
                                    boolean z11111117 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z11111117 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111112 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111112;
                                    zzaveVarZzbi11111112.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var11111113 = zzavnVar5.s;
                                    sparseArray.put(d16Var11111113.b, d16Var11111113);
                                    zzavnVar5.s = null;
                                    break;
                                case 14:
                                    str10 = "audio/mpeg";
                                    arrayList2 = null;
                                    i21 = 4096;
                                    str11 = str10;
                                    list2 = arrayList2;
                                    i22 = i21;
                                    i23 = -1;
                                    boolean z11111118 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z11111118 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111113 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111113;
                                    zzaveVarZzbi11111113.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var11111114 = zzavnVar5.s;
                                    sparseArray.put(d16Var11111114.b, d16Var11111114);
                                    zzavnVar5.s = null;
                                    break;
                                case 15:
                                    str7 = "audio/ac3";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z11111119 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z11111119 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111114 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111114;
                                    zzaveVarZzbi11111114.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var11111115 = zzavnVar5.s;
                                    sparseArray.put(d16Var11111115.b, d16Var11111115);
                                    zzavnVar5.s = null;
                                    break;
                                case 16:
                                    str7 = "audio/eac3";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z111111110 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z111111110 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111115 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111115;
                                    zzaveVarZzbi11111115.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var11111116 = zzavnVar5.s;
                                    sparseArray.put(d16Var11111116.b, d16Var11111116);
                                    zzavnVar5.s = null;
                                    break;
                                case 17:
                                    str7 = "audio/true-hd";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z111111111 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z111111111 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111116 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111116;
                                    zzaveVarZzbi11111116.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var11111117 = zzavnVar5.s;
                                    sparseArray.put(d16Var11111117.b, d16Var11111117);
                                    zzavnVar5.s = null;
                                    break;
                                case 18:
                                case 19:
                                    str7 = "audio/vnd.dts";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z111111112 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z111111112 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111117 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111117;
                                    zzaveVarZzbi11111117.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var11111118 = zzavnVar5.s;
                                    sparseArray.put(d16Var11111118.b, d16Var11111118);
                                    zzavnVar5.s = null;
                                    break;
                                case 20:
                                    str7 = "audio/vnd.dts.hd";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z111111113 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z111111113 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111118 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111118;
                                    zzaveVarZzbi11111118.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var11111119 = zzavnVar5.s;
                                    sparseArray.put(d16Var11111119.b, d16Var11111119);
                                    zzavnVar5.s = null;
                                    break;
                                case 21:
                                    listSingletonList = Collections.singletonList(d16Var.h);
                                    str7 = "audio/x-flac";
                                    list3 = listSingletonList;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z111111114 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z111111114 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi11111119 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi11111119;
                                    zzaveVarZzbi11111119.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var111111110 = zzavnVar5.s;
                                    sparseArray.put(d16Var111111110.b, d16Var111111110);
                                    zzavnVar5.s = null;
                                    break;
                                case 22:
                                    zzbagVar2 = new zzbag(d16Var.h);
                                    iZzf = zzbagVar2.zzf();
                                    if (iZzf != 1) {
                                        if (iZzf == 65534) {
                                            zzbagVar2.zzv(24);
                                            jZzl = zzbagVar2.zzl();
                                            uuid = zzavn.b0;
                                            if (jZzl == uuid.getMostSignificantBits()) {
                                            }
                                        }
                                        z5 = false;
                                        if (z5) {
                                            iZzh = zzban.zzh(d16Var.H);
                                            if (iZzh != 0) {
                                                str7 = "audio/raw";
                                                list3 = null;
                                                i23 = iZzh;
                                                str11 = str7;
                                                list2 = list3;
                                                i22 = -1;
                                                boolean z111111115 = d16Var.M;
                                                if (true != d16Var.L) {
                                                    i24 = 0;
                                                } else {
                                                    i24 = 2;
                                                }
                                                i25 = (z111111115 ? 1 : 0) | i24;
                                                if (zzbad.zza(str11)) {
                                                    zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                    i26 = 1;
                                                } else if (zzbad.zzb(str11)) {
                                                    if (d16Var.n == 0) {
                                                        i30 = d16Var.l;
                                                        i27 = -1;
                                                        if (i30 == -1) {
                                                            i30 = d16Var.j;
                                                        }
                                                        d16Var.l = i30;
                                                        i31 = d16Var.m;
                                                        if (i31 == -1) {
                                                            i31 = d16Var.k;
                                                        }
                                                        d16Var.m = i31;
                                                    } else {
                                                        i27 = -1;
                                                    }
                                                    i28 = d16Var.l;
                                                    if (i28 != i27) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (d16Var.q) {
                                                        if (d16Var.w != -1.0f) {
                                                            bArr5 = null;
                                                        } else {
                                                            bArr5 = null;
                                                        }
                                                        zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                    } else {
                                                        zzbaqVar = null;
                                                    }
                                                    zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                    i26 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str11)) {
                                                        zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                    } else {
                                                        if ("application/vobsub".equals(str11)) {
                                                        }
                                                        zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                    }
                                                    i26 = 3;
                                                }
                                                zzave zzaveVarZzbi111111110 = zzauwVar.zzbi(d16Var.b, i26);
                                                d16Var.O = zzaveVarZzbi111111110;
                                                zzaveVarZzbi111111110.zza(zzassVarZzi);
                                                zzavnVar5 = zzavnVar6;
                                                d16 d16Var111111111 = zzavnVar5.s;
                                                sparseArray.put(d16Var111111111.b, d16Var111111111);
                                                zzavnVar5.s = null;
                                            } else {
                                                Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                            }
                                        } else {
                                            Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                        }
                                        str8 = "audio/x-unknown";
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z111111116 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z111111116 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi111111111 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi111111111;
                                        zzaveVarZzbi111111111.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var111111112 = zzavnVar5.s;
                                        sparseArray.put(d16Var111111112.b, d16Var111111112);
                                        zzavnVar5.s = null;
                                        break;
                                    }
                                    z5 = true;
                                    if (z5) {
                                        iZzh = zzban.zzh(d16Var.H);
                                        if (iZzh != 0) {
                                            str7 = "audio/raw";
                                            list3 = null;
                                            i23 = iZzh;
                                            str11 = str7;
                                            list2 = list3;
                                            i22 = -1;
                                            boolean z111111117 = d16Var.M;
                                            if (true != d16Var.L) {
                                                i24 = 0;
                                            } else {
                                                i24 = 2;
                                            }
                                            i25 = (z111111117 ? 1 : 0) | i24;
                                            if (zzbad.zza(str11)) {
                                                zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                                i26 = 1;
                                            } else if (zzbad.zzb(str11)) {
                                                if (d16Var.n == 0) {
                                                    i30 = d16Var.l;
                                                    i27 = -1;
                                                    if (i30 == -1) {
                                                        i30 = d16Var.j;
                                                    }
                                                    d16Var.l = i30;
                                                    i31 = d16Var.m;
                                                    if (i31 == -1) {
                                                        i31 = d16Var.k;
                                                    }
                                                    d16Var.m = i31;
                                                } else {
                                                    i27 = -1;
                                                }
                                                i28 = d16Var.l;
                                                if (i28 != i27) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (d16Var.q) {
                                                    if (d16Var.w != -1.0f) {
                                                        bArr5 = null;
                                                    } else {
                                                        bArr5 = null;
                                                    }
                                                    zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                                } else {
                                                    zzbaqVar = null;
                                                }
                                                zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                                i26 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str11)) {
                                                    zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                                } else {
                                                    if ("application/vobsub".equals(str11)) {
                                                    }
                                                    zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                                }
                                                i26 = 3;
                                            }
                                            zzave zzaveVarZzbi111111112 = zzauwVar.zzbi(d16Var.b, i26);
                                            d16Var.O = zzaveVarZzbi111111112;
                                            zzaveVarZzbi111111112.zza(zzassVarZzi);
                                            zzavnVar5 = zzavnVar6;
                                            d16 d16Var111111113 = zzavnVar5.s;
                                            sparseArray.put(d16Var111111113.b, d16Var111111113);
                                            zzavnVar5.s = null;
                                        } else {
                                            Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                        }
                                    } else {
                                        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                    }
                                    str8 = "audio/x-unknown";
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z111111118 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z111111118 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi111111113 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi111111113;
                                    zzaveVarZzbi111111113.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var111111114 = zzavnVar5.s;
                                    sparseArray.put(d16Var111111114.b, d16Var111111114);
                                    zzavnVar5.s = null;
                                    break;
                                case 23:
                                    iZzh = zzban.zzh(d16Var.H);
                                    if (iZzh == 0) {
                                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + d16Var.H + ". Setting mimeType to audio/x-unknown");
                                        str8 = "audio/x-unknown";
                                        list = null;
                                        list3 = list;
                                        str7 = str8;
                                        iZzh = -1;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z111111119 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z111111119 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi111111114 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi111111114;
                                        zzaveVarZzbi111111114.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var111111115 = zzavnVar5.s;
                                        sparseArray.put(d16Var111111115.b, d16Var111111115);
                                        zzavnVar5.s = null;
                                    } else {
                                        str7 = "audio/raw";
                                        list3 = null;
                                        i23 = iZzh;
                                        str11 = str7;
                                        list2 = list3;
                                        i22 = -1;
                                        boolean z1111111110 = d16Var.M;
                                        if (true != d16Var.L) {
                                            i24 = 0;
                                        } else {
                                            i24 = 2;
                                        }
                                        i25 = (z1111111110 ? 1 : 0) | i24;
                                        if (zzbad.zza(str11)) {
                                            zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                            i26 = 1;
                                        } else if (zzbad.zzb(str11)) {
                                            if (d16Var.n == 0) {
                                                i30 = d16Var.l;
                                                i27 = -1;
                                                if (i30 == -1) {
                                                    i30 = d16Var.j;
                                                }
                                                d16Var.l = i30;
                                                i31 = d16Var.m;
                                                if (i31 == -1) {
                                                    i31 = d16Var.k;
                                                }
                                                d16Var.m = i31;
                                            } else {
                                                i27 = -1;
                                            }
                                            i28 = d16Var.l;
                                            if (i28 != i27) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (d16Var.q) {
                                                if (d16Var.w != -1.0f) {
                                                    bArr5 = null;
                                                } else {
                                                    bArr5 = null;
                                                }
                                                zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                            } else {
                                                zzbaqVar = null;
                                            }
                                            zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                            i26 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                                zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str11)) {
                                                }
                                                zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                            }
                                            i26 = 3;
                                        }
                                        zzave zzaveVarZzbi111111115 = zzauwVar.zzbi(d16Var.b, i26);
                                        d16Var.O = zzaveVarZzbi111111115;
                                        zzaveVarZzbi111111115.zza(zzassVarZzi);
                                        zzavnVar5 = zzavnVar6;
                                        d16 d16Var111111116 = zzavnVar5.s;
                                        sparseArray.put(d16Var111111116.b, d16Var111111116);
                                        zzavnVar5.s = null;
                                    }
                                    break;
                                case 24:
                                    str7 = "application/x-subrip";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z1111111111 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z1111111111 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi111111116 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi111111116;
                                    zzaveVarZzbi111111116.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var111111117 = zzavnVar5.s;
                                    sparseArray.put(d16Var111111117.b, d16Var111111117);
                                    zzavnVar5.s = null;
                                    break;
                                case 25:
                                    listSingletonList = Collections.singletonList(d16Var.h);
                                    str7 = "application/vobsub";
                                    list3 = listSingletonList;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z1111111112 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z1111111112 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi111111117 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi111111117;
                                    zzaveVarZzbi111111117.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var111111118 = zzavnVar5.s;
                                    sparseArray.put(d16Var111111118.b, d16Var111111118);
                                    zzavnVar5.s = null;
                                    break;
                                case 26:
                                    str7 = "application/pgs";
                                    str8 = str7;
                                    list = null;
                                    list3 = list;
                                    str7 = str8;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z1111111113 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z1111111113 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi111111118 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi111111118;
                                    zzaveVarZzbi111111118.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var111111119 = zzavnVar5.s;
                                    sparseArray.put(d16Var111111119.b, d16Var111111119);
                                    zzavnVar5.s = null;
                                    break;
                                case 27:
                                    byte[] bArr11 = d16Var.h;
                                    listSingletonList = Collections.singletonList(new byte[]{bArr11[0], bArr11[1], bArr11[2], bArr11[3]});
                                    str7 = "application/dvbsubs";
                                    list3 = listSingletonList;
                                    iZzh = -1;
                                    i23 = iZzh;
                                    str11 = str7;
                                    list2 = list3;
                                    i22 = -1;
                                    boolean z1111111114 = d16Var.M;
                                    if (true != d16Var.L) {
                                        i24 = 0;
                                    } else {
                                        i24 = 2;
                                    }
                                    i25 = (z1111111114 ? 1 : 0) | i24;
                                    if (zzbad.zza(str11)) {
                                        zzassVarZzi = zzass.zzh(Integer.toString(i9), str11, null, -1, i22, d16Var.G, d16Var.I, i23, -1, -1, list2, d16Var.i, i25, d16Var.N, null);
                                        i26 = 1;
                                    } else if (zzbad.zzb(str11)) {
                                        if (d16Var.n == 0) {
                                            i30 = d16Var.l;
                                            i27 = -1;
                                            if (i30 == -1) {
                                                i30 = d16Var.j;
                                            }
                                            d16Var.l = i30;
                                            i31 = d16Var.m;
                                            if (i31 == -1) {
                                                i31 = d16Var.k;
                                            }
                                            d16Var.m = i31;
                                        } else {
                                            i27 = -1;
                                        }
                                        i28 = d16Var.l;
                                        if (i28 != i27) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (d16Var.q) {
                                            if (d16Var.w != -1.0f) {
                                                bArr5 = null;
                                            } else {
                                                bArr5 = null;
                                            }
                                            zzbaqVar = new zzbaq(d16Var.r, d16Var.t, d16Var.s, bArr5);
                                        } else {
                                            zzbaqVar = null;
                                        }
                                        zzassVarZzi = zzass.zzl(Integer.toString(i9), str11, null, -1, i22, d16Var.j, d16Var.k, -1.0f, list2, -1, f, d16Var.o, d16Var.p, zzbaqVar, d16Var.i);
                                        i26 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str11)) {
                                            zzassVarZzi = zzass.zzk(Integer.toString(i9), str11, null, -1, i25, d16Var.N, -1, d16Var.i, Long.MAX_VALUE, Collections.emptyList());
                                        } else {
                                            if ("application/vobsub".equals(str11)) {
                                            }
                                            zzassVarZzi = zzass.zzi(Integer.toString(i9), str11, null, -1, list2, d16Var.N, d16Var.i);
                                        }
                                        i26 = 3;
                                    }
                                    zzave zzaveVarZzbi111111119 = zzauwVar.zzbi(d16Var.b, i26);
                                    d16Var.O = zzaveVarZzbi111111119;
                                    zzaveVarZzbi111111119.zza(zzassVarZzi);
                                    zzavnVar5 = zzavnVar6;
                                    d16 d16Var1111111110 = zzavnVar5.s;
                                    sparseArray.put(d16Var1111111110.b, d16Var1111111110);
                                    zzavnVar5.s = null;
                                    break;
                                default:
                                    throw new zzasv("Unrecognized codec identifier.");
                            }
                        } else {
                            if (i33 == 19899) {
                                int i34 = zzavnVar6.u;
                                if (i34 != -1) {
                                    long j9 = zzavnVar6.v;
                                    if (j9 != -1) {
                                        if (i34 == 475249515) {
                                            zzavnVar6.x = j9;
                                        }
                                    }
                                }
                                throw new zzasv("Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i33 == 25152) {
                                d16 d16Var20 = zzavnVar6.s;
                                if (d16Var20.e) {
                                    zzavd zzavdVar = d16Var20.g;
                                    if (zzavdVar == null) {
                                        throw new zzasv("Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    zzauq[] zzauqVarArr = new zzauq[i32];
                                    zzauqVarArr[r3 == true ? 1 : 0] = new zzauq(zzasd.zzb, "video/webm", zzavdVar.zzb, r3);
                                    d16Var20.i = new zzaur(zzauqVarArr);
                                }
                            } else if (i33 == 28032) {
                                d16 d16Var21 = zzavnVar6.s;
                                if (d16Var21.e && d16Var21.f != null) {
                                    throw new zzasv("Combining encryption and compression is not supported");
                                }
                            } else if (i33 == 357149030) {
                                if (zzavnVar6.p == -9223372036854775807L) {
                                    zzavnVar6.p = 1000000L;
                                }
                                long j10 = zzavnVar6.q;
                                if (j10 != -9223372036854775807L) {
                                    zzavnVar6.r = zzavnVar6.c(j10);
                                }
                            } else if (i33 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw new zzasv("No valid tracks were found");
                                }
                                zzavnVar6.X.zzb();
                            } else if (i33 == 475249515 && !zzavnVar6.t) {
                                zzauw zzauwVar2 = zzavnVar6.X;
                                if (zzavnVar6.o == -1 || zzavnVar6.r == -9223372036854775807L || (zzbabVar = zzavnVar6.A) == null || zzbabVar.zza() == 0 || (zzbabVar2 = zzavnVar6.B) == null || zzbabVar2.zza() != zzbabVar.zza()) {
                                    zzavnVar6.A = null;
                                    zzavnVar6.B = null;
                                    zzavbVar = new zzavb(zzavnVar6.r);
                                } else {
                                    int iZza = zzbabVar.zza();
                                    int[] iArr = new int[iZza];
                                    long[] jArr = new long[iZza];
                                    long[] jArr2 = new long[iZza];
                                    long[] jArr3 = new long[iZza];
                                    for (int i35 = 0; i35 < iZza; i35++) {
                                        jArr3[i35] = zzavnVar6.A.zzb(i35);
                                        jArr[i35] = zzavnVar6.B.zzb(i35) + zzavnVar6.o;
                                    }
                                    while (true) {
                                        int i36 = iZza - 1;
                                        if (r3 < i36) {
                                            int i37 = r3 + 1;
                                            iArr[r3] = (int) (jArr[i37] - jArr[r3]);
                                            jArr2[r3] = jArr3[i37] - jArr3[r3];
                                            r3 = i37;
                                        } else {
                                            iArr[i36] = (int) ((zzavnVar6.o + zzavnVar6.n) - jArr[i36]);
                                            jArr2[i36] = zzavnVar6.r - jArr3[i36];
                                            zzavnVar6.A = null;
                                            zzavnVar6.B = null;
                                            zzavbVar = new zzaut(iArr, jArr, jArr2, jArr3);
                                        }
                                    }
                                }
                                zzauwVar2.zzc(zzavbVar);
                                zzavnVar6.t = i32;
                            }
                        }
                    } else if (zzavnVar6.D == 2) {
                        if (!zzavnVar6.W) {
                            zzavnVar6.L |= 1;
                        }
                        zzavnVar6.d((d16) sparseArray.get(zzavnVar6.J), zzavnVar6.E);
                        zzavnVar6.D = 0;
                        return true;
                    }
                    return true;
                }
                z = false;
                z2 = true;
            }
            int i38 = c16Var.d;
            long j11 = 0;
            byte[] bArr12 = c16Var.a;
            f16 f16Var = c16Var.c;
            if (i38 == 0) {
                int i39 = 4;
                long jB = f16Var.b(zzauuVar, z2, z, 4);
                if (jB == -2) {
                    zzauuVar.zze();
                    ?? r4 = z;
                    while (true) {
                        zzauuVar.zzg(bArr12, r4, i39, r4);
                        byte b2 = bArr12[r4];
                        int i40 = 0;
                        do {
                            if (i40 < 8) {
                                j8 = f16.d[i40] & ((long) b2);
                                i40++;
                            } else {
                                i40 = -1;
                            }
                            if (i40 == -1 && i40 <= 4) {
                                int iA = (int) f16.a(false, i40, bArr12);
                                Object obj5 = c16Var.g.x;
                                zzaux zzauxVar = zzavn.zza;
                                if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                    z3 = false;
                                    zzauuVar.zzi(i40, false);
                                    jB = iA;
                                    z4 = true;
                                }
                            }
                            zzauuVar.zzi(1, false);
                            r4 = 0;
                            j11 = 0;
                            i39 = 4;
                        } while (j8 == j11);
                        if (i40 == -1) {
                        }
                        zzauuVar.zzi(1, false);
                        r4 = 0;
                        j11 = 0;
                        i39 = 4;
                    }
                } else {
                    z4 = true;
                    z3 = false;
                }
                if (jB == -1) {
                    return z3;
                }
                c16Var.e = (int) jB;
                c16Var.d = z4 ? 1 : 0;
            } else {
                z3 = false;
                if (i38 == 1) {
                    z4 = true;
                }
                sd6 sd6Var2 = c16Var.g;
                i = c16Var.e;
                obj = sd6Var2.x;
                zzavnVar = (zzavn) obj;
                zzaux zzauxVar2 = zzavn.zza;
                switch (i) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 241:
                    case 251:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 2352003:
                    case 2807729:
                        c = 2;
                        break;
                    case 134:
                    case 17026:
                    case 2274716:
                        c = 3;
                        break;
                    case 160:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        c = 1;
                        break;
                    case 161:
                    case 163:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        c = 4;
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                        c = 5;
                        break;
                    default:
                        c = 0;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        jZzd = zzauuVar.zzd();
                        stack.add(new b16(i, c16Var.f + jZzd));
                        sd6 sd6Var3 = c16Var.g;
                        i2 = c16Var.e;
                        j = c16Var.f;
                        zzavnVar2 = (zzavn) sd6Var3.x;
                        zzavnVar2.getClass();
                        if (i2 != 160) {
                            i3 = 0;
                            zzavnVar2.W = false;
                        } else if (i2 != 174) {
                            i3 = 0;
                            zzavnVar2.s = new d16(0);
                        } else if (i2 != 187) {
                            if (i2 != 19899) {
                                zzavnVar2.u = -1;
                                zzavnVar2.v = -1L;
                            } else if (i2 != 20533) {
                                zzavnVar2.s.e = true;
                            } else if (i2 != 21968) {
                                zzavnVar2.s.q = true;
                            } else if (i2 != 408125543) {
                                j2 = zzavnVar2.o;
                                if (j2 == -1 && j2 != jZzd) {
                                    throw new zzasv("Multiple Segment elements not supported");
                                }
                                zzavnVar2.o = jZzd;
                                zzavnVar2.n = j;
                            } else if (i2 != 475249515) {
                                zzavnVar2.A = new zzbab(32);
                                zzavnVar2.B = new zzbab(32);
                            } else if (i2 == 524531317 && !zzavnVar2.t) {
                                if (zzavnVar2.c || zzavnVar2.x == -1) {
                                    zzavnVar2.X.zzc(new zzavb(zzavnVar2.r));
                                    zzavnVar2.t = true;
                                } else {
                                    zzavnVar2.w = true;
                                }
                            }
                            i3 = 0;
                        } else {
                            i3 = 0;
                            zzavnVar2.C = false;
                        }
                        c16Var.d = i3;
                        return true;
                    }
                    if (c != 2) {
                        j3 = c16Var.f;
                        if (j3 <= 8) {
                            throw new zzasv("Invalid integer size: " + j3);
                        }
                        i4 = (int) j3;
                        zzauuVar.zzh(bArr12, 0, i4, false);
                        j4 = 0;
                        for (i5 = 0; i5 < i4; i5++) {
                            j4 = (j4 << 8) | ((long) (bArr12[i5] & 255));
                        }
                        ((zzavn) obj).a(i, j4);
                        c16Var.d = 0;
                        return true;
                    }
                    if (c != 3) {
                        j5 = c16Var.f;
                        if (j5 <= 2147483647L) {
                            throw new zzasv("String element size: " + j5);
                        }
                        i6 = (int) j5;
                        if (i6 == 0) {
                            str = "";
                        } else {
                            byte[] bArr13 = new byte[i6];
                            zzauuVar.zzh(bArr13, 0, i6, false);
                            str = new String(bArr13);
                        }
                        zzavnVar3 = (zzavn) obj;
                        zzavnVar3.getClass();
                        if (i != 134) {
                            zzavnVar3.s.a = str;
                        } else if (i != 17026) {
                            if (i == 2274716) {
                                zzavnVar3.s.N = str;
                            }
                        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                            throw new zzasv(fc2.a("DocType ", str, " not supported"));
                        }
                        c16Var.d = 0;
                        return true;
                    }
                    if (c != 4) {
                        zzavnVar.b(i, (int) c16Var.f, zzauuVar);
                        c16Var.d = 0;
                        return true;
                    }
                    j6 = c16Var.f;
                    if (j6 == 4 && j6 != 8) {
                        throw new zzasv("Invalid float size: " + j6);
                    }
                    i7 = (int) j6;
                    zzauuVar.zzh(bArr12, 0, i7, false);
                    j7 = 0;
                    for (i8 = 0; i8 < i7; i8++) {
                        j7 = (j7 << 8) | ((long) (bArr12[i8] & 255));
                    }
                    if (i7 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) j7);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(j7);
                    }
                    zzavnVar4 = (zzavn) obj;
                    if (i != 181) {
                        zzavnVar4.s.I = (int) dLongBitsToDouble;
                    } else if (i != 17545) {
                        switch (i) {
                            case 21969:
                                zzavnVar4.s.w = (float) dLongBitsToDouble;
                                break;
                            case 21970:
                                zzavnVar4.s.x = (float) dLongBitsToDouble;
                                break;
                            case 21971:
                                zzavnVar4.s.y = (float) dLongBitsToDouble;
                                break;
                            case 21972:
                                zzavnVar4.s.z = (float) dLongBitsToDouble;
                                break;
                            case 21973:
                                zzavnVar4.s.A = (float) dLongBitsToDouble;
                                break;
                            case 21974:
                                zzavnVar4.s.B = (float) dLongBitsToDouble;
                                break;
                            case 21975:
                                zzavnVar4.s.C = (float) dLongBitsToDouble;
                                break;
                            case 21976:
                                zzavnVar4.s.D = (float) dLongBitsToDouble;
                                break;
                            case 21977:
                                zzavnVar4.s.E = (float) dLongBitsToDouble;
                                break;
                            case 21978:
                                zzavnVar4.s.F = (float) dLongBitsToDouble;
                                break;
                            default:
                                zzavnVar4.getClass();
                                break;
                        }
                    } else {
                        zzavnVar4.q = (long) dLongBitsToDouble;
                    }
                    c16Var.d = 0;
                    return true;
                }
                zzauuVar.zzi((int) c16Var.f, false);
                c16Var.d = 0;
                r3 = 0;
                i32 = 1;
            }
            c16Var.f = f16Var.b(zzauuVar, z3, z4, 8);
            c16Var.d = 2;
            sd6 sd6Var4 = c16Var.g;
            i = c16Var.e;
            obj = sd6Var4.x;
            zzavnVar = (zzavn) obj;
            zzaux zzauxVar3 = zzavn.zza;
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 241:
                case 251:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 22186:
                case 22203:
                case 25188:
                case 2352003:
                case 2807729:
                    c = 2;
                    break;
                case 134:
                case 17026:
                case 2274716:
                    c = 3;
                    break;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    c = 1;
                    break;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    c = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                    c = 5;
                    break;
                default:
                    c = 0;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    jZzd = zzauuVar.zzd();
                    stack.add(new b16(i, c16Var.f + jZzd));
                    sd6 sd6Var5 = c16Var.g;
                    i2 = c16Var.e;
                    j = c16Var.f;
                    zzavnVar2 = (zzavn) sd6Var5.x;
                    zzavnVar2.getClass();
                    if (i2 != 160) {
                        i3 = 0;
                        zzavnVar2.W = false;
                    } else if (i2 != 174) {
                        i3 = 0;
                        zzavnVar2.s = new d16(0);
                    } else if (i2 != 187) {
                        if (i2 != 19899) {
                            zzavnVar2.u = -1;
                            zzavnVar2.v = -1L;
                        } else if (i2 != 20533) {
                            zzavnVar2.s.e = true;
                        } else if (i2 != 21968) {
                            zzavnVar2.s.q = true;
                        } else if (i2 != 408125543) {
                            j2 = zzavnVar2.o;
                            if (j2 == -1) {
                            }
                            zzavnVar2.o = jZzd;
                            zzavnVar2.n = j;
                        } else if (i2 != 475249515) {
                            zzavnVar2.A = new zzbab(32);
                            zzavnVar2.B = new zzbab(32);
                        } else if (i2 == 524531317) {
                            if (zzavnVar2.c) {
                                zzavnVar2.X.zzc(new zzavb(zzavnVar2.r));
                                zzavnVar2.t = true;
                            } else {
                                zzavnVar2.X.zzc(new zzavb(zzavnVar2.r));
                                zzavnVar2.t = true;
                            }
                        }
                        i3 = 0;
                    } else {
                        i3 = 0;
                        zzavnVar2.C = false;
                    }
                    c16Var.d = i3;
                    return true;
                }
                if (c != 2) {
                    j3 = c16Var.f;
                    if (j3 <= 8) {
                        throw new zzasv("Invalid integer size: " + j3);
                    }
                    i4 = (int) j3;
                    zzauuVar.zzh(bArr12, 0, i4, false);
                    j4 = 0;
                    while (i5 < i4) {
                        j4 = (j4 << 8) | ((long) (bArr12[i5] & 255));
                    }
                    ((zzavn) obj).a(i, j4);
                    c16Var.d = 0;
                    return true;
                }
                if (c != 3) {
                    j5 = c16Var.f;
                    if (j5 <= 2147483647L) {
                        throw new zzasv("String element size: " + j5);
                    }
                    i6 = (int) j5;
                    if (i6 == 0) {
                        str = "";
                    } else {
                        byte[] bArr14 = new byte[i6];
                        zzauuVar.zzh(bArr14, 0, i6, false);
                        str = new String(bArr14);
                    }
                    zzavnVar3 = (zzavn) obj;
                    zzavnVar3.getClass();
                    if (i != 134) {
                        zzavnVar3.s.a = str;
                    } else if (i != 17026) {
                        if (i == 2274716) {
                            zzavnVar3.s.N = str;
                        }
                    } else if (!"webm".equals(str)) {
                        throw new zzasv(fc2.a("DocType ", str, " not supported"));
                    }
                    c16Var.d = 0;
                    return true;
                }
                if (c != 4) {
                    zzavnVar.b(i, (int) c16Var.f, zzauuVar);
                    c16Var.d = 0;
                    return true;
                }
                j6 = c16Var.f;
                if (j6 == 4) {
                }
                i7 = (int) j6;
                zzauuVar.zzh(bArr12, 0, i7, false);
                j7 = 0;
                while (i8 < i7) {
                    j7 = (j7 << 8) | ((long) (bArr12[i8] & 255));
                }
                if (i7 == 4) {
                    dLongBitsToDouble = Float.intBitsToFloat((int) j7);
                } else {
                    dLongBitsToDouble = Double.longBitsToDouble(j7);
                }
                zzavnVar4 = (zzavn) obj;
                if (i != 181) {
                    zzavnVar4.s.I = (int) dLongBitsToDouble;
                } else if (i != 17545) {
                    switch (i) {
                        case 21969:
                            zzavnVar4.s.w = (float) dLongBitsToDouble;
                            break;
                        case 21970:
                            zzavnVar4.s.x = (float) dLongBitsToDouble;
                            break;
                        case 21971:
                            zzavnVar4.s.y = (float) dLongBitsToDouble;
                            break;
                        case 21972:
                            zzavnVar4.s.z = (float) dLongBitsToDouble;
                            break;
                        case 21973:
                            zzavnVar4.s.A = (float) dLongBitsToDouble;
                            break;
                        case 21974:
                            zzavnVar4.s.B = (float) dLongBitsToDouble;
                            break;
                        case 21975:
                            zzavnVar4.s.C = (float) dLongBitsToDouble;
                            break;
                        case 21976:
                            zzavnVar4.s.D = (float) dLongBitsToDouble;
                            break;
                        case 21977:
                            zzavnVar4.s.E = (float) dLongBitsToDouble;
                            break;
                        case 21978:
                            zzavnVar4.s.F = (float) dLongBitsToDouble;
                            break;
                        default:
                            zzavnVar4.getClass();
                            break;
                    }
                } else {
                    zzavnVar4.q = (long) dLongBitsToDouble;
                }
                c16Var.d = 0;
                return true;
            }
            zzauuVar.zzi((int) c16Var.f, false);
            c16Var.d = 0;
            r3 = 0;
            i32 = 1;
        }
    }
}
