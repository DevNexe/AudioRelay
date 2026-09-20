package defpackage;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c52 {
    public static final c52 a = new c52();

    public final Object a(z42 z42Var) {
        ArrayList arrayList = new ArrayList(mu.w0(z42Var, 10));
        Iterator<y42> it = z42Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((XX) it.next().a).a);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(UH8 uh8, z42 z42Var) {
        ArrayList arrayList = new ArrayList(mu.w0(z42Var, 10));
        Iterator<y42> it = z42Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((XX) it.next().a).a);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Locale[] localeArr = (Locale[]) array;
        uh8.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
