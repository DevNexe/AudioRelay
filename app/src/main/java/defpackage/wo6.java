package defpackage;

import com.google.android.gms.internal.ads.zzbfj;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wo6 extends pp6 implements ListIterator {
    public wo6(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // defpackage.pp6
    public final Object a(Object obj) {
        return ((zzbfj) obj).name();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        b(obj);
        throw null;
    }

    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean hasPrevious() {
        return ((ListIterator) this.w).hasPrevious();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int nextIndex() {
        return ((ListIterator) this.w).nextIndex();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object previous() {
        return a(((ListIterator) this.w).previous());
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int previousIndex() {
        return ((ListIterator) this.w).previousIndex();
    }

    public final void g(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        g(obj);
        throw null;
    }
}
