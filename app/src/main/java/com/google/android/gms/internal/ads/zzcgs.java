package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public class zzcgs implements zzcgf {
    public final String a;

    public zzcgs() {
        this.a = null;
    }

    public zzcgs(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public boolean zza(String str) {
        boolean z = false;
        try {
            zzcgn.zze("Pinging URL: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                String str2 = this.a;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                zzcgm zzcgmVar = new zzcgm(null);
                zzcgmVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzcgmVar.zze(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    zzcgn.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                } else {
                    z = true;
                }
                return z;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            zzcgn.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            zzcgn.zzj("Error while parsing ping URL: " + str + ". " + e2.getMessage());
        } catch (RuntimeException e3) {
            e = e3;
            zzcgn.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
        }
    }
}
