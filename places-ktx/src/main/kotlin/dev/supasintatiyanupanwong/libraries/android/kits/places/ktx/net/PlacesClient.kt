package dev.supasintatiyanupanwong.libraries.android.kits.places.ktx.net

import android.content.Context
import dev.supasintatiyanupanwong.libraries.android.kits.places.PlaceKit
import dev.supasintatiyanupanwong.libraries.android.kits.places.net.PlacesClient

@Suppress("NOTHING_TO_INLINE")
inline fun PlacesClient(context: Context): PlacesClient = PlaceKit.createClient(context)
