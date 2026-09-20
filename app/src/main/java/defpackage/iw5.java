package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.CQf;
import com.android.billingclient.api.T23;
import com.android.billingclient.api.auxFixed;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw5 implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ iw5(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb A[Catch: Exception -> 0x0103, TryCatch #2 {Exception -> 0x0103, blocks: (B:21:0x003c, B:27:0x0058, B:31:0x0061, B:35:0x0068, B:37:0x006c, B:41:0x0079, B:44:0x0090, B:45:0x0095, B:42:0x0084, B:46:0x0098, B:50:0x00a1, B:54:0x00aa, B:58:0x00b3, B:62:0x00bc, B:66:0x00c5, B:70:0x00ce, B:74:0x00d7, B:78:0x00e0, B:82:0x00e7, B:84:0x00eb, B:86:0x00f4, B:87:0x00fa, B:25:0x0054, B:22:0x0047), top: B:105:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4 A[Catch: Exception -> 0x0103, TryCatch #2 {Exception -> 0x0103, blocks: (B:21:0x003c, B:27:0x0058, B:31:0x0061, B:35:0x0068, B:37:0x006c, B:41:0x0079, B:44:0x0090, B:45:0x0095, B:42:0x0084, B:46:0x0098, B:50:0x00a1, B:54:0x00aa, B:58:0x00b3, B:62:0x00bc, B:66:0x00c5, B:70:0x00ce, B:74:0x00d7, B:78:0x00e0, B:82:0x00e7, B:84:0x00eb, B:86:0x00f4, B:87:0x00fa, B:25:0x0054, B:22:0x0047), top: B:105:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa A[Catch: Exception -> 0x0103, TRY_LEAVE, TryCatch #2 {Exception -> 0x0103, blocks: (B:21:0x003c, B:27:0x0058, B:31:0x0061, B:35:0x0068, B:37:0x006c, B:41:0x0079, B:44:0x0090, B:45:0x0095, B:42:0x0084, B:46:0x0098, B:50:0x00a1, B:54:0x00aa, B:58:0x00b3, B:62:0x00bc, B:66:0x00c5, B:70:0x00ce, B:74:0x00d7, B:78:0x00e0, B:82:0x00e7, B:84:0x00eb, B:86:0x00f4, B:87:0x00fa, B:25:0x0054, B:22:0x0047), top: B:105:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        int iG;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        switch (this.w) {
            case 0:
                auxFixed auxVar = (auxFixed) this.x;
                synchronized (auxVar.a) {
                    if (!auxVar.b) {
                        if (TextUtils.isEmpty(null)) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("accountName", null);
                        }
                        int i2 = 3;
                        try {
                            String packageName = auxVar.d.e.getPackageName();
                            int i3 = 17;
                            iG = 3;
                            while (true) {
                                if (i3 >= 3) {
                                    if (bundle == null) {
                                        try {
                                            iG = auxVar.d.f.g(i3, packageName, "subs");
                                        } catch (Exception e) {
                                            e = e;
                                            i2 = iG;
                                            a36.g("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            auxVar.d.a = 0;
                                            auxVar.d.f = null;
                                            iG = i2;
                                        }
                                    } else {
                                        iG = auxVar.d.f.w0(i3, packageName, "subs", bundle);
                                    }
                                    if (iG != 0) {
                                        i3--;
                                    }
                                } else {
                                    i3 = 0;
                                }
                            }
                            CQf cQf = auxVar.d;
                            boolean z9 = true;
                            cQf.i = i3 >= 5;
                            cQf.h = i3 >= 3;
                            if (i3 < 3) {
                                a36.e("BillingClient", "In-app billing API does not support subscription on this device.");
                            }
                            for (int i4 = 17; i4 >= 3; i4--) {
                                iG = bundle == null ? auxVar.d.f.g(i4, packageName, "inapp") : auxVar.d.f.w0(i4, packageName, "inapp", bundle);
                                if (iG == 0) {
                                    auxVar.d.j = i4;
                                    CQf cQf2 = auxVar.d;
                                    i = cQf2.j;
                                    if (i >= 17) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    cQf2.s = z;
                                    if (i >= 16) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    cQf2.r = z2;
                                    if (i >= 15) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    cQf2.q = z3;
                                    if (i >= 14) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    cQf2.p = z4;
                                    if (i >= 12) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    cQf2.o = z5;
                                    if (i >= 10) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    cQf2.n = z6;
                                    if (i >= 9) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    cQf2.m = z7;
                                    if (i >= 8) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    cQf2.l = z8;
                                    if (i >= 6) {
                                        z9 = false;
                                    }
                                    cQf2.k = z9;
                                    if (i < 3) {
                                        a36.f("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    }
                                    if (iG == 0) {
                                        auxVar.d.a = 2;
                                    } else {
                                        auxVar.d.a = 0;
                                        auxVar.d.f = null;
                                    }
                                    if (iG == 0) {
                                        auxVar.a(T23.k);
                                    } else {
                                        auxVar.a(T23.a);
                                    }
                                }
                            }
                            CQf cQf3 = auxVar.d;
                            i = cQf3.j;
                            if (i >= 17) {
                                z = true;
                            } else {
                                z = false;
                            }
                            cQf3.s = z;
                            if (i >= 16) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            cQf3.r = z2;
                            if (i >= 15) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            cQf3.q = z3;
                            if (i >= 14) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            cQf3.p = z4;
                            if (i >= 12) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            cQf3.o = z5;
                            if (i >= 10) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            cQf3.n = z6;
                            if (i >= 9) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            cQf3.m = z7;
                            if (i >= 8) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            cQf3.l = z8;
                            if (i >= 6) {
                                z9 = false;
                            }
                            cQf3.k = z9;
                            if (i < 3) {
                                a36.f("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            }
                            if (iG == 0) {
                                auxVar.d.a = 2;
                            } else {
                                auxVar.d.a = 0;
                                auxVar.d.f = null;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (iG == 0) {
                            auxVar.a(T23.k);
                        } else {
                            auxVar.a(T23.a);
                        }
                    }
                }
                return null;
            default:
                return new n17(((x66) this.x).c);
        }
    }
}
