package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfec {
    public final Pattern a;

    public zzfec() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfT));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.a = patternCompile;
    }

    public final String zza(String str) {
        Pattern pattern = this.a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
