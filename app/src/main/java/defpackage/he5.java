package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.TypeCastException;

/* JADX INFO: loaded from: classes3.dex */
public final class he5 {
    public static void a(Context context, Locale locale) {
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        int i = Build.VERSION.SDK_INT;
        if (ur1.a(i >= 24 ? configuration.getLocales().get(0) : configuration.locale, locale)) {
            return;
        }
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (i >= 24) {
            Locale[] localeArr = {locale};
            LinkedHashSet linkedHashSet = new LinkedHashSet(C0239D.A(1));
            oV9.i0(linkedHashSet, localeArr);
            LocaleList localeList = LocaleList.getDefault();
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(localeList.get(i2));
            }
            linkedHashSet.addAll(arrayList);
            Object[] array = linkedHashSet.toArray(new Locale[0]);
            if (array == null) {
                throw new TypeCastException(0);
            }
            Locale[] localeArr2 = (Locale[]) array;
            configuration2.setLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr2, localeArr2.length)));
        } else {
            configuration2.setLocale(locale);
        }
        resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
    }
}
