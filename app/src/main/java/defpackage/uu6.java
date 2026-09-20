package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgrm;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class uu6 implements Iterator, j$.util.Iterator {
    public final /* synthetic */ int w = 0;
    public final Object x;
    public Iterable y;

    public uu6(zzgnf zzgnfVar) {
        if (!(zzgnfVar instanceof vu6)) {
            this.x = null;
            this.y = (gt6) zzgnfVar;
            return;
        }
        vu6 vu6Var = (vu6) zzgnfVar;
        ArrayDeque arrayDeque = new ArrayDeque(vu6Var.B);
        this.x = arrayDeque;
        arrayDeque.push(vu6Var);
        this.y = b(vu6Var.y);
    }

    public final gt6 a() {
        gt6 gt6VarB;
        gt6 gt6Var = (gt6) this.y;
        if (gt6Var == null) {
            throw new NoSuchElementException();
        }
        do {
            Object obj = this.x;
            ArrayDeque arrayDeque = (ArrayDeque) obj;
            gt6VarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            gt6VarB = b(((vu6) ((ArrayDeque) obj).pop()).z);
        } while (gt6VarB.zzD());
        this.y = gt6VarB;
        return gt6Var;
    }

    public final gt6 b(zzgnf zzgnfVar) {
        while (zzgnfVar instanceof vu6) {
            vu6 vu6Var = (vu6) zzgnfVar;
            ((ArrayDeque) this.x).push(vu6Var);
            zzgnfVar = vu6Var.y;
        }
        return (gt6) zzgnfVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.w) {
            case 0:
                j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
                break;
            default:
                j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.w) {
        }
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        switch (this.w) {
            case 0:
                return ((gt6) this.y) != null;
            default:
                return ((Iterator) this.x).hasNext();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.w) {
            case 0:
                return a();
            default:
                return (String) ((Iterator) this.x).next();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        switch (this.w) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public uu6(zzgrm zzgrmVar) {
        this.y = zzgrmVar;
        this.x = zzgrmVar.w.iterator();
    }
}
