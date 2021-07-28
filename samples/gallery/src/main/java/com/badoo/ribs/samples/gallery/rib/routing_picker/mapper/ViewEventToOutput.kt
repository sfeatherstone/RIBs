package com.badoo.ribs.samples.gallery.rib.routing_picker.mapper

import com.badoo.ribs.samples.gallery.rib.routing_picker.RoutingPicker
import com.badoo.ribs.samples.gallery.rib.routing_picker.RoutingPicker.Output.*
import com.badoo.ribs.samples.gallery.rib.routing_picker.RoutingPickerView.Event

internal object ViewEventToOutput : (Event) -> RoutingPicker.Output? {

    override fun invoke(event: Event): RoutingPicker.Output =
        when (event) {
            Event.SimpleRoutingClicked -> SimpleRoutingSelected
            Event.BackStackClicked -> BackStackSelected
            Event.TransitionsClicked -> TransitionsSelected
        }
}
