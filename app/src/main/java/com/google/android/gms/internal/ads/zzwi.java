package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwi implements zzwe, zzfx {
    public static zzwi J;
    public static final zzfuv zza = zzfuv.zzs(4800000L, 3100000L, 2100000L, 1500000L, 800000L);
    public static final zzfuv zzb = zzfuv.zzs(1500000L, 1000000L, 730000L, 440000L, 170000L);
    public static final zzfuv zzc = zzfuv.zzs(2200000L, 1400000L, 1100000L, 910000L, 620000L);
    public static final zzfuv zzd = zzfuv.zzs(3000000L, 1900000L, 1400000L, 1000000L, 660000L);
    public static final zzfuv zze = zzfuv.zzs(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);
    public static final zzfuv zzf = zzfuv.zzs(2800000L, 2400000L, 1600000L, 1100000L, 950000L);
    public final boolean A;
    public int B;
    public long C;
    public long D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final zzfuy w;
    public final zzwc x;
    public final zzwy y;
    public final zzde z;

    @Deprecated
    public zzwi() {
        zzfuy.zzd();
        zzde zzdeVar = zzde.zza;
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0136, code lost:
    
        if (r3.equals("VU") != false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x014e, code lost:
    
        if (r3.equals("VI") != false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0166, code lost:
    
        if (r3.equals("VE") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0170, code lost:
    
        if (r3.equals("VC") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x017a, code lost:
    
        if (r3.equals("VA") != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0192, code lost:
    
        if (r3.equals("UY") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01aa, code lost:
    
        if (r3.equals("UG") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01b4, code lost:
    
        if (r3.equals("UA") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01cc, code lost:
    
        if (r3.equals("TW") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d6, code lost:
    
        if (r3.equals("TV") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01fc, code lost:
    
        if (r3.equals("TO") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0206, code lost:
    
        if (r3.equals("TN") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0210, code lost:
    
        if (r3.equals("TM") != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x021a, code lost:
    
        if (r3.equals("TL") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0232, code lost:
    
        if (r3.equals("TJ") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x024a, code lost:
    
        if (r3.equals("TG") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0254, code lost:
    
        if (r3.equals("TD") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x025e, code lost:
    
        if (r3.equals("TC") != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0275, code lost:
    
        if (r3.equals("SY") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x027f, code lost:
    
        if (r3.equals("SX") != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0286, code lost:
    
        return new int[]{1, 2, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x028d, code lost:
    
        if (r3.equals("SV") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02c1, code lost:
    
        if (r3.equals("SO") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02d9, code lost:
    
        if (r3.equals("SM") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02e3, code lost:
    
        if (r3.equals("SL") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02ea, code lost:
    
        return new int[]{3, 3, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02f1, code lost:
    
        if (r3.equals("SK") != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02fb, code lost:
    
        if (r3.equals("SI") != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0305, code lost:
    
        if (r3.equals("SH") != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x031d, code lost:
    
        if (r3.equals("SE") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0327, code lost:
    
        if (r3.equals("SD") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0331, code lost:
    
        if (r3.equals("SC") != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0338, code lost:
    
        return new int[]{4, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0377, code lost:
    
        if (r3.equals("RS") != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x038f, code lost:
    
        if (r3.equals("RE") != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x03b5, code lost:
    
        if (r3.equals("PT") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03db, code lost:
    
        if (r3.equals("PM") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        if (r3.equals("CI") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x03e5, code lost:
    
        if (r3.equals("PL") != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x03ee, code lost:
    
        if (r3.equals("PK") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0406, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0410, code lost:
    
        if (r3.equals("PF") != false) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x041a, code lost:
    
        if (r3.equals("PE") != false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0424, code lost:
    
        if (r3.equals("PA") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x043b, code lost:
    
        if (r3.equals("NZ") != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0442, code lost:
    
        return new int[]{1, 1, 2, 2, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0449, code lost:
    
        if (r3.equals("NU") != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0452, code lost:
    
        if (r3.equals("NR") != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0459, code lost:
    
        return new int[]{4, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x046e, code lost:
    
        if (r3.equals("NO") != false) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0486, code lost:
    
        if (r3.equals("NI") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x048d, code lost:
    
        return new int[]{2, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x04a2, code lost:
    
        if (r3.equals("NE") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x04ba, code lost:
    
        if (r3.equals("NA") != false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        if (r3.equals("CG") != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0518, code lost:
    
        if (r3.equals("MT") != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0522, code lost:
    
        if (r3.equals("MS") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x052c, code lost:
    
        if (r3.equals("MR") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0533, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
    
        if (r3.equals("CF") != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x053a, code lost:
    
        if (r3.equals("MQ") != false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0544, code lost:
    
        if (r3.equals("MP") != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x054d, code lost:
    
        if (r3.equals("MO") != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0554, code lost:
    
        return new int[]{0, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0577, code lost:
    
        if (r3.equals("ML") != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x057e, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0593, code lost:
    
        if (r3.equals("MH") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x059d, code lost:
    
        if (r3.equals("MG") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x05a7, code lost:
    
        if (r3.equals("MF") != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x05ae, code lost:
    
        return new int[]{1, 2, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x05c3, code lost:
    
        if (r3.equals("MD") != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x05ca, code lost:
    
        return new int[]{1, 0, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x05ed, code lost:
    
        if (r3.equals("LY") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x05f7, code lost:
    
        if (r3.equals("LV") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007e, code lost:
    
        if (r3.equals("BN") != false) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x062b, code lost:
    
        if (r3.equals("LR") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0643, code lost:
    
        if (r3.equals("LI") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x064d, code lost:
    
        if (r3.equals("LC") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0681, code lost:
    
        if (r3.equals("KY") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x068b, code lost:
    
        if (r3.equals("KW") != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        if (r3.equals("BM") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x06a3, code lost:
    
        if (r3.equals("KP") != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x06ad, code lost:
    
        if (r3.equals("KN") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x06b7, code lost:
    
        if (r3.equals("KM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x06c1, code lost:
    
        if (r3.equals("KI") != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x06c8, code lost:
    
        return new int[]{4, 2, 4, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x06dd, code lost:
    
        if (r3.equals("KG") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x06e4, code lost:
    
        return new int[]{2, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x06eb, code lost:
    
        if (r3.equals("KE") != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0092, code lost:
    
        if (r3.equals("BL") != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x071f, code lost:
    
        if (r3.equals("JE") != false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0726, code lost:
    
        return new int[]{4, 2, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x073b, code lost:
    
        if (r3.equals("IS") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0761, code lost:
    
        if (r3.equals("IO") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0768, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x077d, code lost:
    
        if (r3.equals("IM") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0784, code lost:
    
        return new int[]{0, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x078b, code lost:
    
        if (r3.equals("IL") != false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0795, code lost:
    
        if (r3.equals("IE") != false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x07bb, code lost:
    
        if (r3.equals("HT") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x07c5, code lost:
    
        if (r3.equals("HR") != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x07ea, code lost:
    
        if (r3.equals("GW") != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x07f4, code lost:
    
        if (r3.equals("GU") != false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x07fb, code lost:
    
        return new int[]{1, 2, 4, 4, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0810, code lost:
    
        if (r3.equals("GR") != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0817, code lost:
    
        return new int[]{1, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x082c, code lost:
    
        if (r3.equals("GP") != false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0833, code lost:
    
        return new int[]{2, 1, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0848, code lost:
    
        if (r3.equals("GM") != false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0852, code lost:
    
        if (r3.equals("GL") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x085c, code lost:
    
        if (r3.equals("GI") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0866, code lost:
    
        if (r3.equals("GH") != false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x086d, code lost:
    
        return new int[]{3, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0874, code lost:
    
        if (r3.equals("GG") != false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x087b, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0882, code lost:
    
        if (r3.equals("GF") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x089a, code lost:
    
        if (r3.equals("GD") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x08b2, code lost:
    
        if (r3.equals("GA") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08b9, code lost:
    
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x08ce, code lost:
    
        if (r3.equals("FO") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x08e6, code lost:
    
        if (r3.equals("FK") != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x08ed, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c6, code lost:
    
        if (r3.equals("AR") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x091e, code lost:
    
        if (r3.equals("ES") != false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0925, code lost:
    
        return new int[]{0, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x092c, code lost:
    
        if (r3.equals("ER") != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0933, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x093a, code lost:
    
        if (r3.equals("EG") != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0941, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0948, code lost:
    
        if (r3.equals("EE") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x094f, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d0, code lost:
    
        if (r3.equals("AQ") != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0964, code lost:
    
        if (r3.equals("DZ") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x096b, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0980, code lost:
    
        if (r3.equals("DM") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0998, code lost:
    
        if (r3.equals("DJ") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x09af, code lost:
    
        if (r3.equals("CZ") != false) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x09b6, code lost:
    
        return new int[]{0, 0, 2, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x09bd, code lost:
    
        if (r3.equals("CY") != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x09c4, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00da, code lost:
    
        if (r3.equals("ZW") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x09cb, code lost:
    
        if (r3.equals("CX") != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x09d2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x09d9, code lost:
    
        if (r3.equals("CW") != false) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x09e0, code lost:
    
        return new int[]{2, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x09f5, code lost:
    
        if (r3.equals("CU") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x09fc, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x0a3b, code lost:
    
        if (r3.equals("CL") != false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x0a42, code lost:
    
        return new int[]{1, 2, 2, 2, 3, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0a49, code lost:
    
        if (r3.equals("CK") != false) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0a50, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x0a81, code lost:
    
        if (r3.equals("BQ") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0a99, code lost:
    
        if (r3.equals("BI") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0aa0, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0ab5, code lost:
    
        if (r3.equals("BG") != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0abc, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0aed, code lost:
    
        if (r3.equals("AZ") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0af4, code lost:
    
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0b25, code lost:
    
        if (r3.equals("AF") != false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0b2c, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0b41, code lost:
    
        if (r3.equals("AD") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0b48, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
    
        if (r3.equals("YT") != false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0b87, code lost:
    
        if (r3.equals("BB") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0b8e, code lost:
    
        return new int[]{0, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0ba3, code lost:
    
        if (r3.equals("AX") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x0baa, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010a, code lost:
    
        if (r3.equals("YE") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x0bcd, code lost:
    
        if (r3.equals("AL") != false) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x0bd4, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0114, code lost:
    
        if (r3.equals("XK") != false) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012c, code lost:
    
        if (r3.equals("WF") != false) goto L562;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] c(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 6360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwi.c(java.lang.String):int[]");
    }

    public static synchronized zzwi zzg(Context context) {
        if (J == null) {
            Context applicationContext = context == null ? null : context.getApplicationContext();
            int[] iArrC = c(zzel.zzL(context));
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            zzfuv zzfuvVar = zza;
            map.put(2, (Long) zzfuvVar.get(iArrC[0]));
            map.put(3, (Long) zzb.get(iArrC[1]));
            map.put(4, (Long) zzc.get(iArrC[2]));
            map.put(5, (Long) zzd.get(iArrC[3]));
            map.put(10, (Long) zze.get(iArrC[4]));
            map.put(9, (Long) zzf.get(iArrC[5]));
            map.put(7, (Long) zzfuvVar.get(iArrC[0]));
            J = new zzwi(applicationContext, map, zzde.zza);
        }
        return J;
    }

    public static void zzh(zzwi zzwiVar, int i) {
        synchronized (zzwiVar) {
            int i2 = zzwiVar.E;
            if (i2 == 0 || zzwiVar.A) {
                if (i2 != i) {
                    zzwiVar.E = i;
                    if (i != 1 && i != 0 && i != 8) {
                        zzwiVar.H = zzwiVar.a(i);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        zzwiVar.b(zzwiVar.B > 0 ? (int) (jElapsedRealtime - zzwiVar.C) : 0, zzwiVar.D, zzwiVar.H);
                        zzwiVar.C = jElapsedRealtime;
                        zzwiVar.D = 0L;
                        zzwiVar.G = 0L;
                        zzwiVar.F = 0L;
                        zzwiVar.y.zzc();
                    }
                }
            }
        }
    }

    public final long a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        zzfuy zzfuyVar = this.w;
        Long l = (Long) zzfuyVar.get(numValueOf);
        if (l == null) {
            l = (Long) zzfuyVar.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void b(int i, long j, long j2) {
        int i2;
        long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.I) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.I = j2;
        this.x.zzb(i2, j3, j2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:12:0x0012), top: B:18:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000d  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x0010, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzfx
    public final synchronized void zza(zzev zzevVar, zzfa zzfaVar, boolean z, int i) {
        boolean z2;
        if (!z) {
            z2 = false;
            if (z2) {
                this.D += (long) i;
                return;
            }
            return;
        }
        if (zzfaVar.zzb(8)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        this.D += (long) i;
        return;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0012 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:13:0x0014 A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0007, B:13:0x0014, B:17:0x001a, B:19:0x0035, B:21:0x004f, B:24:0x0063, B:23:0x0058, B:25:0x0071), top: B:31:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0018  */
    /* JADX WARN: Code duplicated, block: B:16:0x0019  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035 A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:6:0x0007, B:13:0x0014, B:17:0x001a, B:19:0x0035, B:21:0x004f, B:24:0x0063, B:23:0x0058, B:25:0x0071), top: B:31:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:6:0x0007, B:13:0x0014, B:17:0x001a, B:19:0x0035, B:21:0x004f, B:24:0x0063, B:23:0x0058, B:25:0x0071), top: B:31:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0012, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzfx
    public final synchronized void zzb(zzev zzevVar, zzfa zzfaVar, boolean z) {
        boolean z2;
        long jElapsedRealtime;
        int i;
        long j;
        boolean z3 = true;
        if (!z) {
            z2 = false;
            if (z2) {
                if (this.B > 0) {
                    z3 = false;
                }
                zzdd.zzf(z3);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                i = (int) (jElapsedRealtime - this.C);
                this.F += (long) i;
                long j2 = this.G;
                j = this.D;
                this.G = j2 + j;
                if (i > 0) {
                    this.y.zzb((int) Math.sqrt(j), (j * 8000.0f) / i);
                    if (this.F < 2000) {
                        this.H = (long) this.y.zza(0.5f);
                    } else {
                        this.H = (long) this.y.zza(0.5f);
                    }
                    b(i, this.D, this.H);
                    this.C = jElapsedRealtime;
                    this.D = 0L;
                }
                this.B--;
                return;
            }
            return;
        }
        if (zzfaVar.zzb(8)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        if (this.B > 0) {
            z3 = false;
        }
        zzdd.zzf(z3);
        jElapsedRealtime = SystemClock.elapsedRealtime();
        i = (int) (jElapsedRealtime - this.C);
        this.F += (long) i;
        long j3 = this.G;
        j = this.D;
        this.G = j3 + j;
        if (i > 0) {
            this.y.zzb((int) Math.sqrt(j), (j * 8000.0f) / i);
            if (this.F < 2000 || this.G >= 524288) {
                this.H = (long) this.y.zza(0.5f);
            }
            b(i, this.D, this.H);
            this.C = jElapsedRealtime;
            this.D = 0L;
        }
        this.B--;
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzc(zzev zzevVar, zzfa zzfaVar, boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0011 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:13:0x0013 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0006, B:13:0x0013, B:15:0x0017, B:16:0x001d), top: B:22:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[Catch: all -> 0x0024, TryCatch #0 {, blocks: (B:6:0x0006, B:13:0x0013, B:15:0x0017, B:16:0x001d), top: B:22:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0011, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzfx
    public final synchronized void zzd(zzev zzevVar, zzfa zzfaVar, boolean z) {
        boolean z2;
        if (!z) {
            z2 = false;
            if (z2) {
                if (this.B == 0) {
                    this.C = SystemClock.elapsedRealtime();
                }
                this.B++;
                return;
            }
            return;
        }
        if (zzfaVar.zzb(8)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        if (this.B == 0) {
            this.C = SystemClock.elapsedRealtime();
        }
        this.B++;
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zze(Handler handler, zzwd zzwdVar) {
        zzwdVar.getClass();
        this.x.zza(handler, zzwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzf(zzwd zzwdVar) {
        this.x.zzc(zzwdVar);
    }

    public /* synthetic */ zzwi(Context context, HashMap map, zzde zzdeVar) {
        this.w = zzfuy.zzc(map);
        this.x = new zzwc();
        this.y = new zzwy(AdError.SERVER_ERROR_CODE);
        this.z = zzdeVar;
        this.A = true;
        if (context != null) {
            zzeb zzebVarZzb = zzeb.zzb(context);
            int iZza = zzebVarZzb.zza();
            this.E = iZza;
            this.H = a(iZza);
            zzebVarZzb.zzd(new zzwg(this));
            return;
        }
        this.E = 0;
        this.H = a(0);
    }
}
