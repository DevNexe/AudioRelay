package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfss;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cn6 implements Iterator, j$.util.Iterator {
    public int A;

    @CheckForNull
    public String w;
    public final CharSequence y;
    public int x = 2;
    public int z = 0;

    public cn6(zzfss zzfssVar, CharSequence charSequence) {
        tm6 tm6Var = zzfssVar.a;
        this.A = Integer.MAX_VALUE;
        this.y = charSequence;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        int iD;
        zzfsf.zzh(this.x != 4);
        int i = this.x;
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.x = 4;
            int i3 = this.z;
            while (true) {
                int i4 = this.z;
                if (i4 == -1) {
                    this.x = 3;
                    break;
                }
                int iE = e(i4);
                CharSequence charSequence = this.y;
                if (iE == -1) {
                    iE = charSequence.length();
                    this.z = -1;
                    iD = -1;
                } else {
                    iD = d(iE);
                    this.z = iD;
                }
                if (iD != i3) {
                    if (i3 < iE) {
                        charSequence.charAt(i3);
                    }
                    if (i3 < iE) {
                        charSequence.charAt(iE - 1);
                    }
                    int i5 = this.A;
                    if (i5 == 1) {
                        iE = charSequence.length();
                        this.z = -1;
                        if (iE > i3) {
                            charSequence.charAt(iE - 1);
                        }
                    } else {
                        this.A = i5 - 1;
                    }
                    string = charSequence.subSequence(i3, iE).toString();
                    break;
                }
                int i6 = iD + 1;
                this.z = i6;
                if (i6 > charSequence.length()) {
                    this.z = -1;
                }
            }
            this.w = string;
            if (this.x != 3) {
                this.x = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.x = 2;
        String str = this.w;
        this.w = null;
        return str;
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public abstract int d(int i);

    public abstract int e(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: forEachRemaining$com$google$android$gms$internal$ads$zzfrl, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
