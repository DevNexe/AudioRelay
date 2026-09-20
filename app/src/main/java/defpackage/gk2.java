package defpackage;

import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class gk2 implements Comparator<Comparable<? super Object>>, j$.util.Comparator {
    public static final gk2 w = new gk2();

    @Override // java.util.Comparator, j$.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator<Comparable<Object>> reversed() {
        return cs3.w;
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function) {
        return j$.util.Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return j$.util.Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return j$.util.Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function) {
        return j$.util.Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Comparator
    public final /* synthetic */ Comparator<Comparable<? super Object>> thenComparing(java.util.function.Function function, Comparator comparator) {
        return j$.util.Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function), comparator);
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return j$.util.Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ Comparator<Comparable<? super Object>> thenComparingDouble(java.util.function.ToDoubleFunction<? super Comparable<? super Object>> toDoubleFunction) {
        return j$.util.Comparator.CC.$default$thenComparingDouble(this, ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return j$.util.Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ Comparator<Comparable<? super Object>> thenComparingInt(java.util.function.ToIntFunction<? super Comparable<? super Object>> toIntFunction) {
        return j$.util.Comparator.CC.$default$thenComparingInt(this, ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return j$.util.Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ Comparator<Comparable<? super Object>> thenComparingLong(java.util.function.ToLongFunction<? super Comparable<? super Object>> toLongFunction) {
        return j$.util.Comparator.CC.$default$thenComparingLong(this, ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }
}
