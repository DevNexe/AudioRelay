package com.google.android.gms.internal.ads;

import defpackage.ew6;
import j$.util.function.Consumer;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class zzguc implements Iterator, Closeable, zzalo, j$.util.Iterator {
    public static final ew6 C = new ew6();
    public zzalk w;
    public zzgud x;
    public zzaln y = null;
    public long z = 0;
    public long A = 0;
    public final ArrayList B = new ArrayList();

    static {
        zzguj.zzb(zzguc.class);
    }

    public void close() {
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        zzaln zzalnVar = this.y;
        ew6 ew6Var = C;
        if (zzalnVar == ew6Var) {
            return false;
        }
        if (zzalnVar != null) {
            return true;
        }
        try {
            this.y = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.y = ew6Var;
            return false;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzaln) arrayList.get(i)).toString());
            i++;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzaln next() {
        zzaln zzalnVarZzb;
        zzaln zzalnVar = this.y;
        if (zzalnVar != null && zzalnVar != C) {
            this.y = null;
            return zzalnVar;
        }
        zzgud zzgudVar = this.x;
        if (zzgudVar == null || this.z >= this.A) {
            this.y = C;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzgudVar) {
                this.x.zze(this.z);
                zzalnVarZzb = this.w.zzb(this.x, this);
                this.z = this.x.zzb();
            }
            return zzalnVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        zzgud zzgudVar = this.x;
        ArrayList arrayList = this.B;
        return (zzgudVar == null || this.y == C) ? arrayList : new zzgui(arrayList, this);
    }

    public final void zzf(zzgud zzgudVar, long j, zzalk zzalkVar) {
        this.x = zzgudVar;
        this.z = zzgudVar.zzb();
        zzgudVar.zze(zzgudVar.zzb() + j);
        this.A = zzgudVar.zzb();
        this.w = zzalkVar;
    }
}
