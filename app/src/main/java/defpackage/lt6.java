package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnn;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgoy;
import com.google.android.gms.internal.ads.zzgoz;
import com.google.android.gms.internal.ads.zzgpf;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lt6 {
    public final zzgnn a;
    public int b;
    public int c;
    public int d = 0;

    public lt6(zzgnn zzgnnVar) {
        Charset charset = zzgox.a;
        if (zzgnnVar == null) {
            throw new NullPointerException("input");
        }
        this.a = zzgnnVar;
        zzgnnVar.b = this;
    }

    public static final void r(int i) throws zzgoz {
        if ((i & 3) != 0) {
            throw zzgoz.e();
        }
    }

    public static final void s(int i) throws zzgoz {
        if ((i & 7) != 0) {
            throw zzgoz.e();
        }
    }

    public final void a(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof eu6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(zzgnnVar.zzo()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzn = zzgnnVar.zzn();
            s(iZzn);
            int iZzd = zzgnnVar.zzd() + iZzn;
            do {
                list.add(Long.valueOf(zzgnnVar.zzo()));
            } while (zzgnnVar.zzd() < iZzd);
            return;
        }
        eu6 eu6Var = (eu6) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                eu6Var.b(zzgnnVar.zzo());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzn2 = zzgnnVar.zzn();
        s(iZzn2);
        int iZzd2 = zzgnnVar.zzd() + iZzn2;
        do {
            eu6Var.b(zzgnnVar.zzo());
        } while (zzgnnVar.zzd() < iZzd2);
    }

    public final void b(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof vt6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iZzn = zzgnnVar.zzn();
                r(iZzn);
                int iZzd = zzgnnVar.zzd() + iZzn;
                do {
                    list.add(Float.valueOf(zzgnnVar.zzc()));
                } while (zzgnnVar.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzgoz.a();
            }
            do {
                list.add(Float.valueOf(zzgnnVar.zzc()));
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm = zzgnnVar.zzm();
                }
            } while (iZzm == this.b);
            this.d = iZzm;
            return;
        }
        vt6 vt6Var = (vt6) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iZzn2 = zzgnnVar.zzn();
            r(iZzn2);
            int iZzd2 = zzgnnVar.zzd() + iZzn2;
            do {
                vt6Var.b(zzgnnVar.zzc());
            } while (zzgnnVar.zzd() < iZzd2);
            return;
        }
        if (i2 != 5) {
            throw zzgoz.a();
        }
        do {
            vt6Var.b(zzgnnVar.zzc());
            if (zzgnnVar.zzC()) {
                return;
            } else {
                iZzm2 = zzgnnVar.zzm();
            }
        } while (iZzm2 == this.b);
        this.d = iZzm2;
    }

    @Deprecated
    public final void c(List list, wu6 wu6Var, zzgnz zzgnzVar) throws zzgoy {
        int iZzm;
        int i = this.b;
        if ((i & 7) != 3) {
            throw zzgoz.a();
        }
        do {
            list.add(n(wu6Var, zzgnzVar));
            zzgnn zzgnnVar = this.a;
            if (zzgnnVar.zzC() || this.d != 0) {
                return;
            } else {
                iZzm = zzgnnVar.zzm();
            }
        } while (iZzm == i);
        this.d = iZzm;
    }

    public final void d(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof yt6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(zzgnnVar.zzh()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzd = zzgnnVar.zzd() + zzgnnVar.zzn();
            do {
                list.add(Integer.valueOf(zzgnnVar.zzh()));
            } while (zzgnnVar.zzd() < iZzd);
            p(iZzd);
            return;
        }
        yt6 yt6Var = (yt6) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                yt6Var.zzh(zzgnnVar.zzh());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzd2 = zzgnnVar.zzd() + zzgnnVar.zzn();
        do {
            yt6Var.zzh(zzgnnVar.zzh());
        } while (zzgnnVar.zzd() < iZzd2);
        p(iZzd2);
    }

    public final void e(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof eu6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(zzgnnVar.zzp()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzd = zzgnnVar.zzd() + zzgnnVar.zzn();
            do {
                list.add(Long.valueOf(zzgnnVar.zzp()));
            } while (zzgnnVar.zzd() < iZzd);
            p(iZzd);
            return;
        }
        eu6 eu6Var = (eu6) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                eu6Var.b(zzgnnVar.zzp());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzd2 = zzgnnVar.zzd() + zzgnnVar.zzn();
        do {
            eu6Var.b(zzgnnVar.zzp());
        } while (zzgnnVar.zzd() < iZzd2);
        p(iZzd2);
    }

    public final void f(List list, wu6 wu6Var, zzgnz zzgnzVar) throws zzgoy {
        int iZzm;
        int i = this.b;
        if ((i & 7) != 2) {
            throw zzgoz.a();
        }
        do {
            list.add(o(wu6Var, zzgnzVar));
            zzgnn zzgnnVar = this.a;
            if (zzgnnVar.zzC() || this.d != 0) {
                return;
            } else {
                iZzm = zzgnnVar.zzm();
            }
        } while (iZzm == i);
        this.d = iZzm;
    }

    public final void g(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof yt6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iZzn = zzgnnVar.zzn();
                r(iZzn);
                int iZzd = zzgnnVar.zzd() + iZzn;
                do {
                    list.add(Integer.valueOf(zzgnnVar.zzk()));
                } while (zzgnnVar.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzgoz.a();
            }
            do {
                list.add(Integer.valueOf(zzgnnVar.zzk()));
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm = zzgnnVar.zzm();
                }
            } while (iZzm == this.b);
            this.d = iZzm;
            return;
        }
        yt6 yt6Var = (yt6) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iZzn2 = zzgnnVar.zzn();
            r(iZzn2);
            int iZzd2 = zzgnnVar.zzd() + iZzn2;
            do {
                yt6Var.zzh(zzgnnVar.zzk());
            } while (zzgnnVar.zzd() < iZzd2);
            return;
        }
        if (i2 != 5) {
            throw zzgoz.a();
        }
        do {
            yt6Var.zzh(zzgnnVar.zzk());
            if (zzgnnVar.zzC()) {
                return;
            } else {
                iZzm2 = zzgnnVar.zzm();
            }
        } while (iZzm2 == this.b);
        this.d = iZzm2;
    }

    public final void h(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof eu6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(zzgnnVar.zzt()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzn = zzgnnVar.zzn();
            s(iZzn);
            int iZzd = zzgnnVar.zzd() + iZzn;
            do {
                list.add(Long.valueOf(zzgnnVar.zzt()));
            } while (zzgnnVar.zzd() < iZzd);
            return;
        }
        eu6 eu6Var = (eu6) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                eu6Var.b(zzgnnVar.zzt());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzn2 = zzgnnVar.zzn();
        s(iZzn2);
        int iZzd2 = zzgnnVar.zzd() + iZzn2;
        do {
            eu6Var.b(zzgnnVar.zzt());
        } while (zzgnnVar.zzd() < iZzd2);
    }

    public final void i(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof yt6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(zzgnnVar.zzl()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzd = zzgnnVar.zzd() + zzgnnVar.zzn();
            do {
                list.add(Integer.valueOf(zzgnnVar.zzl()));
            } while (zzgnnVar.zzd() < iZzd);
            p(iZzd);
            return;
        }
        yt6 yt6Var = (yt6) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                yt6Var.zzh(zzgnnVar.zzl());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzd2 = zzgnnVar.zzd() + zzgnnVar.zzn();
        do {
            yt6Var.zzh(zzgnnVar.zzl());
        } while (zzgnnVar.zzd() < iZzd2);
        p(iZzd2);
    }

    public final void j(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof eu6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(zzgnnVar.zzu()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzd = zzgnnVar.zzd() + zzgnnVar.zzn();
            do {
                list.add(Long.valueOf(zzgnnVar.zzu()));
            } while (zzgnnVar.zzd() < iZzd);
            p(iZzd);
            return;
        }
        eu6 eu6Var = (eu6) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                eu6Var.b(zzgnnVar.zzu());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzd2 = zzgnnVar.zzd() + zzgnnVar.zzn();
        do {
            eu6Var.b(zzgnnVar.zzu());
        } while (zzgnnVar.zzd() < iZzd2);
        p(iZzd2);
    }

    public final void k(boolean z, List list) throws zzgoy {
        String strZzx;
        int iZzm;
        int iZzm2;
        if ((this.b & 7) != 2) {
            throw zzgoz.a();
        }
        boolean z2 = list instanceof zzgpf;
        zzgnn zzgnnVar = this.a;
        if (z2 && !z) {
            zzgpf zzgpfVar = (zzgpf) list;
            do {
                zzgpfVar.zzi(u());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        do {
            if (z) {
                q(2);
                strZzx = zzgnnVar.zzy();
            } else {
                q(2);
                strZzx = zzgnnVar.zzx();
            }
            list.add(strZzx);
            if (zzgnnVar.zzC()) {
                return;
            } else {
                iZzm = zzgnnVar.zzm();
            }
        } while (iZzm == this.b);
        this.d = iZzm;
    }

    public final void l(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof yt6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(zzgnnVar.zzn()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzd = zzgnnVar.zzd() + zzgnnVar.zzn();
            do {
                list.add(Integer.valueOf(zzgnnVar.zzn()));
            } while (zzgnnVar.zzd() < iZzd);
            p(iZzd);
            return;
        }
        yt6 yt6Var = (yt6) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                yt6Var.zzh(zzgnnVar.zzn());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzd2 = zzgnnVar.zzd() + zzgnnVar.zzn();
        do {
            yt6Var.zzh(zzgnnVar.zzn());
        } while (zzgnnVar.zzd() < iZzd2);
        p(iZzd2);
    }

    public final void m(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof eu6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(zzgnnVar.zzv()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzd = zzgnnVar.zzd() + zzgnnVar.zzn();
            do {
                list.add(Long.valueOf(zzgnnVar.zzv()));
            } while (zzgnnVar.zzd() < iZzd);
            p(iZzd);
            return;
        }
        eu6 eu6Var = (eu6) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                eu6Var.b(zzgnnVar.zzv());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzd2 = zzgnnVar.zzd() + zzgnnVar.zzn();
        do {
            eu6Var.b(zzgnnVar.zzv());
        } while (zzgnnVar.zzd() < iZzd2);
        p(iZzd2);
    }

    public final Object n(wu6 wu6Var, zzgnz zzgnzVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object objZze = wu6Var.zze();
            wu6Var.f(objZze, this, zzgnzVar);
            wu6Var.zzf(objZze);
            if (this.b != this.c) {
                throw zzgoz.e();
            }
            this.c = i;
            return objZze;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final Object o(wu6 wu6Var, zzgnz zzgnzVar) throws zzgoz {
        zzgnn zzgnnVar = this.a;
        int iZzn = zzgnnVar.zzn();
        if (zzgnnVar.a >= 100) {
            throw new zzgoz("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = zzgnnVar.zze(iZzn);
        Object objZze = wu6Var.zze();
        zzgnnVar.a++;
        wu6Var.f(objZze, this, zzgnzVar);
        wu6Var.zzf(objZze);
        zzgnnVar.zzz(0);
        zzgnnVar.a--;
        zzgnnVar.zzA(iZze);
        return objZze;
    }

    public final void p(int i) throws zzgoz {
        if (this.a.zzd() != i) {
            throw zzgoz.f();
        }
    }

    public final void q(int i) throws zzgoy {
        if ((this.b & 7) != i) {
            throw zzgoz.a();
        }
    }

    public final int t() {
        int iZzm = this.d;
        if (iZzm != 0) {
            this.b = iZzm;
            this.d = 0;
        } else {
            iZzm = this.a.zzm();
            this.b = iZzm;
        }
        if (iZzm == 0 || iZzm == this.c) {
            return Integer.MAX_VALUE;
        }
        return iZzm >>> 3;
    }

    public final zzgnf u() throws zzgoy {
        q(2);
        return this.a.zzw();
    }

    public final void v(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof ct6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(zzgnnVar.zzD()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzd = zzgnnVar.zzd() + zzgnnVar.zzn();
            do {
                list.add(Boolean.valueOf(zzgnnVar.zzD()));
            } while (zzgnnVar.zzd() < iZzd);
            p(iZzd);
            return;
        }
        ct6 ct6Var = (ct6) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                ct6Var.b(zzgnnVar.zzD());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzd2 = zzgnnVar.zzd() + zzgnnVar.zzn();
        do {
            ct6Var.b(zzgnnVar.zzD());
        } while (zzgnnVar.zzd() < iZzd2);
        p(iZzd2);
    }

    public final void w(List list) throws zzgoy {
        int iZzm;
        if ((this.b & 7) != 2) {
            throw zzgoz.a();
        }
        do {
            list.add(u());
            zzgnn zzgnnVar = this.a;
            if (zzgnnVar.zzC()) {
                return;
            } else {
                iZzm = zzgnnVar.zzm();
            }
        } while (iZzm == this.b);
        this.d = iZzm;
    }

    public final void x(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof pt6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(zzgnnVar.zzb()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzn = zzgnnVar.zzn();
            s(iZzn);
            int iZzd = zzgnnVar.zzd() + iZzn;
            do {
                list.add(Double.valueOf(zzgnnVar.zzb()));
            } while (zzgnnVar.zzd() < iZzd);
            return;
        }
        pt6 pt6Var = (pt6) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                pt6Var.b(zzgnnVar.zzb());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzn2 = zzgnnVar.zzn();
        s(iZzn2);
        int iZzd2 = zzgnnVar.zzd() + iZzn2;
        do {
            pt6Var.b(zzgnnVar.zzb());
        } while (zzgnnVar.zzd() < iZzd2);
    }

    public final void y(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof yt6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(zzgnnVar.zzf()));
                    if (zzgnnVar.zzC()) {
                        return;
                    } else {
                        iZzm = zzgnnVar.zzm();
                    }
                } while (iZzm == this.b);
                this.d = iZzm;
                return;
            }
            if (i != 2) {
                throw zzgoz.a();
            }
            int iZzd = zzgnnVar.zzd() + zzgnnVar.zzn();
            do {
                list.add(Integer.valueOf(zzgnnVar.zzf()));
            } while (zzgnnVar.zzd() < iZzd);
            p(iZzd);
            return;
        }
        yt6 yt6Var = (yt6) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                yt6Var.zzh(zzgnnVar.zzf());
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzgnnVar.zzm();
                }
            } while (iZzm2 == this.b);
            this.d = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgoz.a();
        }
        int iZzd2 = zzgnnVar.zzd() + zzgnnVar.zzn();
        do {
            yt6Var.zzh(zzgnnVar.zzf());
        } while (zzgnnVar.zzd() < iZzd2);
        p(iZzd2);
    }

    public final void z(List list) throws zzgoz {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof yt6;
        zzgnn zzgnnVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iZzn = zzgnnVar.zzn();
                r(iZzn);
                int iZzd = zzgnnVar.zzd() + iZzn;
                do {
                    list.add(Integer.valueOf(zzgnnVar.zzg()));
                } while (zzgnnVar.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzgoz.a();
            }
            do {
                list.add(Integer.valueOf(zzgnnVar.zzg()));
                if (zzgnnVar.zzC()) {
                    return;
                } else {
                    iZzm = zzgnnVar.zzm();
                }
            } while (iZzm == this.b);
            this.d = iZzm;
            return;
        }
        yt6 yt6Var = (yt6) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iZzn2 = zzgnnVar.zzn();
            r(iZzn2);
            int iZzd2 = zzgnnVar.zzd() + iZzn2;
            do {
                yt6Var.zzh(zzgnnVar.zzg());
            } while (zzgnnVar.zzd() < iZzd2);
            return;
        }
        if (i2 != 5) {
            throw zzgoz.a();
        }
        do {
            yt6Var.zzh(zzgnnVar.zzg());
            if (zzgnnVar.zzC()) {
                return;
            } else {
                iZzm2 = zzgnnVar.zzm();
            }
        } while (iZzm2 == this.b);
        this.d = iZzm2;
    }
}
