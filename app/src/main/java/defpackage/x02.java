package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x02 extends cx1 implements x81<c02, g70, b12> {
    public final /* synthetic */ o02 A;
    public final /* synthetic */ CZ9P.FJCM B;
    public final /* synthetic */ CZ9P.LPt8Fixed C;
    public final /* synthetic */ m02 D;
    public final /* synthetic */ h02 E;
    public final /* synthetic */ One.CQf F;
    public final /* synthetic */ One.F1 G;
    public final /* synthetic */ tw2 H;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ay2 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ q12 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x02(boolean z, ay2 ay2Var, boolean z2, q12 q12Var, p02 p02Var, CZ9P.FJCM fjcm, CZ9P.LPt8Fixed lPt8, m02 m02Var, h02 h02Var, One.CQf cQf, One.F1 f1, tw2 tw2Var) {
        super(2);
        this.w = z;
        this.x = ay2Var;
        this.y = z2;
        this.z = q12Var;
        this.A = p02Var;
        this.B = fjcm;
        this.C = lPt8;
        this.D = m02Var;
        this.E = h02Var;
        this.F = cQf;
        this.G = f1;
        this.H = tw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:160:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d4 A[LOOP:6: B:161:0x03d2->B:162:0x03d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:172:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:175:0x0403  */
    /* JADX WARN: Code duplicated, block: B:178:0x0410  */
    /* JADX WARN: Code duplicated, block: B:179:0x0412  */
    /* JADX WARN: Code duplicated, block: B:182:0x041a  */
    /* JADX WARN: Code duplicated, block: B:183:0x041c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0424  */
    /* JADX WARN: Code duplicated, block: B:187:0x0426  */
    /* JADX WARN: Code duplicated, block: B:189:0x0429 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x042b  */
    /* JADX WARN: Code duplicated, block: B:191:0x042e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0433  */
    /* JADX WARN: Code duplicated, block: B:198:0x045a  */
    /* JADX WARN: Code duplicated, block: B:203:0x0468  */
    /* JADX WARN: Code duplicated, block: B:205:0x046b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0474 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x0476  */
    /* JADX WARN: Code duplicated, block: B:209:0x0478  */
    /* JADX WARN: Code duplicated, block: B:213:0x048e A[LOOP:8: B:212:0x048c->B:213:0x048e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x0496  */
    /* JADX WARN: Code duplicated, block: B:217:0x049a  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:220:0x04b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:221:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:225:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:233:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:234:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:237:0x0508  */
    /* JADX WARN: Code duplicated, block: B:240:0x0516 A[LOOP:9: B:231:0x04f6->B:240:0x0516, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x0518  */
    /* JADX WARN: Code duplicated, block: B:243:0x0522  */
    /* JADX WARN: Code duplicated, block: B:245:0x052c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0540 A[LOOP:20: B:246:0x053e->B:247:0x0540, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x055c A[LOOP:21: B:249:0x055a->B:250:0x055c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x0576 A[LOOP:22: B:252:0x0574->B:253:0x0576, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x0594  */
    /* JADX WARN: Code duplicated, block: B:258:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:260:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:265:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:269:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:271:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:272:0x05f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:278:0x0603  */
    /* JADX WARN: Code duplicated, block: B:280:0x060b  */
    /* JADX WARN: Code duplicated, block: B:281:0x0612  */
    /* JADX WARN: Code duplicated, block: B:283:0x0617  */
    /* JADX WARN: Code duplicated, block: B:286:0x0625  */
    /* JADX WARN: Code duplicated, block: B:287:0x0629  */
    /* JADX WARN: Code duplicated, block: B:288:0x062e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0637  */
    /* JADX WARN: Code duplicated, block: B:294:0x0643 A[LOOP:12: B:290:0x0635->B:294:0x0643, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:298:0x064b  */
    /* JADX WARN: Code duplicated, block: B:299:0x0669  */
    /* JADX WARN: Code duplicated, block: B:301:0x066d  */
    /* JADX WARN: Code duplicated, block: B:302:0x066f  */
    /* JADX WARN: Code duplicated, block: B:304:0x0672  */
    /* JADX WARN: Code duplicated, block: B:306:0x0675  */
    /* JADX WARN: Code duplicated, block: B:307:0x0677  */
    /* JADX WARN: Code duplicated, block: B:309:0x067a  */
    /* JADX WARN: Code duplicated, block: B:313:0x0698 A[LOOP:14: B:311:0x0694->B:313:0x0698, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:317:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:319:0x06f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:322:0x0713  */
    /* JADX WARN: Code duplicated, block: B:323:0x0718 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:324:0x071a  */
    /* JADX WARN: Code duplicated, block: B:325:0x071f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0744  */
    /* JADX WARN: Code duplicated, block: B:329:0x0749  */
    /* JADX WARN: Code duplicated, block: B:332:0x074d  */
    /* JADX WARN: Code duplicated, block: B:333:0x0758  */
    /* JADX WARN: Code duplicated, block: B:336:0x076c A[LOOP:16: B:335:0x076a->B:336:0x076c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:338:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:339:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:341:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:342:0x0818  */
    /* JADX WARN: Code duplicated, block: B:346:0x0849  */
    /* JADX WARN: Code duplicated, block: B:347:0x0863  */
    /* JADX WARN: Code duplicated, block: B:351:0x0895  */
    /* JADX WARN: Code duplicated, block: B:355:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:357:0x0908  */
    /* JADX WARN: Code duplicated, block: B:359:0x0910  */
    /* JADX WARN: Code duplicated, block: B:360:0x0912  */
    /* JADX WARN: Code duplicated, block: B:364:0x0919 A[LOOP:18: B:354:0x08da->B:364:0x0919, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:368:0x0931  */
    /* JADX WARN: Code duplicated, block: B:371:0x0949 A[LOOP:19: B:367:0x092f->B:371:0x0949, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:382:0x0982  */
    /* JADX WARN: Code duplicated, block: B:390:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:391:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:394:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:395:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:397:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:399:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:401:0x0a17 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:402:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:403:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:405:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:508:0x0589 A[EDGE_INSN: B:508:0x0589->B:254:0x0589 BREAK  A[LOOP:9: B:231:0x04f6->B:240:0x0516], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x05db A[EDGE_INSN: B:511:0x05db->B:267:0x05db BREAK  A[LOOP:10: B:257:0x05a3->B:266:0x05d2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0641 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x0a21 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x06b7 A[EDGE_INSN: B:523:0x06b7->B:314:0x06b7 BREAK  A[LOOP:14: B:311:0x0694->B:313:0x0698], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x09b5 A[EDGE_INSN: B:530:0x09b5->B:387:0x09b5 BREAK  A[LOOP:17: B:349:0x088b->B:533:0x088b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x09af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x08a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x0923 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0917 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0945 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x094c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final b12 invoke(c02 c02Var, g70 g70Var) throws Throwable {
        int i;
        float fA;
        long jD;
        int i2;
        int i3;
        int i4;
        int iMax;
        int i5;
        int i6;
        v12 v12Var;
        int i7;
        List list;
        List list2;
        boolean z;
        int i8;
        int iW;
        int i9;
        int iV;
        int i10;
        boolean z2;
        ArrayList arrayList;
        int i11;
        boolean z3;
        int i12;
        int size;
        int i13;
        int i14;
        int size2;
        int i15;
        int i16;
        int size3;
        int i17;
        f12 f12VarA;
        int i18;
        int size4;
        int i19;
        boolean z4;
        m02 m02Var;
        boolean z5;
        int i20;
        int i21;
        long jD2;
        f12 f12Var;
        f12 f12Var2;
        int size5;
        int i22;
        int i23;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        int size6;
        LinkedHashSet linkedHashSet;
        int size7;
        m02 m02Var2;
        int i24;
        LinkedHashSet linkedHashSet2;
        f12 f12Var3;
        int i25;
        long j;
        w12 w12Var;
        int i26;
        f12 f12Var4;
        ArrayList arrayList3;
        int i27;
        Iterator it;
        boolean zHasNext;
        o02 o02Var;
        int i28;
        int i29;
        ArrayList arrayList4;
        Map.Entry entry;
        LinkedHashSet linkedHashSet3;
        gs1 gs1Var;
        Integer num;
        ArrayList arrayList5;
        int size8;
        int i30;
        gs1 gs1Var2;
        int i31;
        boolean z6;
        int size9;
        int i32;
        boolean z7;
        v12 v12VarA;
        int iA;
        int i33;
        int i34;
        ArrayList arrayList6;
        c43 c43Var;
        int i35;
        long jD3;
        boolean z8;
        f12 f12Var5;
        Object obj;
        gs1 gs1Var3;
        boolean z9;
        f12 f12Var6;
        boolean z10;
        long j2;
        w12 w12Var2;
        f12 f12Var7;
        ArrayList arrayList7;
        gs1 gs1Var4;
        Integer num2;
        long jD4;
        int iC;
        int iC2;
        int i36;
        int iC3;
        long jD5;
        int size10;
        int i37;
        boolean z11;
        f12 f12Var8;
        ArrayList arrayList8;
        int size11;
        int i38;
        ArrayList arrayList9;
        Object obj2;
        f12 f12Var9;
        boolean z12;
        b12 b12Var;
        q12 q12Var;
        int i39;
        int size12;
        int i40;
        int iIntValue;
        int iIntValue2;
        int size13;
        int i41;
        int i42;
        int i43;
        int i44;
        v12 v12VarA2;
        int iMin;
        int i45;
        int i46;
        List<Integer> list3;
        Integer num3;
        boolean z13;
        int size14;
        int[] iArr;
        int i47;
        int[] iArr2;
        int i48;
        int[] iArr3;
        np1 pp1Var;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        v12 v12Var2;
        int i54;
        boolean z14;
        int i55;
        ArrayList arrayList10;
        int i56;
        int iMin2;
        int i57;
        c02 c02Var2 = c02Var;
        long j3 = g70Var.a;
        aw2 aw2Var = aw2.Vertical;
        aw2 aw2Var2 = aw2.Horizontal;
        boolean z15 = this.w;
        if (!z15) {
            aw2Var = aw2Var2;
        }
        X.k(j3, aw2Var);
        ay2 ay2Var = this.x;
        int iP0 = z15 ? c02Var2.p0(ay2Var.b(c02Var2.getLayoutDirection())) : c02Var2.p0(ps0.q(ay2Var, c02Var2.getLayoutDirection()));
        int iP1 = z15 ? c02Var2.p0(ay2Var.c(c02Var2.getLayoutDirection())) : c02Var2.p0(ps0.p(ay2Var, c02Var2.getLayoutDirection()));
        int iP2 = c02Var2.p0(ay2Var.d());
        int iP3 = c02Var2.p0(ay2Var.a());
        int i58 = iP2 + iP3;
        int i59 = iP0 + iP1;
        int i60 = z15 ? i58 : i59;
        boolean z16 = this.y;
        if (z15 && !z16) {
            i = iP2;
        } else if (z15 && z16) {
            i = iP3;
        } else {
            i = (z15 || z16) ? iP1 : iP0;
        }
        int i61 = i60 - i;
        long jF = FWT.F(-i59, -i58, j3);
        q12 q12Var2 = this.z;
        o02 o02Var2 = this.A;
        q12Var2.j(o02Var2);
        q12Var2.e.setValue(c02Var2);
        int i62 = i;
        o02Var2.c().a.setValue(new wm0(c02Var2.j(g70.h(jF))));
        o02Var2.c().b.setValue(new wm0(c02Var2.j(g70.g(jF))));
        CZ9P.FJCM fjcm = this.B;
        CZ9P.LPt8Fixed lPt8 = this.C;
        if (z15) {
            if (fjcm == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            fA = fjcm.a();
        } else {
            if (lPt8 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            fA = lPt8.a();
        }
        int iP4 = c02Var2.p0(fA);
        int iG = o02Var2.g();
        int iG2 = z15 ? g70.g(j3) - i58 : g70.h(j3) - i59;
        if (!z16 || iG2 > 0) {
            jD = C0239D.d(iP0, iP2);
        } else {
            if (!z15) {
                iP0 += iG2;
            }
            if (z15) {
                iP2 += iG2;
            }
            jD = C0239D.d(iP0, iP2);
        }
        boolean z17 = this.w;
        q12 q12Var3 = q12Var2;
        w12 w12Var3 = new w12(jF, z17, this.A, c02Var2, new w02(iG, iP4, c02Var2, z17, this.F, this.G, this.y, i62, i61, this.D, jD));
        q12Var3.o.setValue(new g70(w12Var3.d));
        cp4 cp4VarF = ip4.f((cp4) ip4.b.h(), null, false);
        try {
            cp4 cp4VarI = cp4VarF.i();
            try {
                int iE = q12Var3.e();
                int iF = q12Var3.f();
                sd5 sd5Var = sd5.a;
                cp4.o(cp4VarI);
                cp4VarF.c();
                float f = q12Var3.d;
                List<Integer> listE = o02Var2.e();
                boolean z18 = this.y;
                v02 v02Var = v02Var;
                v02 v02Var2 = new v02(c02Var2, j3, i59, i58);
                if (!(i62 >= 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (!(i61 >= 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cs0 cs0Var = cs0.w;
                int i63 = iG;
                if (i63 <= 0) {
                    b12Var = new b12(null, 0, false, 0.0f, (sb2) v02Var.invoke(Integer.valueOf(g70.j(jF)), Integer.valueOf(g70.i(jF)), z02.w), cs0Var, iG2 + i61, 0);
                    q12Var = q12Var3;
                } else {
                    if (iE >= i63) {
                        iE = i63 - 1;
                        iF = 0;
                    }
                    int iC4 = sy4.c(f);
                    int i64 = iF - iC4;
                    if ((iE == 0) && i64 < 0) {
                        iC4 += i64;
                        i64 = 0;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    int i65 = iE;
                    int i66 = -i62;
                    int i67 = i64 - i62;
                    int iMax2 = 0;
                    while (i67 < 0 && i65 + 0 > 0) {
                        q12 q12Var4 = q12Var3;
                        int i68 = i65 - 1;
                        v02 v02Var3 = v02Var;
                        v12 v12VarA3 = w12Var3.a(i68);
                        i65 = i68;
                        arrayList11.add(0, v12VarA3);
                        iMax2 = Math.max(iMax2, v12VarA3.p);
                        i67 += v12VarA3.o;
                        v02Var = v02Var3;
                        q12Var3 = q12Var4;
                    }
                    v02 v02Var4 = v02Var;
                    q12 q12Var5 = q12Var3;
                    if (i67 < i66) {
                        iC4 += i67;
                        i67 = i66;
                    }
                    int i69 = i67 + i62;
                    int i70 = iG2 + i61;
                    int i71 = i70 < 0 ? 0 : i70;
                    int i72 = -i69;
                    int i73 = i69;
                    int i74 = i72;
                    int i75 = i65;
                    int i76 = 0;
                    for (int size15 = arrayList11.size(); i76 < size15; size15 = size15) {
                        i75++;
                        i74 += ((v12) arrayList11.get(i76)).o;
                        i76++;
                    }
                    int i77 = i74;
                    int i78 = i75;
                    while (true) {
                        if ((i77 > i71 && !arrayList11.isEmpty()) || i78 >= i63) {
                            break;
                        }
                        int i79 = i71;
                        v12 v12VarA4 = w12Var3.a(i78);
                        List<Integer> list4 = listE;
                        int i80 = v12VarA4.o;
                        int i81 = i77 + i80;
                        if (i81 <= i66) {
                            i2 = i81;
                            if (i78 != i63 - 1) {
                                i73 -= i80;
                                i65 = i78 + 1;
                            }
                            i78++;
                            i71 = i79;
                            listE = list4;
                            i77 = i2;
                        } else {
                            i2 = i81;
                        }
                        int iMax3 = Math.max(iMax2, v12VarA4.p);
                        arrayList11.add(v12VarA4);
                        iMax2 = iMax3;
                        i78++;
                        i71 = i79;
                        listE = list4;
                        i77 = i2;
                    }
                    List<Integer> list5 = listE;
                    if (i77 < iG2) {
                        int i82 = iG2 - i77;
                        int i83 = i77 + i82;
                        iMax = iMax2;
                        i5 = i73 - i82;
                        while (i5 < i62 && i65 + 0 > 0) {
                            int i84 = i65 - 1;
                            int i85 = i66;
                            v12 v12VarA5 = w12Var3.a(i84);
                            arrayList11.add(0, v12VarA5);
                            iMax = Math.max(iMax, v12VarA5.p);
                            i5 += v12VarA5.o;
                            i66 = i85;
                            i65 = i84;
                        }
                        i3 = i66;
                        iC4 += i82;
                        if (i5 < 0) {
                            iC4 += i5;
                            i4 = i83 + i5;
                            i5 = 0;
                        } else {
                            i4 = i83;
                        }
                    } else {
                        i3 = i66;
                        i4 = i77;
                        iMax = iMax2;
                        i5 = i73;
                    }
                    int iC5 = sy4.c(f);
                    if ((iC5 < 0 ? (byte) -1 : iC5 > 0 ? (byte) 1 : (byte) 0) == (iC4 < 0 ? (byte) -1 : iC4 > 0 ? (byte) 1 : (byte) 0) && Math.abs(sy4.c(f)) >= Math.abs(iC4)) {
                        f = iC4;
                    }
                    int i86 = -i5;
                    v12 v12Var3 = (v12) wu.H0(arrayList11);
                    if (i62 > 0) {
                        int size16 = arrayList11.size();
                        i6 = i5;
                        v12Var = v12Var3;
                        int i87 = 0;
                        while (i87 < size16) {
                            int i88 = ((v12) arrayList11.get(i87)).o;
                            if (i6 == 0 || i88 > i6) {
                                break;
                            }
                            int i89 = size16;
                            if (i87 == ps0.J(arrayList11)) {
                                break;
                            }
                            i6 -= i88;
                            i87++;
                            v12Var = (v12) arrayList11.get(i87);
                            size16 = i89;
                        }
                    } else {
                        i6 = i5;
                        v12Var = v12Var3;
                    }
                    h02 h02Var = this.E;
                    if (h02Var.a.k()) {
                        i7 = iMax;
                        int i90 = i63 - 1;
                        if (((v12) wu.H0(arrayList11)).a > Math.min(h02Var.b(), i90)) {
                            ArrayList arrayList12 = new ArrayList();
                            int i91 = ((v12) wu.H0(arrayList11)).a - 1;
                            int iMin3 = Math.min(h02Var.b(), i90);
                            if (iMin3 <= i91) {
                                while (true) {
                                    arrayList12.add(w12Var3.a(i91));
                                    if (i91 == iMin3) {
                                        break;
                                    }
                                    i91--;
                                }
                            }
                            sd5 sd5Var2 = sd5.a;
                            list = arrayList12;
                        }
                        if (h02Var.a.k()) {
                            i55 = i63 - 1;
                            if (((v12) wu.N0(arrayList11)).a < Math.min(h02Var.a(), i55)) {
                                arrayList10 = new ArrayList();
                                i56 = ((v12) wu.N0(arrayList11)).a;
                                iMin2 = Math.min(h02Var.a(), i55);
                                while (i56 < iMin2) {
                                    i56++;
                                    arrayList10.add(w12Var3.a(i56));
                                }
                                sd5 sd5Var3 = sd5.a;
                                list2 = arrayList10;
                            } else {
                                list2 = cs0Var;
                            }
                        } else {
                            list2 = cs0Var;
                        }
                        if (!ur1.a(v12Var, wu.H0(arrayList11)) && list.isEmpty() && list2.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z15) {
                            i8 = i7;
                        } else {
                            i8 = i4;
                        }
                        iW = FWT.w(i8, jF);
                        if (z15) {
                            i9 = i4;
                        } else {
                            i9 = i7;
                        }
                        iV = FWT.v(i9, jF);
                        if (z15) {
                            i10 = iV;
                        } else {
                            i10 = iW;
                        }
                        if (i4 < Math.min(i10, iG2)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (i86 == 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        }
                        v12 v12Var4 = v12Var;
                        arrayList = new ArrayList(list2.size() + list.size() + arrayList11.size());
                        if (z2) {
                            if (list.isEmpty() || !list2.isEmpty()) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (z13) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            size14 = arrayList11.size();
                            iArr = new int[size14];
                            for (i47 = 0; i47 < size14; i47++) {
                                if (z18) {
                                    i54 = (size14 - i47) - 1;
                                } else {
                                    i54 = i47;
                                }
                                iArr[i47] = ((v12) arrayList11.get(i54)).n;
                            }
                            iArr2 = new int[size14];
                            for (i48 = 0; i48 < size14; i48++) {
                                iArr2[i48] = 0;
                            }
                            if (z15) {
                                if (fjcm != null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                fjcm.b(c02Var2, i10, iArr, iArr2);
                                iArr3 = iArr2;
                                i11 = iG2;
                                z3 = true;
                                i12 = iW;
                            } else {
                                if (lPt8 != null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                i12 = iW;
                                iArr3 = iArr2;
                                i11 = iG2;
                                z3 = true;
                                lPt8.c(i10, c02Var2, jy1.Ltr, iArr, iArr3);
                            }
                            pp1Var = new pp1(0, size14 - 1);
                            if (z18) {
                                pp1Var = new np1(pp1Var.x, 0, -pp1Var.y);
                            }
                            i49 = pp1Var.w;
                            i50 = pp1Var.x;
                            i51 = pp1Var.y;
                            if ((i51 > 0 && i49 <= i50) || (i51 < 0 && i50 <= i49)) {
                                while (true) {
                                    i52 = iArr3[i49];
                                    if (z18) {
                                        i53 = (size14 - i49) - 1;
                                    } else {
                                        i53 = i49;
                                    }
                                    v12Var2 = (v12) arrayList11.get(i53);
                                    if (z18) {
                                        i52 = (i10 - i52) - v12Var2.n;
                                    }
                                    arrayList.add(v12Var2.a(i52, i12, iV));
                                    if (i49 == i50) {
                                        break;
                                    }
                                    i49 += i51;
                                }
                            }
                        } else {
                            i11 = iG2;
                            i63 = i63;
                            z3 = true;
                            i4 = i4;
                            i12 = iW;
                            size = list.size();
                            i13 = i86;
                            for (i14 = 0; i14 < size; i14++) {
                                v12 v12Var5 = (v12) list.get(i14);
                                i13 -= v12Var5.o;
                                arrayList.add(v12Var5.a(i13, i12, iV));
                            }
                            size2 = arrayList11.size();
                            i15 = i86;
                            for (i16 = 0; i16 < size2; i16++) {
                                v12 v12Var6 = (v12) arrayList11.get(i16);
                                arrayList.add(v12Var6.a(i15, i12, iV));
                                i15 += v12Var6.o;
                            }
                            size3 = list2.size();
                            for (i17 = 0; i17 < size3; i17++) {
                                v12 v12Var7 = (v12) list2.get(i17);
                                arrayList.add(v12Var7.a(i15, i12, iV));
                                i15 += v12Var7.o;
                            }
                        }
                        if (list5.isEmpty() ^ z3) {
                            i39 = ((f12) wu.H0(arrayList)).b;
                            size12 = list5.size();
                            i40 = 0;
                            iIntValue = -1;
                            iIntValue2 = -1;
                            while (i40 < size12) {
                                list3 = list5;
                                if (list3.get(i40).intValue() <= i39) {
                                    break;
                                }
                                iIntValue2 = list3.get(i40).intValue();
                                i40++;
                                if (i40 >= 0 || i40 > ps0.J(list3)) {
                                    num3 = -1;
                                } else {
                                    num3 = list3.get(i40);
                                }
                                iIntValue = num3.intValue();
                                list5 = list3;
                            }
                            size13 = arrayList.size();
                            i42 = -1;
                            i43 = Integer.MIN_VALUE;
                            i44 = Integer.MIN_VALUE;
                            for (i41 = 0; i41 < size13; i41++) {
                                f12 f12Var10 = (f12) arrayList.get(i41);
                                i45 = f12Var10.b;
                                i46 = f12Var10.a;
                                if (i45 == iIntValue2) {
                                    i43 = i46;
                                    i42 = i41;
                                } else if (i45 == iIntValue) {
                                    i44 = i46;
                                }
                            }
                            if (iIntValue2 == -1) {
                                f12VarA = null;
                            } else {
                                v12VarA2 = w12Var3.a(iIntValue2);
                                if (i43 != Integer.MIN_VALUE) {
                                    iMin = Math.max(i3, i43);
                                } else {
                                    iMin = i3;
                                }
                                if (i44 != Integer.MIN_VALUE) {
                                    iMin = Math.min(iMin, i44 - v12VarA2.n);
                                }
                                f12VarA = v12VarA2.a(iMin, i12, iV);
                                if (i42 != -1) {
                                    arrayList.set(i42, f12VarA);
                                } else {
                                    arrayList.add(0, f12VarA);
                                }
                            }
                        } else {
                            f12VarA = null;
                        }
                        i18 = (int) f;
                        size4 = arrayList.size();
                        i19 = 0;
                        while (true) {
                            if (i19 < size4) {
                                z4 = false;
                                break;
                            }
                            if (((f12) arrayList.get(i19)).l) {
                                z4 = true;
                                break;
                            }
                            i19++;
                        }
                        m02Var = this.D;
                        if (z4) {
                            z5 = m02Var.b;
                            if (z5) {
                                i20 = iV;
                            } else {
                                i20 = i12;
                            }
                            if (z18) {
                                i18 = -i18;
                            }
                            if (z5) {
                                i21 = 0;
                            } else {
                                i21 = i18;
                            }
                            if (!z5) {
                                i18 = 0;
                            }
                            jD2 = C0239D.d(i21, i18);
                            f12Var = (f12) wu.H0(arrayList);
                            f12Var2 = (f12) wu.N0(arrayList);
                            size5 = arrayList.size();
                            i22 = 0;
                            i23 = 0;
                            while (true) {
                                linkedHashMap = m02Var.c;
                                if (i22 < size5) {
                                    break;
                                }
                                int i92 = size5;
                                f12 f12Var11 = (f12) arrayList.get(i22);
                                ArrayList arrayList13 = arrayList11;
                                i23 += f12Var11.e;
                                i22++;
                                arrayList11 = arrayList13;
                                size5 = i92;
                            }
                            arrayList2 = arrayList11;
                            size6 = i23 / arrayList.size();
                            linkedHashSet = m02Var.i;
                            linkedHashSet.clear();
                            size7 = arrayList.size();
                            m02Var2 = m02Var;
                            i24 = 0;
                            while (i24 < size7) {
                                int i93 = size7;
                                f12Var5 = (f12) arrayList.get(i24);
                                int i94 = i12;
                                linkedHashSet.add(f12Var5.c);
                                obj = f12Var5.c;
                                int i95 = iV;
                                gs1Var3 = (gs1) linkedHashMap.get(obj);
                                LinkedHashSet linkedHashSet4 = linkedHashSet;
                                z9 = f12Var5.l;
                                if (gs1Var3 == null) {
                                    f12Var6 = f12Var;
                                    z10 = z5;
                                    i20 = i20;
                                    j2 = jD2;
                                    w12Var2 = w12Var3;
                                    f12Var7 = f12Var2;
                                    arrayList7 = arrayList;
                                    if (z9) {
                                        long j4 = gs1Var3.a;
                                        gs1Var3.a = C0239D.d(((int) (j4 >> 32)) + ((int) (j2 >> 32)), mp1.a(j2) + mp1.a(j4));
                                        m02Var2.d(f12Var5, gs1Var3);
                                    } else {
                                        linkedHashMap.remove(obj);
                                    }
                                } else if (z9) {
                                    gs1Var4 = new gs1();
                                    num2 = m02Var2.d.get(obj);
                                    f12Var6 = f12Var;
                                    w12Var2 = w12Var3;
                                    jD4 = f12Var5.d(0);
                                    iC = f12Var5.c(0);
                                    if (num2 == null) {
                                        iC3 = m02Var2.c(jD4);
                                    } else {
                                        if (z18) {
                                            iC2 = (m02Var2.c(jD4) - f12Var5.e) + iC;
                                        } else {
                                            iC2 = m02Var2.c(jD4);
                                        }
                                        int iA2 = m02Var.a(num2.intValue(), f12Var5.e, size6, jD2, z18, i20, iC2, arrayList);
                                        if (z18) {
                                            i36 = f12Var5.d - iC;
                                        } else {
                                            i36 = 0;
                                        }
                                        iC3 = iA2 + i36;
                                    }
                                    if (z5) {
                                        jD5 = C0239D.d((int) (jD4 >> 32), iC3);
                                    } else {
                                        jD5 = C0239D.d(iC3, mp1.a(jD4));
                                    }
                                    size10 = f12Var5.i.size();
                                    i37 = 0;
                                    while (i37 < size10) {
                                        long jD6 = f12Var5.d(i37);
                                        long j5 = jD2;
                                        long jD7 = C0239D.d(((int) (jD6 >> 32)) - ((int) (jD4 >> 32)), mp1.a(jD6) - mp1.a(jD4));
                                        int i96 = size10;
                                        gs1Var4.b.add(new c43(f12Var5.c(i37), C0239D.d(((int) (jD5 >> 32)) + ((int) (jD7 >> 32)), mp1.a(jD7) + mp1.a(jD5))));
                                        sd5 sd5Var4 = sd5.a;
                                        i37++;
                                        size10 = i96;
                                        obj = obj;
                                        f12Var2 = f12Var2;
                                        jD4 = jD4;
                                        z5 = z5;
                                        arrayList = arrayList;
                                        jD2 = j5;
                                    }
                                    j2 = jD2;
                                    z10 = z5;
                                    f12Var7 = f12Var2;
                                    arrayList7 = arrayList;
                                    linkedHashMap.put(obj, gs1Var4);
                                    m02Var.d(f12Var5, gs1Var4);
                                    m02Var2 = m02Var;
                                } else {
                                    f12Var6 = f12Var;
                                    z10 = z5;
                                    i20 = i20;
                                    j2 = jD2;
                                    w12Var2 = w12Var3;
                                    f12Var7 = f12Var2;
                                    arrayList7 = arrayList;
                                }
                                i24++;
                                i12 = i94;
                                size7 = i93;
                                linkedHashSet = linkedHashSet4;
                                iV = i95;
                                w12Var3 = w12Var2;
                                f12Var2 = f12Var7;
                                z5 = z10;
                                f12Var = f12Var6;
                                i20 = i20;
                                arrayList = arrayList7;
                                jD2 = j2;
                            }
                            linkedHashSet2 = linkedHashSet;
                            f12Var3 = f12Var;
                            i25 = i20;
                            j = jD2;
                            w12Var = w12Var3;
                            i26 = i12;
                            f12Var4 = f12Var2;
                            arrayList3 = arrayList;
                            i27 = iV;
                            if (z18) {
                                m02Var2.e = f12Var4.b;
                                m02Var2.f = (i25 - f12Var4.a) - f12Var4.d;
                                m02Var2.g = f12Var3.b;
                                m02Var2.h = (f12Var3.e - f12Var3.d) + (-f12Var3.a);
                            } else {
                                m02Var2.e = f12Var3.b;
                                m02Var2.f = f12Var3.a;
                                m02Var2.g = f12Var4.b;
                                m02Var2.h = (f12Var4.a + f12Var4.e) - i25;
                            }
                            it = linkedHashMap.entrySet().iterator();
                            while (true) {
                                zHasNext = it.hasNext();
                                w12Var = w12Var;
                                o02Var = w12Var.a;
                                if (zHasNext) {
                                    break;
                                }
                                entry = (Map.Entry) it.next();
                                linkedHashSet3 = linkedHashSet2;
                                if (linkedHashSet3.contains(entry.getKey())) {
                                    linkedHashSet2 = linkedHashSet3;
                                } else {
                                    gs1Var = (gs1) entry.getValue();
                                    long j6 = gs1Var.a;
                                    gs1Var.a = C0239D.d(((int) (j6 >> 32)) + ((int) (j >> 32)), mp1.a(j) + mp1.a(j6));
                                    num = o02Var.f().get(entry.getKey());
                                    arrayList5 = gs1Var.b;
                                    size8 = arrayList5.size();
                                    i30 = 0;
                                    while (true) {
                                        if (i30 < size8) {
                                            gs1Var2 = gs1Var;
                                            linkedHashSet2 = linkedHashSet3;
                                            i31 = i25;
                                            z6 = false;
                                            break;
                                        }
                                        c43Var = (c43) arrayList5.get(i30);
                                        long j7 = c43Var.c;
                                        long j8 = gs1Var.a;
                                        linkedHashSet2 = linkedHashSet3;
                                        i35 = size8;
                                        gs1Var2 = gs1Var;
                                        jD3 = C0239D.d(((int) (j7 >> 32)) + ((int) (j8 >> 32)), mp1.a(j8) + mp1.a(j7));
                                        if (m02Var2.c(jD3) + c43Var.a > 0) {
                                            i31 = i25;
                                            z8 = m02Var2.c(jD3) < i31;
                                            if (z8) {
                                                z6 = true;
                                                break;
                                            }
                                            i30++;
                                            i25 = i31;
                                            size8 = i35;
                                            gs1Var = gs1Var2;
                                            linkedHashSet3 = linkedHashSet2;
                                        } else {
                                            i31 = i25;
                                        }
                                        if (z8) {
                                            z6 = true;
                                            break;
                                        }
                                        i30++;
                                        i25 = i31;
                                        size8 = i35;
                                        gs1Var = gs1Var2;
                                        linkedHashSet3 = linkedHashSet2;
                                    }
                                    size9 = arrayList5.size();
                                    i32 = 0;
                                    while (true) {
                                        if (i32 < size9) {
                                            z7 = false;
                                            break;
                                        }
                                        if (((Boolean) ((c43) arrayList5.get(i32)).d.getValue()).booleanValue()) {
                                            z7 = true;
                                            break;
                                        }
                                        i32++;
                                    }
                                    boolean z19 = !z7;
                                    if ((z6 && z19) || num == null || arrayList5.isEmpty()) {
                                        i33 = i26;
                                        i34 = i27;
                                        arrayList6 = arrayList3;
                                        it.remove();
                                    } else {
                                        v12VarA = w12Var.a(num.intValue());
                                        iA = m02Var.a(num.intValue(), v12VarA.o, size6, j, z18, i31, i31, arrayList3);
                                        if (z18) {
                                            iA = (i31 - iA) - v12VarA.n;
                                        }
                                        i33 = i26;
                                        i34 = i27;
                                        f12 f12VarA2 = v12VarA.a(iA, i33, i34);
                                        arrayList6 = arrayList3;
                                        arrayList6.add(f12VarA2);
                                        m02Var2.d(f12VarA2, gs1Var2);
                                    }
                                    i26 = i33;
                                    i27 = i34;
                                    arrayList3 = arrayList6;
                                    i25 = i31;
                                }
                            }
                            i28 = i26;
                            i29 = i27;
                            arrayList4 = arrayList3;
                            m02Var2.d = o02Var.f();
                        } else {
                            m02Var.c.clear();
                            m02Var.d = ds0.w;
                            m02Var.e = -1;
                            m02Var.f = 0;
                            m02Var.g = -1;
                            m02Var.h = 0;
                            i28 = i12;
                            arrayList2 = arrayList11;
                            arrayList4 = arrayList;
                            i29 = iV;
                        }
                        if (i4 > i11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        f12Var8 = f12VarA;
                        sb2 sb2Var = (sb2) v02Var4.invoke(Integer.valueOf(i28), Integer.valueOf(i29), new a12(arrayList4, f12Var8));
                        if (z) {
                            arrayList9 = arrayList4;
                        } else {
                            arrayList8 = new ArrayList(arrayList4.size());
                            size11 = arrayList4.size();
                            for (i38 = 0; i38 < size11; i38++) {
                                obj2 = arrayList4.get(i38);
                                f12Var9 = (f12) obj2;
                                if (f12Var9.b >= ((v12) wu.H0(arrayList2)).a) {
                                    if (f12Var9.b > ((v12) wu.N0(arrayList2)).a) {
                                        z12 = true;
                                    } else if (f12Var9 == f12Var8) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                } else if (f12Var9 == f12Var8) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    arrayList8.add(obj2);
                                }
                            }
                            arrayList9 = arrayList8;
                        }
                        b12Var = new b12(v12Var4, i6, z11, f, sb2Var, arrayList9, i70, i63);
                        q12Var = q12Var5;
                    } else {
                        i7 = iMax;
                    }
                    list = cs0Var;
                    if (h02Var.a.k()) {
                        i55 = i63 - 1;
                        if (((v12) wu.N0(arrayList11)).a < Math.min(h02Var.a(), i55)) {
                            arrayList10 = new ArrayList();
                            i56 = ((v12) wu.N0(arrayList11)).a;
                            iMin2 = Math.min(h02Var.a(), i55);
                            while (i56 < iMin2) {
                                i56++;
                                arrayList10.add(w12Var3.a(i56));
                            }
                            sd5 sd5Var5 = sd5.a;
                            list2 = arrayList10;
                        } else {
                            list2 = cs0Var;
                        }
                    } else {
                        list2 = cs0Var;
                    }
                    if (!ur1.a(v12Var, wu.H0(arrayList11))) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z15) {
                        i8 = i7;
                    } else {
                        i8 = i4;
                    }
                    iW = FWT.w(i8, jF);
                    if (z15) {
                        i9 = i4;
                    } else {
                        i9 = i7;
                    }
                    iV = FWT.v(i9, jF);
                    if (z15) {
                        i10 = iV;
                    } else {
                        i10 = iW;
                    }
                    if (i4 < Math.min(i10, iG2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (i86 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    v12 v12Var8 = v12Var;
                    arrayList = new ArrayList(list2.size() + list.size() + arrayList11.size());
                    if (z2) {
                        if (list.isEmpty()) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        size14 = arrayList11.size();
                        iArr = new int[size14];
                        while (i47 < size14) {
                            if (z18) {
                                i54 = i47;
                            } else {
                                i54 = (size14 - i47) - 1;
                            }
                            iArr[i47] = ((v12) arrayList11.get(i54)).n;
                        }
                        iArr2 = new int[size14];
                        while (i48 < size14) {
                            iArr2[i48] = 0;
                        }
                        if (z15) {
                            if (fjcm != null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            fjcm.b(c02Var2, i10, iArr, iArr2);
                            iArr3 = iArr2;
                            i11 = iG2;
                            z3 = true;
                            i12 = iW;
                        } else {
                            if (lPt8 != null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            i12 = iW;
                            iArr3 = iArr2;
                            i11 = iG2;
                            z3 = true;
                            lPt8.c(i10, c02Var2, jy1.Ltr, iArr, iArr3);
                        }
                        pp1Var = new pp1(0, size14 - 1);
                        if (z18) {
                            pp1Var = new np1(pp1Var.x, 0, -pp1Var.y);
                        }
                        i49 = pp1Var.w;
                        i50 = pp1Var.x;
                        i51 = pp1Var.y;
                        if (i51 > 0) {
                            while (true) {
                                i52 = iArr3[i49];
                                if (z18) {
                                    i53 = i49;
                                } else {
                                    i53 = (size14 - i49) - 1;
                                }
                                v12Var2 = (v12) arrayList11.get(i53);
                                if (z18) {
                                    i52 = (i10 - i52) - v12Var2.n;
                                }
                                arrayList.add(v12Var2.a(i52, i12, iV));
                                if (i49 == i50) {
                                    break;
                                    break;
                                }
                                i49 += i51;
                            }
                        } else {
                            while (true) {
                                i52 = iArr3[i49];
                                if (z18) {
                                    i53 = i49;
                                } else {
                                    i53 = (size14 - i49) - 1;
                                }
                                v12Var2 = (v12) arrayList11.get(i53);
                                if (z18) {
                                    i52 = (i10 - i52) - v12Var2.n;
                                }
                                arrayList.add(v12Var2.a(i52, i12, iV));
                                if (i49 == i50) {
                                    break;
                                    break;
                                }
                                i49 += i51;
                            }
                        }
                    } else {
                        i11 = iG2;
                        i63 = i63;
                        z3 = true;
                        i4 = i4;
                        i12 = iW;
                        size = list.size();
                        i13 = i86;
                        while (i14 < size) {
                            v12 v12Var9 = (v12) list.get(i14);
                            i13 -= v12Var9.o;
                            arrayList.add(v12Var9.a(i13, i12, iV));
                        }
                        size2 = arrayList11.size();
                        i15 = i86;
                        while (i16 < size2) {
                            v12 v12Var10 = (v12) arrayList11.get(i16);
                            arrayList.add(v12Var10.a(i15, i12, iV));
                            i15 += v12Var10.o;
                        }
                        size3 = list2.size();
                        while (i17 < size3) {
                            v12 v12Var11 = (v12) list2.get(i17);
                            arrayList.add(v12Var11.a(i15, i12, iV));
                            i15 += v12Var11.o;
                        }
                    }
                    if (list5.isEmpty() ^ z3) {
                        i39 = ((f12) wu.H0(arrayList)).b;
                        size12 = list5.size();
                        i40 = 0;
                        iIntValue = -1;
                        iIntValue2 = -1;
                        while (i40 < size12) {
                            list3 = list5;
                            if (list3.get(i40).intValue() <= i39) {
                                break;
                                break;
                            }
                            iIntValue2 = list3.get(i40).intValue();
                            i40++;
                            if (i40 >= 0) {
                                num3 = -1;
                            } else {
                                num3 = -1;
                            }
                            iIntValue = num3.intValue();
                            list5 = list3;
                        }
                        size13 = arrayList.size();
                        i42 = -1;
                        i43 = Integer.MIN_VALUE;
                        i44 = Integer.MIN_VALUE;
                        while (i41 < size13) {
                            f12 f12Var12 = (f12) arrayList.get(i41);
                            i45 = f12Var12.b;
                            i46 = f12Var12.a;
                            if (i45 == iIntValue2) {
                                i43 = i46;
                                i42 = i41;
                            } else if (i45 == iIntValue) {
                                i44 = i46;
                            }
                        }
                        if (iIntValue2 == -1) {
                            f12VarA = null;
                        } else {
                            v12VarA2 = w12Var3.a(iIntValue2);
                            if (i43 != Integer.MIN_VALUE) {
                                iMin = Math.max(i3, i43);
                            } else {
                                iMin = i3;
                            }
                            if (i44 != Integer.MIN_VALUE) {
                                iMin = Math.min(iMin, i44 - v12VarA2.n);
                            }
                            f12VarA = v12VarA2.a(iMin, i12, iV);
                            if (i42 != -1) {
                                arrayList.set(i42, f12VarA);
                            } else {
                                arrayList.add(0, f12VarA);
                            }
                        }
                    } else {
                        f12VarA = null;
                    }
                    i18 = (int) f;
                    size4 = arrayList.size();
                    i19 = 0;
                    while (true) {
                        if (i19 < size4) {
                            z4 = false;
                            break;
                        }
                        if (((f12) arrayList.get(i19)).l) {
                            z4 = true;
                            break;
                        }
                        i19++;
                    }
                    m02Var = this.D;
                    if (z4) {
                        m02Var.c.clear();
                        m02Var.d = ds0.w;
                        m02Var.e = -1;
                        m02Var.f = 0;
                        m02Var.g = -1;
                        m02Var.h = 0;
                        i28 = i12;
                        arrayList2 = arrayList11;
                        arrayList4 = arrayList;
                        i29 = iV;
                    } else {
                        z5 = m02Var.b;
                        if (z5) {
                            i20 = iV;
                        } else {
                            i20 = i12;
                        }
                        if (z18) {
                            i18 = -i18;
                        }
                        if (z5) {
                            i21 = 0;
                        } else {
                            i21 = i18;
                        }
                        if (!z5) {
                            i18 = 0;
                        }
                        jD2 = C0239D.d(i21, i18);
                        f12Var = (f12) wu.H0(arrayList);
                        f12Var2 = (f12) wu.N0(arrayList);
                        size5 = arrayList.size();
                        i22 = 0;
                        i23 = 0;
                        while (true) {
                            linkedHashMap = m02Var.c;
                            if (i22 < size5) {
                                break;
                                break;
                            }
                            int i97 = size5;
                            f12 f12Var13 = (f12) arrayList.get(i22);
                            ArrayList arrayList14 = arrayList11;
                            i23 += f12Var13.e;
                            i22++;
                            arrayList11 = arrayList14;
                            size5 = i97;
                        }
                        arrayList2 = arrayList11;
                        size6 = i23 / arrayList.size();
                        linkedHashSet = m02Var.i;
                        linkedHashSet.clear();
                        size7 = arrayList.size();
                        m02Var2 = m02Var;
                        i24 = 0;
                        while (i24 < size7) {
                            int i98 = size7;
                            f12Var5 = (f12) arrayList.get(i24);
                            int i99 = i12;
                            linkedHashSet.add(f12Var5.c);
                            obj = f12Var5.c;
                            int i910 = iV;
                            gs1Var3 = (gs1) linkedHashMap.get(obj);
                            LinkedHashSet linkedHashSet5 = linkedHashSet;
                            z9 = f12Var5.l;
                            if (gs1Var3 == null) {
                                f12Var6 = f12Var;
                                z10 = z5;
                                i20 = i20;
                                j2 = jD2;
                                w12Var2 = w12Var3;
                                f12Var7 = f12Var2;
                                arrayList7 = arrayList;
                                if (z9) {
                                    long j9 = gs1Var3.a;
                                    gs1Var3.a = C0239D.d(((int) (j9 >> 32)) + ((int) (j2 >> 32)), mp1.a(j2) + mp1.a(j9));
                                    m02Var2.d(f12Var5, gs1Var3);
                                } else {
                                    linkedHashMap.remove(obj);
                                }
                            } else if (z9) {
                                gs1Var4 = new gs1();
                                num2 = m02Var2.d.get(obj);
                                f12Var6 = f12Var;
                                w12Var2 = w12Var3;
                                jD4 = f12Var5.d(0);
                                iC = f12Var5.c(0);
                                if (num2 == null) {
                                    iC3 = m02Var2.c(jD4);
                                } else {
                                    if (z18) {
                                        iC2 = m02Var2.c(jD4);
                                    } else {
                                        iC2 = (m02Var2.c(jD4) - f12Var5.e) + iC;
                                    }
                                    int iA3 = m02Var.a(num2.intValue(), f12Var5.e, size6, jD2, z18, i20, iC2, arrayList);
                                    if (z18) {
                                        i36 = f12Var5.d - iC;
                                    } else {
                                        i36 = 0;
                                    }
                                    iC3 = iA3 + i36;
                                }
                                if (z5) {
                                    jD5 = C0239D.d((int) (jD4 >> 32), iC3);
                                } else {
                                    jD5 = C0239D.d(iC3, mp1.a(jD4));
                                }
                                size10 = f12Var5.i.size();
                                i37 = 0;
                                while (i37 < size10) {
                                    long jD8 = f12Var5.d(i37);
                                    long j10 = jD2;
                                    long jD9 = C0239D.d(((int) (jD8 >> 32)) - ((int) (jD4 >> 32)), mp1.a(jD8) - mp1.a(jD4));
                                    int i911 = size10;
                                    gs1Var4.b.add(new c43(f12Var5.c(i37), C0239D.d(((int) (jD5 >> 32)) + ((int) (jD9 >> 32)), mp1.a(jD9) + mp1.a(jD5))));
                                    sd5 sd5Var6 = sd5.a;
                                    i37++;
                                    size10 = i911;
                                    obj = obj;
                                    f12Var2 = f12Var2;
                                    jD4 = jD4;
                                    z5 = z5;
                                    arrayList = arrayList;
                                    jD2 = j10;
                                }
                                j2 = jD2;
                                z10 = z5;
                                f12Var7 = f12Var2;
                                arrayList7 = arrayList;
                                linkedHashMap.put(obj, gs1Var4);
                                m02Var.d(f12Var5, gs1Var4);
                                m02Var2 = m02Var;
                            } else {
                                f12Var6 = f12Var;
                                z10 = z5;
                                i20 = i20;
                                j2 = jD2;
                                w12Var2 = w12Var3;
                                f12Var7 = f12Var2;
                                arrayList7 = arrayList;
                            }
                            i24++;
                            i12 = i99;
                            size7 = i98;
                            linkedHashSet = linkedHashSet5;
                            iV = i910;
                            w12Var3 = w12Var2;
                            f12Var2 = f12Var7;
                            z5 = z10;
                            f12Var = f12Var6;
                            i20 = i20;
                            arrayList = arrayList7;
                            jD2 = j2;
                        }
                        linkedHashSet2 = linkedHashSet;
                        f12Var3 = f12Var;
                        i25 = i20;
                        j = jD2;
                        w12Var = w12Var3;
                        i26 = i12;
                        f12Var4 = f12Var2;
                        arrayList3 = arrayList;
                        i27 = iV;
                        if (z18) {
                            m02Var2.e = f12Var3.b;
                            m02Var2.f = f12Var3.a;
                            m02Var2.g = f12Var4.b;
                            m02Var2.h = (f12Var4.a + f12Var4.e) - i25;
                        } else {
                            m02Var2.e = f12Var4.b;
                            m02Var2.f = (i25 - f12Var4.a) - f12Var4.d;
                            m02Var2.g = f12Var3.b;
                            m02Var2.h = (f12Var3.e - f12Var3.d) + (-f12Var3.a);
                        }
                        it = linkedHashMap.entrySet().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            w12Var = w12Var;
                            o02Var = w12Var.a;
                            if (zHasNext) {
                                break;
                                break;
                            }
                            entry = (Map.Entry) it.next();
                            linkedHashSet3 = linkedHashSet2;
                            if (linkedHashSet3.contains(entry.getKey())) {
                                gs1Var = (gs1) entry.getValue();
                                long j11 = gs1Var.a;
                                gs1Var.a = C0239D.d(((int) (j11 >> 32)) + ((int) (j >> 32)), mp1.a(j) + mp1.a(j11));
                                num = o02Var.f().get(entry.getKey());
                                arrayList5 = gs1Var.b;
                                size8 = arrayList5.size();
                                i30 = 0;
                                while (true) {
                                    if (i30 < size8) {
                                        gs1Var2 = gs1Var;
                                        linkedHashSet2 = linkedHashSet3;
                                        i31 = i25;
                                        z6 = false;
                                        break;
                                    }
                                    c43Var = (c43) arrayList5.get(i30);
                                    long j12 = c43Var.c;
                                    long j13 = gs1Var.a;
                                    linkedHashSet2 = linkedHashSet3;
                                    i35 = size8;
                                    gs1Var2 = gs1Var;
                                    jD3 = C0239D.d(((int) (j12 >> 32)) + ((int) (j13 >> 32)), mp1.a(j13) + mp1.a(j12));
                                    if (m02Var2.c(jD3) + c43Var.a > 0) {
                                        i31 = i25;
                                        if (m02Var2.c(jD3) < i31) {
                                        }
                                        if (z8) {
                                            z6 = true;
                                            break;
                                        }
                                        i30++;
                                        i25 = i31;
                                        size8 = i35;
                                        gs1Var = gs1Var2;
                                        linkedHashSet3 = linkedHashSet2;
                                    } else {
                                        i31 = i25;
                                    }
                                    if (z8) {
                                        z6 = true;
                                        break;
                                    }
                                    i30++;
                                    i25 = i31;
                                    size8 = i35;
                                    gs1Var = gs1Var2;
                                    linkedHashSet3 = linkedHashSet2;
                                }
                                size9 = arrayList5.size();
                                i32 = 0;
                                while (true) {
                                    if (i32 < size9) {
                                        z7 = false;
                                        break;
                                    }
                                    if (((Boolean) ((c43) arrayList5.get(i32)).d.getValue()).booleanValue()) {
                                        z7 = true;
                                        break;
                                    }
                                    i32++;
                                }
                                boolean z110 = !z7;
                                if (z6) {
                                    v12VarA = w12Var.a(num.intValue());
                                    iA = m02Var.a(num.intValue(), v12VarA.o, size6, j, z18, i31, i31, arrayList3);
                                    if (z18) {
                                        iA = (i31 - iA) - v12VarA.n;
                                    }
                                    i33 = i26;
                                    i34 = i27;
                                    f12 f12VarA3 = v12VarA.a(iA, i33, i34);
                                    arrayList6 = arrayList3;
                                    arrayList6.add(f12VarA3);
                                    m02Var2.d(f12VarA3, gs1Var2);
                                } else {
                                    v12VarA = w12Var.a(num.intValue());
                                    iA = m02Var.a(num.intValue(), v12VarA.o, size6, j, z18, i31, i31, arrayList3);
                                    if (z18) {
                                        iA = (i31 - iA) - v12VarA.n;
                                    }
                                    i33 = i26;
                                    i34 = i27;
                                    f12 f12VarA4 = v12VarA.a(iA, i33, i34);
                                    arrayList6 = arrayList3;
                                    arrayList6.add(f12VarA4);
                                    m02Var2.d(f12VarA4, gs1Var2);
                                }
                                i26 = i33;
                                i27 = i34;
                                arrayList3 = arrayList6;
                                i25 = i31;
                            } else {
                                linkedHashSet2 = linkedHashSet3;
                            }
                        }
                        i28 = i26;
                        i29 = i27;
                        arrayList4 = arrayList3;
                        m02Var2.d = o02Var.f();
                    }
                    if (i4 > i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f12Var8 = f12VarA;
                    sb2 sb2Var2 = (sb2) v02Var4.invoke(Integer.valueOf(i28), Integer.valueOf(i29), new a12(arrayList4, f12Var8));
                    if (z) {
                        arrayList9 = arrayList4;
                    } else {
                        arrayList8 = new ArrayList(arrayList4.size());
                        size11 = arrayList4.size();
                        while (i38 < size11) {
                            obj2 = arrayList4.get(i38);
                            f12Var9 = (f12) obj2;
                            if (f12Var9.b >= ((v12) wu.H0(arrayList2)).a) {
                                if (f12Var9.b > ((v12) wu.N0(arrayList2)).a) {
                                    z12 = true;
                                } else if (f12Var9 == f12Var8) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } else if (f12Var9 == f12Var8) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList8.add(obj2);
                            }
                        }
                        arrayList9 = arrayList8;
                    }
                    b12Var = new b12(v12Var8, i6, z11, f, sb2Var2, arrayList9, i70, i63);
                    q12Var = q12Var5;
                }
                j12 j12Var = q12Var.a;
                j12Var.getClass();
                v12 v12Var12 = b12Var.a;
                j12Var.d = v12Var12 != null ? v12Var12.m : null;
                boolean z20 = j12Var.c;
                int i100 = b12Var.b;
                if (z20 || b12Var.g > 0) {
                    j12Var.c = true;
                    if (!(((float) i100) >= 0.0f)) {
                        throw new IllegalStateException(("scrollOffset should be non-negative (" + i100 + ')').toString());
                    }
                    cp4 cp4VarF2 = ip4.f((cp4) ip4.b.h(), null, false);
                    try {
                        cp4 cp4VarI2 = cp4VarF2.i();
                        if (v12Var12 != null) {
                            try {
                                i57 = v12Var12.a;
                            } catch (Throwable th) {
                                try {
                                    cp4.o(cp4VarI2);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cp4VarF2.c();
                                    throw th;
                                }
                            }
                        } else {
                            i57 = 0;
                        }
                        j12Var.a(i57, i100);
                        sd5 sd5Var7 = sd5.a;
                        cp4.o(cp4VarI2);
                        cp4VarF2.c();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                q12Var.d -= b12Var.d;
                q12Var.b.setValue(b12Var);
                boolean z21 = b12Var.c;
                q12Var.q = z21;
                q12Var.p = ((v12Var12 != null ? v12Var12.a : 0) == 0 && i100 == 0) ? false : true;
                this.H.setEnabled(z21 || ((v12Var12 != null ? v12Var12.a : 0) != 0 || i100 != 0));
                return b12Var;
            } catch (Throwable th4) {
                cp4.o(cp4VarI);
                throw th4;
            }
        } catch (Throwable th5) {
            cp4VarF.c();
            throw th5;
        }
    }
}
