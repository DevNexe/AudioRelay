package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.azefsw.audioconnect.network.exceptions.MessageException;
import com.azefsw.audioconnect.player.exceptions.MissingRequiredFeatureException;
import com.azefsw.audioconnect.player.exceptions.ServerVersionTooLowException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzfqm;
import com.google.android.gms.internal.ads.zzfqn;
import com.google.protobuf.QnHx;
import com.google.protobuf.SjP;
import com.google.protobuf.lPt3Fixed;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pq2 implements zzfqn, y96, fk2 {
    public Object w;

    public /* synthetic */ pq2(Object obj) {
        this.w = obj;
    }

    public static ax i(String str, h81 h81Var) {
        return new ax(((qw) h81Var.invoke()).d(new rq1(str, 7)), new xW8n(str, 2));
    }

    @Override // defpackage.fk2
    public final File a() {
        return ((nf4) this.w).d;
    }

    @Override // defpackage.fk2
    public final File b() {
        return ((nf4) this.w).f;
    }

    @Override // defpackage.fk2
    public final File c() {
        return ((nf4) this.w).e;
    }

    @Override // defpackage.fk2
    public final File d() {
        return ((nf4) this.w).a;
    }

    @Override // defpackage.fk2
    public final File e() {
        return ((nf4) this.w).c;
    }

    @Override // defpackage.fk2
    public final File f() {
        return ((nf4) this.w).b;
    }

    public final void g(hu4 hu4Var) {
        byte[] bArr;
        SortedMap sortedMap = (SortedMap) this.w;
        Long lValueOf = Long.valueOf(hu4Var.z);
        lk lkVar = hu4Var.B;
        int size = lkVar.size();
        if (size == 0) {
            bArr = SjP.c;
        } else {
            byte[] bArr2 = new byte[size];
            lkVar.e(size, bArr2);
            bArr = bArr2;
        }
        hu4.CQf cQfS = hu4.G.c();
        cQfS.A = hu4Var.z;
        cQfS.M();
        cQfS.B = hu4Var.A;
        cQfS.M();
        lk.YKK ykk = lk.x;
        cQfS.C = new lk.YKK(bArr);
        cQfS.M();
        cQfS.D = hu4Var.C;
        cQfS.M();
        sortedMap.put(lValueOf, cQfS.build());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0115  */
    /* JADX WARN: Code duplicated, block: B:50:0x0169  */
    /* JADX WARN: Code duplicated, block: B:56:0x017a  */
    /* JADX WARN: Code duplicated, block: B:62:0x018b  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb  */
    public final h50 h(InputStream inputStream, OutputStream outputStream, bs bsVar) throws MissingRequiredFeatureException, IOException, ServerVersionTooLowException {
        rf3 rf3Var;
        w40 w40Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        h50 h50Var;
        try {
            cg3 cg3Var = (cg3) lPt3Fixed.P(cg3.G, inputStream);
            if (cg3Var == null) {
                int i = MessageException.x;
                throw MessageException.QnHx.b();
            }
            a62 a62Var = a62.a;
            String strV = cg3Var.V();
            vf3 vf3VarA = vf3.a(cg3Var.B);
            if (vf3VarA == null) {
                vf3VarA = vf3.UNRECOGNIZED;
            }
            a62Var.c("Received server config, server: " + strV + ", os: " + vf3VarA + ", osVersion: " + cg3Var.U());
            uw0 uw0VarA = ((es) this.w).a();
            of3.CQf cQfY = of3.N.c();
            String strY0 = bsVar.y0();
            strY0.getClass();
            cQfY.A = strY0;
            cQfY.M();
            h04 h04Var = bsVar.z;
            cQfY.J = h04Var.b;
            cQfY.M();
            String str = bsVar.w;
            str.getClass();
            cQfY.B = str;
            cQfY.M();
            cQfY.I = uw0VarA;
            cQfY.M();
            cQfY.C = 48000;
            cQfY.M();
            cQfY.D = 16;
            cQfY.M();
            cQfY.E = 2;
            cQfY.M();
            Sb1 sb1 = bsVar.A;
            cQfY.F = sb1.a;
            cQfY.M();
            cQfY.G = sb1.b;
            cQfY.M();
            cQfY.H = sb1.c;
            cQfY.M();
            cQfY.L = g7.i(bsVar.x).b();
            cQfY.M();
            String str2 = bsVar.y;
            str2.getClass();
            cQfY.K = str2;
            cQfY.M();
            cQfY.M = FWT.H(h04Var);
            cQfY.M();
            of3 of3VarQ = cQfY.f();
            if (!of3VarQ.isInitialized()) {
                throw QnHx.AbstractC0099QnHx.C(of3VarQ);
            }
            of3VarQ.A(outputStream);
            outputStream.flush();
            if (!v84.a(cg3Var.V(), "0.7.0")) {
                throw new ServerVersionTooLowException(cg3Var.V());
            }
            try {
                uw0 uw0Var = (uw0) lPt3Fixed.P(uw0.I, inputStream);
                if (uw0Var == null) {
                    int i2 = MessageException.x;
                    throw MessageException.QnHx.b();
                }
                w40 w40Var2 = null;
                if (uw0Var.a0() && uw0Var.T().z) {
                    try {
                        rf3Var = (rf3) lPt3Fixed.P(rf3.E, inputStream);
                        if (rf3Var == null) {
                            int i3 = MessageException.x;
                            throw MessageException.QnHx.b();
                        }
                        if (!rf3Var.z) {
                            rf3Var = null;
                        }
                    } catch (Throwable th) {
                        int i4 = MessageException.x;
                        throw MessageException.QnHx.a(th);
                    }
                } else {
                    rf3Var = null;
                }
                yb4 yb4VarW = OW8.w(cg3Var);
                e51 e51Var = rf3Var != null ? new e51(new ig(rf3Var.S().z, rf3Var.S().A)) : null;
                if (rf3Var == null) {
                    if (!uw0Var.Z()) {
                        w40Var = w40.a;
                    } else if (uw0Var.S().z) {
                        w40Var2 = w40.a;
                    }
                    if (uw0Var.c0() || !uw0Var.V().z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (uw0Var.b0() || !uw0Var.U().z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (uw0Var.f0() || !uw0Var.Y().z) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (uw0Var.d0() || !uw0Var.W().z) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (uw0Var.e0() || !uw0Var.X().z) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    h50Var = new h50(yb4VarW, new m63(w40Var, z, z2, z3, z4, z5), e51Var);
                    if (z3) {
                        return h50Var;
                    }
                    throw new MissingRequiredFeatureException();
                }
                if (rf3Var.T().z) {
                    w40Var2 = w40.a;
                }
                w40Var = w40Var2;
                if (uw0Var.c0()) {
                    z = false;
                } else {
                    z = false;
                }
                if (uw0Var.b0()) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (uw0Var.f0()) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (uw0Var.d0()) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (uw0Var.e0()) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                h50Var = new h50(yb4VarW, new m63(w40Var, z, z2, z3, z4, z5), e51Var);
                if (z3) {
                    return h50Var;
                }
                throw new MissingRequiredFeatureException();
            } catch (Throwable th2) {
                int i5 = MessageException.x;
                throw MessageException.QnHx.a(th2);
            }
        } catch (Throwable th3) {
            int i6 = MessageException.x;
            throw MessageException.QnHx.a(th3);
        }
    }

    public final ax j(final String str, final int i, j81 j81Var) {
        int i2 = 5;
        return new ax(new gl4(new il4(new Callable() { // from class: k83
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final String str2 = str;
                final pq2 pq2Var = this;
                final int i3 = i;
                return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: m83
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Thread thread = new Thread(runnable);
                        thread.setName(str2);
                        ((h75) pq2Var.w).j(i3);
                        return thread;
                    }
                });
            }
        }), new D(j81Var, 16)).d(new dc(str, i2)), new w52(str, i2));
    }

    public final ZCR k() {
        return (ZCR) this.w;
    }

    public final JSONObject l() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.w;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(kw.l(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        kw.a(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    kw.a(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            kw.a(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            kw.a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public final void m(int i, String str, List list, boolean z, boolean z2) {
        wh6 wh6Var;
        int i2 = i - 1;
        if (i2 == 0) {
            bi6 bi6Var = ((wl6) this.w).a.i;
            dq6.h(bi6Var);
            wh6Var = bi6Var.m;
        } else if (i2 != 1) {
            if (i2 == 3) {
                bi6 bi6Var2 = ((wl6) this.w).a.i;
                dq6.h(bi6Var2);
                wh6Var = bi6Var2.n;
            } else if (i2 != 4) {
                bi6 bi6Var3 = ((wl6) this.w).a.i;
                dq6.h(bi6Var3);
                wh6Var = bi6Var3.l;
            } else if (z) {
                bi6 bi6Var4 = ((wl6) this.w).a.i;
                dq6.h(bi6Var4);
                wh6Var = bi6Var4.j;
            } else if (z2) {
                bi6 bi6Var5 = ((wl6) this.w).a.i;
                dq6.h(bi6Var5);
                wh6Var = bi6Var5.i;
            } else {
                bi6 bi6Var6 = ((wl6) this.w).a.i;
                dq6.h(bi6Var6);
                wh6Var = bi6Var6.k;
            }
        } else if (z) {
            bi6 bi6Var7 = ((wl6) this.w).a.i;
            dq6.h(bi6Var7);
            wh6Var = bi6Var7.g;
        } else if (z2) {
            bi6 bi6Var8 = ((wl6) this.w).a.i;
            dq6.h(bi6Var8);
            wh6Var = bi6Var8.f;
        } else {
            bi6 bi6Var9 = ((wl6) this.w).a.i;
            dq6.h(bi6Var9);
            wh6Var = bi6Var9.h;
        }
        int size = list.size();
        if (size == 1) {
            wh6Var.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            wh6Var.d(list.get(0), str, list.get(1));
        } else if (size != 3) {
            wh6Var.b(str);
        } else {
            wh6Var.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public final void zza(zzfqm zzfqmVar) {
        zzw zzwVar = (zzw) this.w;
        zzwVar.getClass();
        if (!TextUtils.isEmpty(zzfqmVar.zzb())) {
            if (!((Boolean) zzay.zzc().zzb(zzbiy.zziM)).booleanValue()) {
                zzwVar.a = zzfqmVar.zzb();
            }
        }
        switch (zzfqmVar.zza()) {
            case 8152:
                zzcha.zze.execute(new zzu(zzwVar, "onLMDOverlayOpened", new HashMap()));
                break;
            case 8153:
                zzcha.zze.execute(new zzu(zzwVar, "onLMDOverlayClicked", new HashMap()));
                break;
            case 8155:
                zzcha.zze.execute(new zzu(zzwVar, "onLMDOverlayClose", new HashMap()));
                break;
            case 8157:
                zzwVar.a = null;
                zzwVar.b = null;
                zzwVar.e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzfqmVar.zza()));
                zzcha.zze.execute(new zzu(zzwVar, "onLMDOverlayFailedToOpen", map));
                break;
        }
    }

    @Override // defpackage.y96
    public final /* synthetic */ Object zzb() {
        return new ta2(((ix5) this.w).b);
    }

    public /* synthetic */ pq2(mm1 mm1Var) {
        this.w = mm1Var;
    }

    public /* synthetic */ pq2(ad4 ad4Var) {
        this.w = ad4Var;
    }

    public /* synthetic */ pq2(h75 h75Var) {
        this.w = h75Var;
    }

    public /* synthetic */ pq2(id4 id4Var) {
        this.w = id4Var;
    }

    public /* synthetic */ pq2(es esVar) {
        this.w = esVar;
    }

    public pq2(fx0 fx0Var) {
        this.w = new File(fx0Var.b, "com.crashlytics.settings.json");
    }

    public pq2(int i) {
        if (i == 2) {
            this.w = new ArrayList();
            return;
        }
        if (i == 3) {
            this.w = ib1.a(Looper.getMainLooper());
        } else {
            if (i != 6) {
                this.w = new ZCR();
                return;
            }
            TreeMap treeMap = new TreeMap();
            t92.T(treeMap, new uy2[0]);
            this.w = treeMap;
        }
    }
}
